package com.MarcaPlay.api.domain.Partida;

import com.MarcaPlay.api.domain.Local.Local;
import com.MarcaPlay.api.domain.Local.LocalRequestDTO;

import java.util.Date;
import java.util.UUID;

public record PartidaRequestDTO(int quantidadeJogadores, Date dataHoraPartida, UUID idLocal) {
}
