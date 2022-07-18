package com.proyectofinalGiordano.proyectoFinal.service;

import com.proyectofinalGiordano.proyectoFinal.handle.ApiException;
import com.proyectofinalGiordano.proyectoFinal.model.ClienteRequest;
import com.proyectofinalGiordano.proyectoFinal.model.ClienteResponse;

import java.util.List;

public interface ClienteService {
    ClienteResponse buscarPorDni(Long dni);
    List<ClienteResponse> buscarTodos();
    ClienteResponse crear(ClienteRequest cliente) throws ApiException;
    ClienteResponse actualizar(ClienteRequest cliente) throws ApiException;
}
