package com.MarcaPlay.api.service;

import com.MarcaPlay.api.domain.Local.Local;
import com.MarcaPlay.api.domain.Partida.Partida;
import com.MarcaPlay.api.domain.Partida.PartidaRequestDTO;
import com.MarcaPlay.api.domain.Partida.PartidaResponseDTO;
import com.MarcaPlay.api.infra.mapper.EntityToDtoMapper;
import com.MarcaPlay.api.repositories.ILocalRepository;
import com.MarcaPlay.api.repositories.IPartidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class PartidaService {

    @Autowired
    private IPartidaRepository partidaRepository;

    @Autowired
    private LocalService localService;

    @Autowired
    private EntityToDtoMapper mapper;

    public PartidaResponseDTO criarPartida(PartidaRequestDTO data) {
        Partida partida = new Partida();

        partida.setDataHoraPartida(data.dataHoraPartida());
        partida.setDataHoraCriacao(LocalDateTime.now());
        partida.setQuantidadeJogadores(data.quantidadeJogadores());
        Local local = localService.ObterLocal(data.idLocal());
        partida.setLocal(local);
        partidaRepository.save(partida);
        PartidaResponseDTO resopnse = mapper.convertToPartida(partida);
        return resopnse;
    }

    public List<Partida> obterTodasPartidas() {
        return partidaRepository.findAll();
    }
}
