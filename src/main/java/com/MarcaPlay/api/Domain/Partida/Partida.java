package com.MarcaPlay.api.Domain.Partida;

import com.MarcaPlay.api.Domain.Local.Local;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "partida")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Partida {
    @Id
    @GeneratedValue
    private UUID id;

    private Date dataHoraParida;
    private int quantidadeJogadores;
    private Date dataHoraCriacao;

    @OneToOne
    @JoinColumn(name = "local_id")
    private Local local;
}
