package com.proyectofinalGiordano.proyectoFinal.controller;

import com.proyectofinalGiordano.proyectoFinal.handle.ApiException;
import com.proyectofinalGiordano.proyectoFinal.model.ClienteRequest;
import com.proyectofinalGiordano.proyectoFinal.model.ClienteResponse;
import com.proyectofinalGiordano.proyectoFinal.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/practicas/proyectoFinal")
public class ClienteController {
    private final ClienteService clienteService;

    @GetMapping()
    public ResponseEntity<List<ClienteResponse>> obtenerClientes() {
        return ResponseEntity.ok(clienteService.buscarTodos());
    }

    @GetMapping("/{dni}")
    public ResponseEntity<ClienteResponse> buscarClientePorDni(@PathVariable Long dni) {
        return ResponseEntity.ok(clienteService.buscarPorDni(dni));
    }

    @PostMapping("/actualizar")
    public ResponseEntity<ClienteResponse> actualizarCliente(@Valid @RequestBody ClienteRequest cliente) throws ApiException {
        return ResponseEntity.ok(clienteService.actualizar(cliente));
    }

    @PostMapping("/crear")
    public ResponseEntity<ClienteResponse> crearCliente(@Valid @RequestBody ClienteRequest cliente) throws ApiException {
        return ResponseEntity.ok(clienteService.crear(cliente));
    }

}
