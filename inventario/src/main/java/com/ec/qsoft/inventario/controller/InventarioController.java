package com.ec.qsoft.inventario.controller;

import com.ec.qsoft.inventario.entidad.ArticuloEntity;
import com.ec.qsoft.inventario.factoria.InventarioFactory;
import com.ec.qsoft.inventario.pojo.ItemPojo;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inventario")
@Slf4j
public class InventarioController {
    @PostMapping("/get-item-stock")
    public ResponseEntity<Object> getItem(@RequestBody ItemPojo itemPojo) throws Exception {
        ArticuloEntity articuloEntity = InventarioFactory.getInstancia().getInventarioService().obtenerItemStock(itemPojo.getOrderId());
        return new ResponseEntity<>(new ItemPojo(articuloEntity.getId(), articuloEntity.getNombre(), articuloEntity.getCantidad()), HttpStatus.OK);
    }


}
