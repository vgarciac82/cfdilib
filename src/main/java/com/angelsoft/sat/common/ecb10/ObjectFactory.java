//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v4.0.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
//


package com.angelsoft.sat.common.ecb10;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.angelsoft.sat.common.ecb10 package. 
 * <p>An ObjectFactory allows you to programmatically 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.angelsoft.sat.common.ecb10
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EstadoDeCuentaBancario }
     * 
     * @return
     *     the new instance of {@link EstadoDeCuentaBancario }
     */
    public EstadoDeCuentaBancario createEstadoDeCuentaBancario() {
        return new EstadoDeCuentaBancario();
    }

    /**
     * Create an instance of {@link EstadoDeCuentaBancario.Movimientos }
     * 
     * @return
     *     the new instance of {@link EstadoDeCuentaBancario.Movimientos }
     */
    public EstadoDeCuentaBancario.Movimientos createEstadoDeCuentaBancarioMovimientos() {
        return new EstadoDeCuentaBancario.Movimientos();
    }

    /**
     * Create an instance of {@link EstadoDeCuentaBancario.Movimientos.MovimientoECB }
     * 
     * @return
     *     the new instance of {@link EstadoDeCuentaBancario.Movimientos.MovimientoECB }
     */
    public EstadoDeCuentaBancario.Movimientos.MovimientoECB createEstadoDeCuentaBancarioMovimientosMovimientoECB() {
        return new EstadoDeCuentaBancario.Movimientos.MovimientoECB();
    }

    /**
     * Create an instance of {@link EstadoDeCuentaBancario.Movimientos.MovimientoECBFiscal }
     * 
     * @return
     *     the new instance of {@link EstadoDeCuentaBancario.Movimientos.MovimientoECBFiscal }
     */
    public EstadoDeCuentaBancario.Movimientos.MovimientoECBFiscal createEstadoDeCuentaBancarioMovimientosMovimientoECBFiscal() {
        return new EstadoDeCuentaBancario.Movimientos.MovimientoECBFiscal();
    }

}
