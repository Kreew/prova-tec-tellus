package com.tellus.provatecnica.controller;

import com.tellus.provatecnica.entity.SensoreEntity;
import com.tellus.provatecnica.exception.SensoreNotFoundException;
import com.tellus.provatecnica.model.Sensore;
import com.tellus.provatecnica.repository.SensoriRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.lang.model.util.Elements;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping( path = "api/sensori" )
public class SensoreController {

    @Autowired
    private SensoriRepository sensoriRepository;

    @GetMapping
    public List<Sensore> listaSensori() {
        List<SensoreEntity> allSensors = sensoriRepository.findAll();
        List<Sensore> allSensorsModel = new ArrayList<>();
        for ( SensoreEntity entity : allSensors ) {
            Sensore sensore = new Sensore();
            sensore.setId( entity.getId() );
            sensore.setModello( entity.getModello() );
            sensore.setTemperatura( entity.getTemperatura() );
            allSensorsModel.add(sensore);
        }
        return allSensorsModel;
    }

    @GetMapping( path = "/{idSensore}" ) //
    public Sensore dettaglioSensore( @PathVariable( value = "idSensore" ) final Long idSensore ) {
        SensoreEntity sensoreEntity = sensoriRepository.findById(idSensore)
                .orElseThrow( SensoreNotFoundException::new );
        Sensore sensore = new Sensore();
        sensore.setId( sensoreEntity.getId() );
        sensore.setModello( sensoreEntity.getModello() );
        sensore.setMarca( sensoreEntity.getMarca() );
        return sensore;
    }

}

