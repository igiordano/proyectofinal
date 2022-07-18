package com.proyectofinalGiordano.proyectoFinal.model;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
@Data
@Validated
public class ProductoRequest {
    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;
    @NotBlank(message = "El precio es obligatorio")
    private Float precio;
    @NotBlank(message = "El  precio de compra es obligatorio")
    private Float precio_compra;
    @NotNull(message = "La fecha de nacimiento es obligatorio")
    private int id_producto;
}
