package com.MarcaPlay.api.domain.PartidaAtleta;

import com.MarcaPlay.api.domain.Atleta.Atleta;
import com.MarcaPlay.api.domain.Partida.Partida;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "patida_atleta")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PartidaAtleta {
    @Id
    @GeneratedValue
    private UUID id;

    @OneToOne
    @JoinColumn(name = "partida_id")
    private Partida partida;

    @OneToOne
    @JoinColumn(name = "atleta_id")
    private Atleta atleta;
}
