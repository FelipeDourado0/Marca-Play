package com.MarcaPlay.api.repositories;

import com.MarcaPlay.api.domain.Partida.Partida;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;


public interface IPartidaRepository extends JpaRepository<Partida, UUID> {

}
