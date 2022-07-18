package com.proyectofinalGiordano.proyectoFinal.daoRepository;

import com.proyectofinalGiordano.proyectoFinal.model.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface clienteRepository extends JpaRepository<ClienteEntity, Long> {
}
