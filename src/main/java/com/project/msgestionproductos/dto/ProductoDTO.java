package com.project.msgestionproductos.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper=false)
@JsonPropertyOrder(value = {"id","nombre","descripcion","precio","stock","estado"})
public class ProductoDTO extends GenericDTO implements Serializable {

    private Long id;

    private String nombre;

    private String descripcion;

    private Double precio;

    private Integer stock;

}
