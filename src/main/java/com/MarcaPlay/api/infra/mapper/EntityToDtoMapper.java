package com.MarcaPlay.api.infra.mapper;

import com.MarcaPlay.api.domain.Partida.Partida;
import com.MarcaPlay.api.domain.Partida.PartidaRequestDTO;
import com.MarcaPlay.api.domain.Partida.PartidaResponseDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Service
public class EntityToDtoMapper {
    @Autowired
    private ModelMapper modelMapper;

    public PartidaResponseDTO convertToPartida(Partida partida) {
        return modelMapper.map(partida, PartidaResponseDTO.class);
    }

}
