package com.project.msgestionproductos.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Data
@MappedSuperclass
public class GenericEntity {

    @Column(name = "ESTADO")
    @Builder.Default
    private String estado="1";

}
