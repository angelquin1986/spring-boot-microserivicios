package com.ec.qsoft.inventario.gestor;

import com.ec.qsoft.inventario.entidad.CabeceraFacturaEntity;
import com.ec.qsoft.inventario.feing.cliente.InventarioClienteProxy;
import com.ec.qsoft.inventario.pojo.ItemPojoInventario;
import com.ec.qsoft.inventario.repositorio.CabeceraFacturaRepository;
import com.ec.qsoft.inventario.repositorio.DetalleFacturaRepository;
import lombok.Data;
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

    @Autowired
    private InventarioClienteProxy inventarioClienteProxy;

    /**
     * crear una factura
     *
     * @param cabeceraFactura
     */
    public CabeceraFacturaEntity guardarFactura(CabeceraFacturaEntity cabeceraFactura) {
        //buscar el cliente para la factura
        String nombreCliente = this.buscarCliente(cabeceraFactura.getIdCliente());
        log.info("Cliente Facturacion Encontrado:" + nombreCliente);
        ItemPojoInventario itemPojoInventario = new ItemPojoInventario();
        itemPojoInventario.setOrderId(1);
        itemPojoInventario = inventarioClienteProxy.getItiemStock(itemPojoInventario);
        log.info("integracion con inventario:" + itemPojoInventario.getNombre());
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
