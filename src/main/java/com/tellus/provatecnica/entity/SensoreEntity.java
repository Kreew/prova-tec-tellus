package com.tellus.provatecnica.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "sensori")
@Data
public class SensoreEntity {

    @Id
    @Column( name = "id" )
    private Long id;
    @Column( name = "modello" )
    private String modello;
    @Column( name = "marca" )
    private String marca;
    @Column( name = "temperatura" )
    private Double temperatura;

}
