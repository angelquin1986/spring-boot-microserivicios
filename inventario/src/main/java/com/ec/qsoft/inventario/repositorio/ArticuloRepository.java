package com.ec.qsoft.inventario.repositorio;

import com.ec.qsoft.inventario.entidad.ArticuloEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository para articulo
 *
 * @aquingaluisa
 */
public interface ArticuloRepository extends JpaRepository<ArticuloEntity, Integer> {


}
