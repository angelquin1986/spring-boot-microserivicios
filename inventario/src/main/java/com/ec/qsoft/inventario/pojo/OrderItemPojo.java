package com.ec.qsoft.inventario.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemPojo {

    private Integer orderId;

    private String nombre;

    private BigDecimal cantidad;

}
