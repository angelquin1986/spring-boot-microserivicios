package com.ec.qsoft.inventario.gestor;

import com.ec.qsoft.inventario.entidad.CabeceraFacturaEntity;
import com.ec.qsoft.inventario.repositorio.CabeceraFacturaRepository;
import com.ec.qsoft.inventario.repositorio.DetalleFacturaRepository;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Manejo de la ln de facturacion
 *
 * @aquingaluisa
 */
@Data
@Component
@Slf4j
public class FacturaGestor {
    @Autowired
    private CabeceraFacturaRepository cabeceraFacturaRepository;

    @Autowired
    private DetalleFacturaRepository detalleFacturaRepository;

    /**
     * crear una factura
     *
     * @param cabeceraFactura
     */
    public CabeceraFacturaEntity guardarFactura(CabeceraFacturaEntity cabeceraFactura) {
        //buscar el cliente para la factura
        String nombreCliente = this.buscarCliente(cabeceraFactura.getIdCliente());
        log.info("Cliente Facturacion Encontrado:" + nombreCliente);

        return cabeceraFactura;
    }

    /**
     * buscar  el cliente por id
     *
     * @param idCliente
     */
    private String buscarCliente(Integer idCliente) {

        return "Angel Leonardo Quingaluisa Q.";
    }
}
