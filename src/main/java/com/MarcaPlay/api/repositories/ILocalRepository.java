package com.MarcaPlay.api.repositories;

import com.MarcaPlay.api.domain.Local.Local;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface ILocalRepository extends JpaRepository<Local, UUID> {
    Optional<Local> findById(UUID id);
}
