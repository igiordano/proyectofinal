package com.proyectofinalGiordano.proyectoFinal.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import javax.persistence.Id;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Data
@Entity
@Table(name = "CLIENTE")
public class ClienteEntity {
    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "APELLIDO")
    private String apellido;

    @Column(name = "DNI")
    @Id
    private long dni;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_NACIMIENTO")
    private Date fechaNacimiento;

}
