package com.MarcaPlay.api.repositories;

import com.MarcaPlay.api.domain.Local.Local;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ILocal extends JpaRepository<Local, UUID> {
}
