package com.proyectofinalGiordano.proyectoFinal.builder;

import com.proyectofinalGiordano.proyectoFinal.model.ProductoEntity;
import com.proyectofinalGiordano.proyectoFinal.model.ProductoRequest;
import com.proyectofinalGiordano.proyectoFinal.model.ProductoResponse;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ProductoBuilder {
    public static ProductoResponse entityToResponse(ProductoEntity producto) {
        if (Objects.nonNull(producto)) {
            return ProductoResponse.builder()
                    .id_producto(producto.getId_producto())
                    .nombre(producto.getNombre())
                    .precio(producto.getPrecio())
                    .precio_compra(producto.getPrecio_compra())
                    .build();
        }
        return null;
    }
    public static List<ProductoResponse> entityToResponseList(List<ProductoEntity> entityList) {
        return entityList.stream().map(ProductoBuilder::entityToResponse).collect(Collectors.toList());
    }
    public static ProductoEntity requestToEntity(ProductoRequest producto) {
        if (Objects.nonNull(producto)) {
            return ProductoEntity.builder()
                    .id_producto(producto.getId_producto())
                    .nombre(producto.getNombre())
                    .precio(producto.getPrecio())
                    .precio_compra(producto.getPrecio_compra())
                    .build();
        }
        return null;
    }
}
