package com.proyectofinalGiordano.proyectoFinal.service;

import com.proyectofinalGiordano.proyectoFinal.builder.ClienteBuilder;
import com.proyectofinalGiordano.proyectoFinal.daoRepository.clienteRepository;
import com.proyectofinalGiordano.proyectoFinal.handle.ApiException;
import com.proyectofinalGiordano.proyectoFinal.model.ClienteEntity;
import com.proyectofinalGiordano.proyectoFinal.model.ClienteRequest;
import com.proyectofinalGiordano.proyectoFinal.model.ClienteResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class ClienteServiceImpl implements ClienteService{
    @Autowired
    private final clienteRepository clienteRepository;
    @Override
    public ClienteResponse buscarPorDni(Long dni) {
        ClienteEntity cliente = clienteRepository.findById(dni).orElse(null);
        return ClienteBuilder.entityToResponse(cliente);
    }

    @Override
    public List<ClienteResponse> buscarTodos() {
        return ClienteBuilder.entityToResponseList(clienteRepository.findAll());
    }

    @Override
    public ClienteResponse crear(ClienteRequest cliente) throws ApiException {
        try {
            if (buscarPorDni(cliente.getDni()) == null) {
                ClienteEntity entity = clienteRepository.save(Objects.requireNonNull(ClienteBuilder.requestToEntity(cliente)));
                return ClienteBuilder.entityToResponse(entity);
            } else {
                throw new ApiException("Cliente ya existe");
            }
        } catch (Exception e) {
            throw new ApiException(e.getMessage());
        }
    }

    @Override
    public ClienteResponse actualizar(ClienteRequest cliente) throws ApiException {
        try {
            if (buscarPorDni(cliente.getDni()) != null) {
                ClienteEntity entity = clienteRepository.save(Objects.requireNonNull(ClienteBuilder.requestToEntity(cliente)));
                return ClienteBuilder.entityToResponse(entity);
            } else {
                throw new ApiException("Cliente no existe");
            }
        } catch (Exception e) {
            throw new ApiException(e.getMessage());
        }
    }
}
