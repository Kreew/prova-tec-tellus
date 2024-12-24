package com.tellus.provatecnica.controller;

import com.tellus.provatecnica.entity.NotaEntity;
import com.tellus.provatecnica.exception.NotaNotFoundException;
import com.tellus.provatecnica.model.Nota;
import com.tellus.provatecnica.repository.NoteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("api/note")
public class NoteController {

    @Autowired
    private NoteRepository noteRepository;

    @PostMapping
    public Long creaNota( @RequestBody @Valid final Nota nota ) {
        NotaEntity notaEntity = new NotaEntity();
        notaEntity.setTitolo( nota.getTitolo() );
        notaEntity.setDescrizione( nota.getDescrizione() );
        NotaEntity savedNote = noteRepository.save( notaEntity );
        return savedNote.getId();
    }

    @DeleteMapping( path = "/{idNota}" )
    public Void eliminaNota( @PathVariable( value = "idNota" ) final Long idNota ) {
        Optional<NotaEntity> optionalNotaEntity = noteRepository.findById( idNota );
        if ( optionalNotaEntity.isEmpty() ){
            throw new NotaNotFoundException();
        }
        noteRepository.deleteById( idNota );
        return null;
    }

    @PutMapping( path = "/{idNota}" )
    public Void aggiornaNota( @PathVariable( value = "idNota" ) final Long idNota,
                                              @RequestBody @Valid final Nota nota ) {
        Optional<NotaEntity> optionalNotaEntity = noteRepository.findById( idNota );
        if ( optionalNotaEntity.isEmpty() ){
            throw new NotaNotFoundException();
        }
        NotaEntity notaEntity = optionalNotaEntity.get();
        notaEntity.setTitolo( nota.getTitolo() );
        notaEntity.setDescrizione( nota.getDescrizione() );
        noteRepository.save( notaEntity );
        return null;
    }

}
