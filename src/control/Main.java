package control;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import modelo.Pedidos;

public class Main {

	public static void main(String[] args) {
		File f = new File("src/test.xml");
		File fout = new File("src/out.xml");
		Pedidos mipedido;
		MapeoLotes mapeo = new MapeoLotes();
		try {
			FileOutputStream fous = new FileOutputStream(fout);
			FileInputStream fis = new FileInputStream(f);
			mipedido = mapeo.leerXml(fis);
			mipedido = mapeo.runable(mipedido);

			mapeo.generarXml(mipedido, fous);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
