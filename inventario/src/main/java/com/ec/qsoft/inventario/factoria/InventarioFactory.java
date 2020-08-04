package com.ec.qsoft.inventario.factoria;

import com.ec.qsoft.inventario.servicio.InventarioServicio;
import com.ec.qsoft.util.context.ApplicationContextProvider;
import org.springframework.stereotype.Component;

/**
 * Factoria para el modulo de inventario
 *
 * @author aquingaluisa
 */
@Component()
public class InventarioFactory {
    //tienda de los beans que estan cargados.
    private ApplicationContextProvider context;
    private static final InventarioFactory INSTANCIA = new InventarioFactory();

    /**
     *
     */
    public InventarioFactory() {
        super();
        context = new ApplicationContextProvider();

    }

    /**
     * @return
     */
    public static InventarioFactory getInstancia() {
        return INSTANCIA;
    }

    /**
     * Retorna el bean servicio  de inventario
     *
     * @return
     */
    public InventarioServicio getInventarioService() {
        return (InventarioServicio) context.getApplicationContext().getBean("inventarioServicio");
    }

}
