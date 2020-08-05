package com.ec.qsoft.inventario.servicio;

import com.ec.qsoft.inventario.entidad.CabeceraFacturaEntity;
import com.ec.qsoft.inventario.gestor.FacturaGestor;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * servicios para el modulo de inventarios
 *
 * @author aquingaluisa
 */
@Data
@Service
@Slf4j
public class FacturaServicio {

    @Autowired
    private FacturaGestor facturaGestor;


    /**
     * Crear una factura
     *
     * @return
     */
    public CabeceraFacturaEntity guardarFactura(CabeceraFacturaEntity cabeceraFactura) {
        return this.facturaGestor.guardarFactura(cabeceraFactura);
    }

}
