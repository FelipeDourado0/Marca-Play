package com.MarcaPlay.api.repositories;

import com.MarcaPlay.api.domain.PartidaAtleta.PartidaAtleta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IPartidaAtleta extends JpaRepository<PartidaAtleta, UUID> {
}
