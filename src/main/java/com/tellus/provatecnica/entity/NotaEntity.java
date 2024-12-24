package com.tellus.provatecnica.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "note")
@Data
public class NotaEntity {

    @Id
    @Column( name = "id" )
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    @Column( name = "titolo" )
    private String titolo;
    @Column( name = "descrizione" )
    private String descrizione;


}
