//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.06.28 a las 09:48:24 AM CEST 
//


package modelo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlRootElement(name = "Pedidos")
public class Pedidos {

   
    protected String tipo;
    
    protected Pedidos.CabeceraDocumento cabeceraDocumento;
    @XmlElement(name = "Pedido")
    protected List<Pedidos.Pedido> pedido;

    @XmlElement(name = "Tipo")
    public String getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }
    @XmlElement(name = "cabecera_documento")
    public Pedidos.CabeceraDocumento getCabeceraDocumento() {
        return cabeceraDocumento;
    }

    public void setCabeceraDocumento(Pedidos.CabeceraDocumento value) {
        this.cabeceraDocumento = value;
    }

  
    public List<Pedidos.Pedido> getPedido() {
        if (pedido == null) {
            pedido = new ArrayList<Pedidos.Pedido>();
        }
        return this.pedido;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="fecha_documento" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="hora_documento" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="consignatario">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="cliente">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="razon_social" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="nif" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="codigo_postal" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="poblacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="provincia" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="pais" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="persona_contacto" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="mail" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fechaDocumento",
        "horaDocumento",
        "consignatario"
    })
    public static class CabeceraDocumento {

        @XmlElement(name = "fecha_documento", required = true)
        protected String fechaDocumento;
        @XmlElement(name = "hora_documento", required = true)
        protected String horaDocumento;
        @XmlElement(required = true)
        protected Pedidos.CabeceraDocumento.Consignatario consignatario;

        /**
         * Obtiene el valor de la propiedad fechaDocumento.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFechaDocumento() {
            return fechaDocumento;
        }

        /**
         * Define el valor de la propiedad fechaDocumento.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFechaDocumento(String value) {
            this.fechaDocumento = value;
        }

        /**
         * Obtiene el valor de la propiedad horaDocumento.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHoraDocumento() {
            return horaDocumento;
        }

        /**
         * Define el valor de la propiedad horaDocumento.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHoraDocumento(String value) {
            this.horaDocumento = value;
        }

        /**
         * Obtiene el valor de la propiedad consignatario.
         * 
         * @return
         *     possible object is
         *     {@link Pedidos.CabeceraDocumento.Consignatario }
         *     
         */
        public Pedidos.CabeceraDocumento.Consignatario getConsignatario() {
            return consignatario;
        }

        /**
         * Define el valor de la propiedad consignatario.
         * 
         * @param value
         *     allowed object is
         *     {@link Pedidos.CabeceraDocumento.Consignatario }
         *     
         */
        public void setConsignatario(Pedidos.CabeceraDocumento.Consignatario value) {
            this.consignatario = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="cliente">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="razon_social" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="nif" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="codigo_postal" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="poblacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="provincia" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="pais" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="persona_contacto" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="mail" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "cliente"
        })
        public static class Consignatario {

            @XmlElement(required = true)
            protected Pedidos.CabeceraDocumento.Consignatario.Cliente cliente;

            /**
             * Obtiene el valor de la propiedad cliente.
             * 
             * @return
             *     possible object is
             *     {@link Pedidos.CabeceraDocumento.Consignatario.Cliente }
             *     
             */
            public Pedidos.CabeceraDocumento.Consignatario.Cliente getCliente() {
                return cliente;
            }

            /**
             * Define el valor de la propiedad cliente.
             * 
             * @param value
             *     allowed object is
             *     {@link Pedidos.CabeceraDocumento.Consignatario.Cliente }
             *     
             */
            public void setCliente(Pedidos.CabeceraDocumento.Consignatario.Cliente value) {
                this.cliente = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="razon_social" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="nif" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="codigo_postal" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="poblacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="provincia" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="pais" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="persona_contacto" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="mail" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "codigo",
                "razonSocial",
                "nif",
                "direccion",
                "codigoPostal",
                "poblacion",
                "provincia",
                "pais",
                "telefono",
                "fax",
                "personaContacto",
                "mail"
            })
            public static class Cliente {

                @XmlElement(required = true)
                protected String codigo;
                @XmlElement(name = "razon_social", required = true)
                protected String razonSocial;
                @XmlElement(required = true)
                protected String nif;
                @XmlElement(required = true)
                protected String direccion;
                @XmlElement(name = "codigo_postal", required = true)
                protected String codigoPostal;
                @XmlElement(required = true)
                protected String poblacion;
                @XmlElement(required = true)
                protected String provincia;
                @XmlElement(required = true)
                protected String pais;
                @XmlElement(required = true)
                protected String telefono;
                @XmlElement(required = true)
                protected String fax;
                @XmlElement(name = "persona_contacto", required = true)
                protected String personaContacto;
                @XmlElement(required = true)
                protected String mail;

                /**
                 * Obtiene el valor de la propiedad codigo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodigo() {
                    return codigo;
                }

                /**
                 * Define el valor de la propiedad codigo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodigo(String value) {
                    this.codigo = value;
                }

                /**
                 * Obtiene el valor de la propiedad razonSocial.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRazonSocial() {
                    return razonSocial;
                }

                /**
                 * Define el valor de la propiedad razonSocial.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRazonSocial(String value) {
                    this.razonSocial = value;
                }

                /**
                 * Obtiene el valor de la propiedad nif.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNif() {
                    return nif;
                }

                /**
                 * Define el valor de la propiedad nif.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNif(String value) {
                    this.nif = value;
                }

                /**
                 * Obtiene el valor de la propiedad direccion.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDireccion() {
                    return direccion;
                }

                /**
                 * Define el valor de la propiedad direccion.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDireccion(String value) {
                    this.direccion = value;
                }

                /**
                 * Obtiene el valor de la propiedad codigoPostal.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodigoPostal() {
                    return codigoPostal;
                }

                /**
                 * Define el valor de la propiedad codigoPostal.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodigoPostal(String value) {
                    this.codigoPostal = value;
                }

                /**
                 * Obtiene el valor de la propiedad poblacion.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPoblacion() {
                    return poblacion;
                }

                /**
                 * Define el valor de la propiedad poblacion.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPoblacion(String value) {
                    this.poblacion = value;
                }

                /**
                 * Obtiene el valor de la propiedad provincia.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getProvincia() {
                    return provincia;
                }

                /**
                 * Define el valor de la propiedad provincia.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setProvincia(String value) {
                    this.provincia = value;
                }

                /**
                 * Obtiene el valor de la propiedad pais.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPais() {
                    return pais;
                }

                /**
                 * Define el valor de la propiedad pais.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPais(String value) {
                    this.pais = value;
                }

                /**
                 * Obtiene el valor de la propiedad telefono.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTelefono() {
                    return telefono;
                }

                /**
                 * Define el valor de la propiedad telefono.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTelefono(String value) {
                    this.telefono = value;
                }

                /**
                 * Obtiene el valor de la propiedad fax.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFax() {
                    return fax;
                }

                /**
                 * Define el valor de la propiedad fax.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFax(String value) {
                    this.fax = value;
                }

                /**
                 * Obtiene el valor de la propiedad personaContacto.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPersonaContacto() {
                    return personaContacto;
                }

                /**
                 * Define el valor de la propiedad personaContacto.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPersonaContacto(String value) {
                    this.personaContacto = value;
                }

                /**
                 * Obtiene el valor de la propiedad mail.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMail() {
                    return mail;
                }

                /**
                 * Define el valor de la propiedad mail.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMail(String value) {
                    this.mail = value;
                }

            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="cabecera">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="numero_pedido" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="fecha_pedido" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="fecha_salida_almacen" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="fecha_entrega" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="descripcion_estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="destino">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="cliente">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="razon_social" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="nif" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="codigo_postal" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="poblacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="provincia" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="pais" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="persona_contacto" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="mail" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="lineas">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="linea" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="codigo_articulo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="num_linea" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="num_entrega" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="cod_interno_articulo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="ean" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="PosicionPadre" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="lotes">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="lote" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="unidades" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cabecera",
        "destino",
        "lineas"
    })
    public static class Pedido {

        @XmlElement(required = true)
        protected Pedidos.Pedido.Cabecera cabecera;
        @XmlElement(required = true)
        protected Pedidos.Pedido.Destino destino;
        @XmlElement(required = true)
        protected Pedidos.Pedido.Lineas lineas;

        /**
         * Obtiene el valor de la propiedad cabecera.
         * 
         * @return
         *     possible object is
         *     {@link Pedidos.Pedido.Cabecera }
         *     
         */
        public Pedidos.Pedido.Cabecera getCabecera() {
            return cabecera;
        }

        /**
         * Define el valor de la propiedad cabecera.
         * 
         * @param value
         *     allowed object is
         *     {@link Pedidos.Pedido.Cabecera }
         *     
         */
        public void setCabecera(Pedidos.Pedido.Cabecera value) {
            this.cabecera = value;
        }

        /**
         * Obtiene el valor de la propiedad destino.
         * 
         * @return
         *     possible object is
         *     {@link Pedidos.Pedido.Destino }
         *     
         */
        public Pedidos.Pedido.Destino getDestino() {
            return destino;
        }

        /**
         * Define el valor de la propiedad destino.
         * 
         * @param value
         *     allowed object is
         *     {@link Pedidos.Pedido.Destino }
         *     
         */
        public void setDestino(Pedidos.Pedido.Destino value) {
            this.destino = value;
        }

        /**
         * Obtiene el valor de la propiedad lineas.
         * 
         * @return
         *     possible object is
         *     {@link Pedidos.Pedido.Lineas }
         *     
         */
        public Pedidos.Pedido.Lineas getLineas() {
            return lineas;
        }

        /**
         * Define el valor de la propiedad lineas.
         * 
         * @param value
         *     allowed object is
         *     {@link Pedidos.Pedido.Lineas }
         *     
         */
        public void setLineas(Pedidos.Pedido.Lineas value) {
            this.lineas = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="numero_pedido" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="fecha_pedido" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="fecha_salida_almacen" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="fecha_entrega" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="descripcion_estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "numeroPedido",
            "fechaPedido",
            "fechaSalidaAlmacen",
            "fechaEntrega",
            "estado",
            "descripcionEstado"
        })
        public static class Cabecera {

            @XmlElement(name = "numero_pedido", required = true)
            protected String numeroPedido;
            @XmlElement(name = "fecha_pedido", required = true)
            protected String fechaPedido;
            @XmlElement(name = "fecha_salida_almacen", required = true)
            protected String fechaSalidaAlmacen;
            @XmlElement(name = "fecha_entrega", required = true)
            protected String fechaEntrega;
            @XmlElement(required = true)
            protected String estado;
            @XmlElement(name = "descripcion_estado", required = true)
            protected String descripcionEstado;

            /**
             * Obtiene el valor de la propiedad numeroPedido.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroPedido() {
                return numeroPedido;
            }

            /**
             * Define el valor de la propiedad numeroPedido.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroPedido(String value) {
                this.numeroPedido = value;
            }

            /**
             * Obtiene el valor de la propiedad fechaPedido.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFechaPedido() {
                return fechaPedido;
            }

            /**
             * Define el valor de la propiedad fechaPedido.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFechaPedido(String value) {
                this.fechaPedido = value;
            }

            /**
             * Obtiene el valor de la propiedad fechaSalidaAlmacen.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFechaSalidaAlmacen() {
                return fechaSalidaAlmacen;
            }

            /**
             * Define el valor de la propiedad fechaSalidaAlmacen.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFechaSalidaAlmacen(String value) {
                this.fechaSalidaAlmacen = value;
            }

            /**
             * Obtiene el valor de la propiedad fechaEntrega.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFechaEntrega() {
                return fechaEntrega;
            }

            /**
             * Define el valor de la propiedad fechaEntrega.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFechaEntrega(String value) {
                this.fechaEntrega = value;
            }

            /**
             * Obtiene el valor de la propiedad estado.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEstado() {
                return estado;
            }

            /**
             * Define el valor de la propiedad estado.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEstado(String value) {
                this.estado = value;
            }

            /**
             * Obtiene el valor de la propiedad descripcionEstado.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescripcionEstado() {
                return descripcionEstado;
            }

            /**
             * Define el valor de la propiedad descripcionEstado.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescripcionEstado(String value) {
                this.descripcionEstado = value;
            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="cliente">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="razon_social" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="nif" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="codigo_postal" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="poblacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="provincia" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="pais" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="persona_contacto" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="mail" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "cliente"
        })
        public static class Destino {

            @XmlElement(required = true)
            protected Pedidos.Pedido.Destino.Cliente cliente;

            /**
             * Obtiene el valor de la propiedad cliente.
             * 
             * @return
             *     possible object is
             *     {@link Pedidos.Pedido.Destino.Cliente }
             *     
             */
            public Pedidos.Pedido.Destino.Cliente getCliente() {
                return cliente;
            }

            /**
             * Define el valor de la propiedad cliente.
             * 
             * @param value
             *     allowed object is
             *     {@link Pedidos.Pedido.Destino.Cliente }
             *     
             */
            public void setCliente(Pedidos.Pedido.Destino.Cliente value) {
                this.cliente = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="razon_social" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="nif" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="codigo_postal" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="poblacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="provincia" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="pais" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="persona_contacto" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="mail" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "codigo",
                "razonSocial",
                "nif",
                "direccion",
                "codigoPostal",
                "poblacion",
                "provincia",
                "pais",
                "telefono",
                "fax",
                "personaContacto",
                "mail"
            })
            public static class Cliente {

                @XmlElement(required = true)
                protected String codigo;
                @XmlElement(name = "razon_social", required = true)
                protected String razonSocial;
                @XmlElement(required = true)
                protected String nif;
                @XmlElement(required = true)
                protected String direccion;
                @XmlElement(name = "codigo_postal", required = true)
                protected String codigoPostal;
                @XmlElement(required = true)
                protected String poblacion;
                @XmlElement(required = true)
                protected String provincia;
                @XmlElement(required = true)
                protected String pais;
                @XmlElement(required = true)
                protected String telefono;
                @XmlElement(required = true)
                protected String fax;
                @XmlElement(name = "persona_contacto", required = true)
                protected String personaContacto;
                @XmlElement(required = true)
                protected String mail;

                /**
                 * Obtiene el valor de la propiedad codigo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodigo() {
                    return codigo;
                }

                /**
                 * Define el valor de la propiedad codigo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodigo(String value) {
                    this.codigo = value;
                }

                /**
                 * Obtiene el valor de la propiedad razonSocial.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRazonSocial() {
                    return razonSocial;
                }

                /**
                 * Define el valor de la propiedad razonSocial.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRazonSocial(String value) {
                    this.razonSocial = value;
                }

                /**
                 * Obtiene el valor de la propiedad nif.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNif() {
                    return nif;
                }

                /**
                 * Define el valor de la propiedad nif.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNif(String value) {
                    this.nif = value;
                }

                /**
                 * Obtiene el valor de la propiedad direccion.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDireccion() {
                    return direccion;
                }

                /**
                 * Define el valor de la propiedad direccion.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDireccion(String value) {
                    this.direccion = value;
                }

                /**
                 * Obtiene el valor de la propiedad codigoPostal.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodigoPostal() {
                    return codigoPostal;
                }

                /**
                 * Define el valor de la propiedad codigoPostal.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodigoPostal(String value) {
                    this.codigoPostal = value;
                }

                /**
                 * Obtiene el valor de la propiedad poblacion.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPoblacion() {
                    return poblacion;
                }

                /**
                 * Define el valor de la propiedad poblacion.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPoblacion(String value) {
                    this.poblacion = value;
                }

                /**
                 * Obtiene el valor de la propiedad provincia.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getProvincia() {
                    return provincia;
                }

                /**
                 * Define el valor de la propiedad provincia.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setProvincia(String value) {
                    this.provincia = value;
                }

                /**
                 * Obtiene el valor de la propiedad pais.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPais() {
                    return pais;
                }

                /**
                 * Define el valor de la propiedad pais.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPais(String value) {
                    this.pais = value;
                }

                /**
                 * Obtiene el valor de la propiedad telefono.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTelefono() {
                    return telefono;
                }

                /**
                 * Define el valor de la propiedad telefono.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTelefono(String value) {
                    this.telefono = value;
                }

                /**
                 * Obtiene el valor de la propiedad fax.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFax() {
                    return fax;
                }

                /**
                 * Define el valor de la propiedad fax.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFax(String value) {
                    this.fax = value;
                }

                /**
                 * Obtiene el valor de la propiedad personaContacto.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPersonaContacto() {
                    return personaContacto;
                }

                /**
                 * Define el valor de la propiedad personaContacto.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPersonaContacto(String value) {
                    this.personaContacto = value;
                }

                /**
                 * Obtiene el valor de la propiedad mail.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMail() {
                    return mail;
                }

                /**
                 * Define el valor de la propiedad mail.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMail(String value) {
                    this.mail = value;
                }

            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="linea" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="codigo_articulo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="num_linea" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="num_entrega" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="cod_interno_articulo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="ean" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="PosicionPadre" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="lotes">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="lote" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="unidades" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "linea"
        })
        public static class Lineas {

            protected List<Pedidos.Pedido.Lineas.Linea> linea;

            /**
             * Gets the value of the linea property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the linea property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLinea().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Pedidos.Pedido.Lineas.Linea }
             * 
             * 
             */
            public List<Pedidos.Pedido.Lineas.Linea> getLinea() {
                if (linea == null) {
                    linea = new ArrayList<Pedidos.Pedido.Lineas.Linea>();
                }
                return this.linea;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="codigo_articulo" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="num_linea" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="num_entrega" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="cod_interno_articulo" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="ean" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="PosicionPadre" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="lotes">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="lote" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="unidades" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "codigoArticulo",
                "numLinea",
                "numEntrega",
                "codInternoArticulo",
                "descripcion",
                "ean",
                "cantidad",
                "posicionPadre",
                "lotes"
            })
            public static class Linea {

                @XmlElement(name = "codigo_articulo", required = true)
                protected String codigoArticulo;
                @XmlElement(name = "num_linea", required = true)
                protected String numLinea;
                @XmlElement(name = "num_entrega", required = true)
                protected String numEntrega;
                @XmlElement(name = "cod_interno_articulo", required = true)
                protected String codInternoArticulo;
                @XmlElement(required = true)
                protected String descripcion;
                @XmlElement(required = true)
                protected String ean;
                @XmlElement(required = true)
                protected String cantidad;
                @XmlElement(name = "PosicionPadre", required = true)
                protected String posicionPadre;
                @XmlElement(required = true)
                protected Pedidos.Pedido.Lineas.Linea.Lotes lotes;

                /**
                 * Obtiene el valor de la propiedad codigoArticulo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodigoArticulo() {
                    return codigoArticulo;
                }

                /**
                 * Define el valor de la propiedad codigoArticulo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodigoArticulo(String value) {
                    this.codigoArticulo = value;
                }

                /**
                 * Obtiene el valor de la propiedad numLinea.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNumLinea() {
                    return numLinea;
                }

                /**
                 * Define el valor de la propiedad numLinea.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNumLinea(String value) {
                    this.numLinea = value;
                }

                /**
                 * Obtiene el valor de la propiedad numEntrega.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNumEntrega() {
                    return numEntrega;
                }

                /**
                 * Define el valor de la propiedad numEntrega.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNumEntrega(String value) {
                    this.numEntrega = value;
                }

                /**
                 * Obtiene el valor de la propiedad codInternoArticulo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodInternoArticulo() {
                    return codInternoArticulo;
                }

                /**
                 * Define el valor de la propiedad codInternoArticulo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodInternoArticulo(String value) {
                    this.codInternoArticulo = value;
                }

                /**
                 * Obtiene el valor de la propiedad descripcion.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescripcion() {
                    return descripcion;
                }

                /**
                 * Define el valor de la propiedad descripcion.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescripcion(String value) {
                    this.descripcion = value;
                }

                /**
                 * Obtiene el valor de la propiedad ean.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEan() {
                    return ean;
                }

                /**
                 * Define el valor de la propiedad ean.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEan(String value) {
                    this.ean = value;
                }

                /**
                 * Obtiene el valor de la propiedad cantidad.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCantidad() {
                    return cantidad;
                }

                /**
                 * Define el valor de la propiedad cantidad.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCantidad(String value) {
                    this.cantidad = value;
                }

                /**
                 * Obtiene el valor de la propiedad posicionPadre.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPosicionPadre() {
                    return posicionPadre;
                }

                /**
                 * Define el valor de la propiedad posicionPadre.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPosicionPadre(String value) {
                    this.posicionPadre = value;
                }

                /**
                 * Obtiene el valor de la propiedad lotes.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Pedidos.Pedido.Lineas.Linea.Lotes }
                 *     
                 */
                public Pedidos.Pedido.Lineas.Linea.Lotes getLotes() {
                    return lotes;
                }

                /**
                 * Define el valor de la propiedad lotes.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Pedidos.Pedido.Lineas.Linea.Lotes }
                 *     
                 */
                public void setLotes(Pedidos.Pedido.Lineas.Linea.Lotes value) {
                    this.lotes = value;
                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="lote" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="unidades" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "lote"
                })
                public static class Lotes {

                    protected List<Pedidos.Pedido.Lineas.Linea.Lotes.Lote> lote;

                    /**
                     * Gets the value of the lote property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the lote property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getLote().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Pedidos.Pedido.Lineas.Linea.Lotes.Lote }
                     * 
                     * 
                     */
                    public List<Pedidos.Pedido.Lineas.Linea.Lotes.Lote> getLote() {
                        if (lote == null) {
                            lote = new ArrayList<Pedidos.Pedido.Lineas.Linea.Lotes.Lote>();
                        }
                        return this.lote;
                    }


                    /**
                     * <p>Clase Java para anonymous complex type.
                     * 
                     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="unidades" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "numero",
                        "unidades"
                    })
                    public static class Lote {

                        @XmlElement(required = true)
                        protected String numero;
                        @XmlElement(required = true)
                        protected String unidades;

                        /**
                         * Obtiene el valor de la propiedad numero.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNumero() {
                            return numero;
                        }

                        /**
                         * Define el valor de la propiedad numero.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNumero(String value) {
                            this.numero = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad unidades.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getUnidades() {
                            return unidades;
                        }

                        /**
                         * Define el valor de la propiedad unidades.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setUnidades(String value) {
                            this.unidades = value;
                        }

                    }

                }

            }

        }

    }

}
