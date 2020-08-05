package com.ec.qsoft.inventario.pojo;

import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author aquingaluisa
 */
@Data
public class FacturaPojo {
    @Id
    private Integer id;

    private Integer idCliente;

    private String numeroFactura;

    private List<DetalleFacturaPojo> detalleFacturaList;

    private BigDecimal total;
}
