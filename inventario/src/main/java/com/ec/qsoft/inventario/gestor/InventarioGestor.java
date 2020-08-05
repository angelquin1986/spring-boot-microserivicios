package com.ec.qsoft.inventario.gestor;

import com.ec.qsoft.inventario.entidad.ArticuloEntity;
import com.ec.qsoft.inventario.repositorio.ArticuloRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * Manejo de la ln de inventatio
 *
 * @aquingaluisa
 */
@Data
@Component
public class InventarioGestor {
    @Autowired
    private ArticuloRepository articuloRepository;

    /**
     * Retorna los datos de un articulo
     *
     * @return
     */
    public ArticuloEntity obtenerItemStock(Integer orderId) {
        ArticuloEntity articuloEntity = new ArticuloEntity();
        articuloEntity.setId(orderId);
        articuloEntity.setNombre("Chocolate Galak");
        if (this.validarStock(orderId)) {
            articuloEntity.setCantidad(new BigDecimal(500));

        } else {
            articuloEntity.setCantidad(new BigDecimal(0));
        }
        return articuloEntity;
    }

    /**
     * validar stock
     *
     * @param orderId
     */
    private Boolean validarStock(Integer orderId) {
        return true;
    }
}
