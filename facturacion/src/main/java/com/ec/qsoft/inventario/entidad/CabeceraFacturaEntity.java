package com.ec.qsoft.inventario.entidad;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author aquingaluisa
 */
@Data
@Entity
@Table(name = "cabecera_facturac")
public class CabeceraFacturaEntity {
    @Id
    private Integer id;

    private Integer idCliente;

    private String numeroFactura;

    @OneToMany(mappedBy = "cabeceraFactura")
    private List<DetalleFacturaEntity> detalleFacturaList;
}
