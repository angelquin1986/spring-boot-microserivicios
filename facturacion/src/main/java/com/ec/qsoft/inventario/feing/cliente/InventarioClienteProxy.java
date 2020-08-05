package com.ec.qsoft.inventario.feing.cliente;

import com.ec.qsoft.inventario.pojo.ItemPojoInventario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * Clase inventario para poder consumir los datos api rest del modulo de inventario
 *
 * @author aquingaluisa
 */
@FeignClient(name = "inventario")
public interface InventarioClienteProxy {
    @PostMapping("/inventario/get-item-stock")
    ItemPojoInventario getItiemStock(@RequestBody ItemPojoInventario itemPojo);
}
