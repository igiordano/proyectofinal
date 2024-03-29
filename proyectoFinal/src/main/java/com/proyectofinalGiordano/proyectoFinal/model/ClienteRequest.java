package com.proyectofinalGiordano.proyectoFinal.model;



import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
@Data
@Validated
public class ClienteRequest {
    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;
    @NotBlank(message = "El apellido es obligatorio")
    private String apellido;
    @NotNull(message = "El dni es obligatorio")
    private Long dni;
    @NotNull(message = "La fecha de nacimiento es obligatorio")
    @DateTimeFormat(pattern="yyyy-MM-dd", iso = DateTimeFormat.ISO.DATE)
    private Date fechaNacimiento;
}
