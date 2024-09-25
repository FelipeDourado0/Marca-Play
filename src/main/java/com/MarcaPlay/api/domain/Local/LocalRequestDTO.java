package com.MarcaPlay.api.domain.Local;

import com.MarcaPlay.api.domain.Endereco.Endereco;
import com.MarcaPlay.api.domain.Endereco.EnderecoRequestDTO;

public record LocalRequestDTO(String nome, String esporte, EnderecoRequestDTO endereco) {
}
