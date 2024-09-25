package com.MarcaPlay.api.repositories;

import com.MarcaPlay.api.domain.Atleta.Atleta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IAtletaRepository extends JpaRepository<Atleta, UUID> {
}
