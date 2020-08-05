package com.ec.qsoft.inventario.repositorio;

import com.ec.qsoft.inventario.entidad.CabeceraFacturaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository para cabecera factura
 *
 * @aquingaluisa
 */
@Repository
public interface CabeceraFacturaRepository extends JpaRepository<CabeceraFacturaEntity, Integer> {

}
