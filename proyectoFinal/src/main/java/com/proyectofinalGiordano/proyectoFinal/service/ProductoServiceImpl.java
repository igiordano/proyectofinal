package com.proyectofinalGiordano.proyectoFinal.service;

import com.proyectofinalGiordano.proyectoFinal.builder.ProductoBuilder;
import com.proyectofinalGiordano.proyectoFinal.daoRepository.productoRepository;
import com.proyectofinalGiordano.proyectoFinal.handle.ApiException;
import com.proyectofinalGiordano.proyectoFinal.model.ProductoEntity;
import com.proyectofinalGiordano.proyectoFinal.model.ProductoRequest;
import com.proyectofinalGiordano.proyectoFinal.model.ProductoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
@Service
@RequiredArgsConstructor
public class ProductoServiceImpl implements productoService {
    @Autowired
    private final productoRepository Productorepository;


    @Override
    public ProductoResponse buscarPorProducto(Integer id_producto) {
        ProductoEntity producto = Productorepository.findById(id_producto).orElse(null);
        return ProductoBuilder.entityToResponse(producto);
    }

    @Override
    public List<ProductoResponse> buscarTodos() {
        return ProductoBuilder.entityToResponseList(Productorepository.findAll());
    }

    @Override
    public ProductoResponse crear(ProductoRequest producto) throws ApiException {
        try {
            if (buscarPorProducto(producto.getId_producto()) == null) {
                ProductoEntity entity = Productorepository.save(Objects.requireNonNull(ProductoBuilder.requestToEntity(producto)));
                return ProductoBuilder.entityToResponse(entity);
            } else {
                throw new ApiException("El Producto ya existe");
            }
        } catch (Exception e) {
            throw new ApiException(e.getMessage());
        }
    }

    @Override
    public ProductoResponse actualizar(ProductoRequest producto) throws ApiException {
        return null;
    }
}
