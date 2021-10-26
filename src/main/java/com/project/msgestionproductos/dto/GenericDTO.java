package com.project.msgestionproductos.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class GenericDTO implements Serializable {

    @Builder.Default
    private String estado = "1";
}
