package com.MarcaPlay.api.repositories;

import com.MarcaPlay.api.domain.Partida.Partida;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IPartidaRepository extends JpaRepository<Partida, UUID> {
}
