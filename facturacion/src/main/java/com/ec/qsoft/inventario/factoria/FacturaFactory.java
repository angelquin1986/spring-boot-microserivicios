package com.ec.qsoft.inventario.factoria;

import com.ec.qsoft.inventario.servicio.FacturaServicio;
import com.ec.qsoft.util.context.ApplicationContextProvider;
import org.springframework.stereotype.Component;

/**
 * Factoria para el modulo de inventario
 *
 * @author aquingaluisa
 */
@Component
public class FacturaFactory {
    //tienda de los beans que estan cargados.
    private ApplicationContextProvider context;
    private static final FacturaFactory INSTANCIA = new FacturaFactory();

    /**
     *
     */
    public FacturaFactory() {
        super();
        context = new ApplicationContextProvider();

    }

    /**
     * @return
     */
    public static FacturaFactory getInstancia() {
        return INSTANCIA;
    }

    /**
     * Retorna el bean servicio  de inventario
     *
     * @return
     */
    public FacturaServicio getFacturaService() {
        return (FacturaServicio) context.getApplicationContext().getBean("facturaServicio");
    }

}
