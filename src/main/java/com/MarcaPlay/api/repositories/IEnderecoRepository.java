package com.MarcaPlay.api.repositories;

import com.MarcaPlay.api.domain.Endereco.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IEnderecoRepository extends JpaRepository<Endereco, UUID> {
}
