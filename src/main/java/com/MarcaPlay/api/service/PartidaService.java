package com.MarcaPlay.api.service;

import com.MarcaPlay.api.domain.Local.Local;
import com.MarcaPlay.api.domain.Partida.Partida;
import com.MarcaPlay.api.domain.Partida.PartidaRequestDTO;
import com.MarcaPlay.api.repositories.ILocalRepository;
import com.MarcaPlay.api.repositories.IPartidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PartidaService {

    @Autowired
    private IPartidaRepository partidaRepository;

    private LocalService localService;

    public Partida criarPartida(PartidaRequestDTO data) {
        Partida partida = new Partida();
        partida.setDataHoraPartida(data.dataHoraPartida());
        partida.setDataHoraCriacao(new Date());
        partida.setQuantidadeJogadores(data.quantidadeJogadores());
        Local local = localService.ObterLocal(data.idLocal());
        partida.setLocal(local);

        partidaRepository.save(partida);
        return partida;
    }
}
