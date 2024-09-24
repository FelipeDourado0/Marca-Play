package com.MarcaPlay.api.Domain.PartidaAtleta;

import com.MarcaPlay.api.Domain.Atleta.Atleta;
import com.MarcaPlay.api.Domain.Partida.Partida;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.print.DocFlavor;
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
