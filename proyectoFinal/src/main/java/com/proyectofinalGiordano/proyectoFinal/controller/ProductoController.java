package com.proyectofinalGiordano.proyectoFinal.controller;

import com.proyectofinalGiordano.proyectoFinal.handle.ApiException;
import com.proyectofinalGiordano.proyectoFinal.model.ProductoRequest;
import com.proyectofinalGiordano.proyectoFinal.model.ProductoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("practicas/proyectoFinal")
public class ProductoController {
    private final com.proyectofinalGiordano.proyectoFinal.service.productoService productoService;
    @GetMapping()
    public ResponseEntity<List<ProductoResponse>> obtenerClientes() {
        return ResponseEntity.ok(productoService.buscarTodos());
    }

    @GetMapping("/{id_producto}")
    public ResponseEntity<ProductoResponse> buscarPorProducto(@PathVariable Integer id_producto) {
        return ResponseEntity.ok(productoService.buscarPorProducto(id_producto));
    }

    @PostMapping("/actualizar")
    public ResponseEntity<ProductoResponse> actualizarProducto(@Valid @RequestBody ProductoRequest producto) throws ApiException {
        return ResponseEntity.ok(productoService.actualizar(producto));
    }

    @PostMapping("/crear")
    public ResponseEntity<ProductoResponse> crearCliente(@Valid @RequestBody ProductoRequest producto) throws ApiException {
        return ResponseEntity.ok(productoService.crear(producto));
    }
}
