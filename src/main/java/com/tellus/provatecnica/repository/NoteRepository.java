package com.tellus.provatecnica.repository;

import com.tellus.provatecnica.entity.NotaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<NotaEntity, Long> {

}
