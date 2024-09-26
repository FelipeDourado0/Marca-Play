package com.MarcaPlay.api.service;

import com.MarcaPlay.api.domain.Endereco.Endereco;
import com.MarcaPlay.api.domain.Local.Local;
import com.MarcaPlay.api.domain.Local.LocalRequestDTO;
import com.MarcaPlay.api.repositories.ILocalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class LocalService {

    @Autowired
    private ILocalRepository localRepository;
    @Autowired
    private EnderecoService enderecoService;

    public Local criarLocal(LocalRequestDTO data) {
        Local local = new Local();

        Endereco enderecoSalvo = enderecoService.criarEndereco(data.endereco());
        local.setEndereco(enderecoSalvo);
        local.setNome(data.nome());
        local.setEsporte(data.esporte());

        localRepository.save(local);
        return local;
    }

    public Local ObterLocal(UUID id){
        Optional<Local> local = localRepository.findById(id);
        return local.orElse(null);
    }

    public List<Local> ObterTodosLocal(){
        return localRepository.findAll();
    }
}
