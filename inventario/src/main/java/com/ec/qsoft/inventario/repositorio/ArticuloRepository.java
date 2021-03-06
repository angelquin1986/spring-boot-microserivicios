package com.ec.qsoft.inventario.repositorio;

import com.ec.qsoft.inventario.entidad.ArticuloEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository para articulo
 *
 * @aquingaluisa
 */
@Repository
public interface ArticuloRepository extends JpaRepository<ArticuloEntity, Integer> {


}
