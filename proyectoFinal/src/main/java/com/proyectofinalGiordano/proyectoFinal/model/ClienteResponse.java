package com.proyectofinalGiordano.proyectoFinal.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ClienteResponse {
    private String nombre;
    private String apellido;
    private long dni;
    private int edad;
}
