package com.ec.qsoft.inventario.repositorio;

import com.ec.qsoft.inventario.entidad.DetalleFacturaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository para detalle factura
 *
 * @aquingaluisa
 */
@Repository
public interface DetalleFacturaRepository extends JpaRepository<DetalleFacturaEntity, Integer> {

}
