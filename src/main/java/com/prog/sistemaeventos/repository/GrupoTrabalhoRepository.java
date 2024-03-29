package com.prog.sistemaeventos.repository;

import com.prog.sistemaeventos.model.GrupoTrabalho;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrupoTrabalhoRepository extends JpaRepository<GrupoTrabalho, Long> {
    
}
