package com.ec.qsoft.inventario.controller;

import com.ec.qsoft.inventario.entidad.CabeceraFacturaEntity;
import com.ec.qsoft.inventario.entidad.DetalleFacturaEntity;
import com.ec.qsoft.inventario.factoria.FacturaFactory;
import com.ec.qsoft.inventario.pojo.FacturaPojo;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/inventario")
@Slf4j
public class FacturacionController {
    @PostMapping("/guardar-Factura")
    public ResponseEntity<Object> guardarFactura(@RequestBody FacturaPojo facturaPojo) throws Exception {
        CabeceraFacturaEntity cabeceraFactura = new CabeceraFacturaEntity();
        cabeceraFactura.setIdCliente(facturaPojo.getId());
        cabeceraFactura.setDetalleFacturaList(new ArrayList());
        facturaPojo.getDetalleFacturaList().forEach(detalle -> {
            DetalleFacturaEntity detalleFactura = new DetalleFacturaEntity();
            detalleFactura.setCantidad(detalle.getCantidad());
            detalleFactura.setIdArticulo(detalle.getIdArticulo());
            cabeceraFactura.getDetalleFacturaList().add(detalleFactura);
        });

        FacturaFactory.getInstancia().getFacturaService().guardarFactura(cabeceraFactura);

        return new ResponseEntity<>(cabeceraFactura, HttpStatus.OK);
    }
}
