package com.proyectofinalGiordano.proyectoFinal.service;

import com.proyectofinalGiordano.proyectoFinal.handle.ApiException;
import com.proyectofinalGiordano.proyectoFinal.model.ProductoRequest;
import com.proyectofinalGiordano.proyectoFinal.model.ProductoResponse;

import java.util.List;

public interface productoService {
    ProductoResponse buscarPorProducto(Integer id_producto);
    List<ProductoResponse> buscarTodos();
    ProductoResponse crear(ProductoRequest producto) throws ApiException;
    ProductoResponse actualizar(ProductoRequest producto) throws ApiException;
}
