package control;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.sap.aii.mapping.api.AbstractTransformation;
import com.sap.aii.mapping.api.StreamTransformationException;
import com.sap.aii.mapping.api.TransformationInput;
import com.sap.aii.mapping.api.TransformationOutput;

import modelo.Pedidos;
import modelo.Pedidos.Pedido;
import modelo.Pedidos.Pedido.Lineas;
import modelo.Pedidos.Pedido.Lineas.Linea;
import modelo.Pedidos.Pedido.Lineas.Linea.Lotes;
import modelo.Pedidos.Pedido.Lineas.Linea.Lotes.Lote;

public class MapeoLotes extends AbstractTransformation {

	public void transform(TransformationInput in, TransformationOutput out) throws StreamTransformationException {

		OutputStream outp = out.getOutputPayload().getOutputStream();
		InputStream io = in.getInputPayload().getInputStream();

		Pedidos mipedido;

		mipedido = leerXml(io);
		runable(mipedido);
		generarXml(mipedido, out.getOutputPayload().getOutputStream());
	}

	protected Pedidos runable(Pedidos mipedido) {
		Pedido pedido;
		List<Pedido> listPedido = mipedido.getPedido();

		for (int i = 0; listPedido.size() > i; i++) {

			pedido = listPedido.get(i);
			Lineas lineas = pedido.getLineas();
			List<Linea> linea = lineas.getLinea();
			Lineas nuevalineas = new Lineas();
			for (int j = 0; j < linea.size(); j++) {
				cargarLotes(linea.get(j), nuevalineas);
				pedido.setLineas(nuevalineas);
			}
			linea = null;
			// mipedido.getPedido().add(pedido);
		}
		return mipedido;

	}

	protected void cargarLotes(Linea linea, Lineas lineas) {
		String codArt, numLinea, num_Entrega, descripcion, ean, posPadre;
		codArt = linea.getCodigoArticulo();
		num_Entrega = linea.getNumEntrega();
		numLinea = linea.getNumLinea();
		descripcion = linea.getDescripcion();
		ean = linea.getEan();
		posPadre = linea.getPosicionPadre();
		int contador = 90000;
		
		Lotes lotes = linea.getLotes();
		Linea nuevalinea = new Linea();
		Lote loteold;
		Lotes lotesNew = new Lotes();

		Lote loteNew = new Lote();
		if (lotes.getLote().isEmpty()) {
			// creo la estructura otra vez
			nuevalinea.setLotes(lotesNew);
			// se lo meto al padre
			lotesNew.getLote().add(inilote("", linea.getCantidad()));
			// relleno los elementos de la linea
			nuevalinea = rellenarLinea(nuevalinea, codArt, numLinea, num_Entrega, descripcion, ean, posPadre);
			// se lo meto al objeto lineas
			lineas.getLinea().add(nuevalinea);
			// reseteo todo
			nuevalinea = new Linea();
			lotesNew = new Lotes();
			nuevalinea.setLotes(lotesNew);
		} else {

			List<Lote> listalotes = lotes.getLote();

			if (listalotes.size() > 1) {

				// creo la estructura otra vez
				nuevalinea.setLotes(lotesNew);
				// se lo meto al padre
				lotesNew.getLote().add(inilote("0", "0"));
				// relleno los elementos de la linea
				nuevalinea = rellenarLinea(nuevalinea, codArt, numLinea, num_Entrega, descripcion, ean, posPadre);
				// se lo meto al objeto lineas
				lineas.getLinea().add(nuevalinea);
				// reseteo todo
				nuevalinea = new Linea();
				lotesNew = new Lotes();
				nuevalinea.setLotes(lotesNew);
				// lo reseteo otra vez

				Integer numlotes = listalotes.size();
				nuevalinea.setLotes(lotesNew);
				
				for (int i = 0; i < numlotes; i++) {
					// nuevalinea = new Linea();

					loteold = listalotes.get(i);

					lotesNew.getLote().add(loteold);
					// relleno los elementos de la linea
					 contador +=1;
					nuevalinea = rellenarLinea(nuevalinea, codArt, contador + "", num_Entrega, descripcion, ean,
							numLinea);

					// se lo meto al padre
					lineas.getLinea().add(nuevalinea);
					// me creo una nueva linea
					nuevalinea = new Linea();
					lotesNew = new Lotes();
					nuevalinea.setLotes(lotesNew);
				}

			} else {
				lineas.getLinea().add(linea);

			}
		}

	}

	public Linea rellenarLinea(Linea linea, String codArt, String numLinea, String num_Entrega, String descripcion,
			String ean, String posPadre) {

		linea.setCodigoArticulo(codArt);
		linea.setNumEntrega(num_Entrega);
		linea.setNumLinea(numLinea);
		linea.setDescripcion(descripcion);
		linea.setEan(ean);
		linea.setPosicionPadre(posPadre);
		return linea;
	}

	protected Lote inilote(String numero, String unidades) {
		Lote lote = new Lote();
		if (!numero.equals(""))
			lote.setNumero(numero);
		lote.setUnidades(unidades);

		return lote;
	}

	protected Pedidos leerXml(InputStream io) {
		Pedidos pedidos = null;
		try {
			JAXBContext context = JAXBContext.newInstance(Pedidos.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			pedidos = (Pedidos) unmarshaller.unmarshal(io);

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pedidos;

	}

	protected void generarXml(Pedidos pedido, OutputStream out) {
		JAXBContext contexto;
		try {
			contexto = JAXBContext.newInstance(pedido.getClass());
			Marshaller organizador = contexto.createMarshaller();
			organizador.marshal(pedido, out);

		} catch (JAXBException e) {

			e.printStackTrace();
		}

	}

}
