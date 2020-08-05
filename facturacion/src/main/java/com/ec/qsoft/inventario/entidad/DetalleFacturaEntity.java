package com.ec.qsoft.inventario.entidad;

import lombok.Data;

import javax.persistence.*;

/**
 * @author aquingaluisa
 */
@Data
@Entity
@Table(name = "detalle_factura")
public class DetalleFacturaEntity {

    @Id
    private Integer id;

    private String cantidad;
    private String precio;

    private Integer idArticulo;

    @ManyToOne
    @JoinColumn(name="codigoCabecera", nullable=false)
    private CabeceraFacturaEntity cabeceraFactura;


}
