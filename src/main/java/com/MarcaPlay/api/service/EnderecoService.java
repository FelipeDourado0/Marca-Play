package com.MarcaPlay.api.service;

import com.MarcaPlay.api.domain.Endereco.Endereco;
import com.MarcaPlay.api.domain.Endereco.EnderecoRequestDTO;
import com.MarcaPlay.api.repositories.IEnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {

    @Autowired
    private IEnderecoRepository enderecoRepository;

    public Endereco criarEndereco(EnderecoRequestDTO data) {

        Endereco newEndereco = new Endereco();
        newEndereco.setUf(data.uf());
        newEndereco.setCidade(data.cidade());
        newEndereco.setEstado(data.estado());
        newEndereco.setCep(data.cep());
        newEndereco.setBairro(data.bairro());
        newEndereco.setLogradouro(data.logradouro());
        newEndereco.setDdd(data.ddd());
        newEndereco.setComplemento(data.complemento());

        enderecoRepository.save(newEndereco);
        return newEndereco;
    }
}
