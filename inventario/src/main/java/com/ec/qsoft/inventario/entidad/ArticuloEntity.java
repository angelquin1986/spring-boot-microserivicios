package com.ec.qsoft.inventario.entidad;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Entidad articulo
 *
 * @author aquingaluisa
 */

@Data
@Entity
@Table(name = "articulo")
public class ArticuloEntity {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;

    private BigDecimal cantidad;
}
