package com.tellus.provatecnica.model;

import com.tellus.provatecnica.entity.NotaEntity;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class Nota {

    private Long id;

    @NotBlank
    private String titolo;
    @NotBlank
    private String descrizione;

}
