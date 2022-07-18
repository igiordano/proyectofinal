package com.proyectofinalGiordano.proyectoFinal.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ProductoResponse {
    private String nombre;
    private Float precio;
    private Float precio_compra;
    private int id_producto;
}
