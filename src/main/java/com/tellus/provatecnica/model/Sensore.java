package com.tellus.provatecnica.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Sensore {

    private Long id;
    private String modello;
    private String marca;
    private Double temperatura;
}
