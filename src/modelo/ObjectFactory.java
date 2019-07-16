//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.06.28 a las 09:48:24 AM CEST 
//


package modelo;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the modelo package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: modelo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Pedidos }
     * 
     */
    public Pedidos createPedidos() {
        return new Pedidos();
    }

    /**
     * Create an instance of {@link Pedidos.Pedido }
     * 
     */
    public Pedidos.Pedido createPedidosPedido() {
        return new Pedidos.Pedido();
    }

    /**
     * Create an instance of {@link Pedidos.Pedido.Lineas }
     * 
     */
    public Pedidos.Pedido.Lineas createPedidosPedidoLineas() {
        return new Pedidos.Pedido.Lineas();
    }

    /**
     * Create an instance of {@link Pedidos.Pedido.Lineas.Linea }
     * 
     */
    public Pedidos.Pedido.Lineas.Linea createPedidosPedidoLineasLinea() {
        return new Pedidos.Pedido.Lineas.Linea();
    }

    /**
     * Create an instance of {@link Pedidos.Pedido.Lineas.Linea.Lotes }
     * 
     */
    public Pedidos.Pedido.Lineas.Linea.Lotes createPedidosPedidoLineasLineaLotes() {
        return new Pedidos.Pedido.Lineas.Linea.Lotes();
    }

    /**
     * Create an instance of {@link Pedidos.Pedido.Destino }
     * 
     */
    public Pedidos.Pedido.Destino createPedidosPedidoDestino() {
        return new Pedidos.Pedido.Destino();
    }

    /**
     * Create an instance of {@link Pedidos.CabeceraDocumento }
     * 
     */
    public Pedidos.CabeceraDocumento createPedidosCabeceraDocumento() {
        return new Pedidos.CabeceraDocumento();
    }

    /**
     * Create an instance of {@link Pedidos.CabeceraDocumento.Consignatario }
     * 
     */
    public Pedidos.CabeceraDocumento.Consignatario createPedidosCabeceraDocumentoConsignatario() {
        return new Pedidos.CabeceraDocumento.Consignatario();
    }

    /**
     * Create an instance of {@link Pedidos.Pedido.Cabecera }
     * 
     */
    public Pedidos.Pedido.Cabecera createPedidosPedidoCabecera() {
        return new Pedidos.Pedido.Cabecera();
    }

    /**
     * Create an instance of {@link Pedidos.Pedido.Lineas.Linea.Lotes.Lote }
     * 
     */
    public Pedidos.Pedido.Lineas.Linea.Lotes.Lote createPedidosPedidoLineasLineaLotesLote() {
        return new Pedidos.Pedido.Lineas.Linea.Lotes.Lote();
    }

    /**
     * Create an instance of {@link Pedidos.Pedido.Destino.Cliente }
     * 
     */
    public Pedidos.Pedido.Destino.Cliente createPedidosPedidoDestinoCliente() {
        return new Pedidos.Pedido.Destino.Cliente();
    }

    /**
     * Create an instance of {@link Pedidos.CabeceraDocumento.Consignatario.Cliente }
     * 
     */
    public Pedidos.CabeceraDocumento.Consignatario.Cliente createPedidosCabeceraDocumentoConsignatarioCliente() {
        return new Pedidos.CabeceraDocumento.Consignatario.Cliente();
    }

}
