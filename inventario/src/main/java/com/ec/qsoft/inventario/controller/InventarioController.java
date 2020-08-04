package com.ec.qsoft.inventario.controller;

import com.ec.qsoft.inventario.entidad.ArticuloEntity;
import com.ec.qsoft.inventario.factoria.InventarioFactory;
import com.ec.qsoft.inventario.pojo.OrderItemPojo;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inventario")
@Log4j2
public class InventarioController {
    @PostMapping("/get-item")
    public ResponseEntity<Object> getItem(@RequestBody OrderItemPojo orderItemPojo) throws Exception {
        ArticuloEntity articuloEntity = InventarioFactory.getInstancia().getInventarioService().obtenerItem(orderItemPojo.getOrderId());
        return new ResponseEntity<>(new OrderItemPojo(articuloEntity.getId(), articuloEntity.getNombre(), articuloEntity.getCantidad()), HttpStatus.OK);
    }
}
