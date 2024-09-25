package com.MarcaPlay.api.domain.Endereco;

public record EnderecoRequestDTO(
        String cep,
        String logradouro,
        String cidade,
        String complemento,
        String bairro,
        String estado,
        String uf,
        String ddd) {
}
