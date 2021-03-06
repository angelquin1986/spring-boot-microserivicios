package com.ec.qsoft.inventario.servicio;

import com.ec.qsoft.inventario.entidad.ArticuloEntity;
import com.ec.qsoft.inventario.gestor.InventarioGestor;
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
public class InventarioServicio {

    @Autowired
    private InventarioGestor inventarioGestor;


    /**
     * Retorna los datos de un articulo
     *
     * @return
     */
    public ArticuloEntity obtenerItemStock(Integer orderId) {
        return this.inventarioGestor.obtenerItemStock(orderId);
    }

}
