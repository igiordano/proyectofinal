package com.proyectofinalGiordano.proyectoFinal.daoRepository;

import com.proyectofinalGiordano.proyectoFinal.model.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productoRepository extends JpaRepository<ProductoEntity, Integer> {
}
