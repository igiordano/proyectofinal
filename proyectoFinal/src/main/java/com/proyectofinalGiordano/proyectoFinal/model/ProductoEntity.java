package com.proyectofinalGiordano.proyectoFinal.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "PRODUCTO")
public class ProductoEntity {
    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "PRECIO")
    private Float precio;

    @Column(name = "PRECIO_COMPRA")
    private Float precio_compra;

    @Column(name = "ID_PRODUCTO")
    @Id
    private int id_producto;

}
