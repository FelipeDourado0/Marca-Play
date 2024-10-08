package com.MarcaPlay.api.domain.Partida;

import com.MarcaPlay.api.domain.Local.Local;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
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

    @Column(name = "datahorapartida", columnDefinition = "TIMESTAMP")
    private LocalDateTime dataHoraPartida;
    @Column(name = "quantidadejogadores", columnDefinition = "TIMESTAMP")
    private int quantidadeJogadores;
    @Column(name = "datahoracriacao", columnDefinition = "TIMESTAMP")
    private LocalDateTime dataHoraCriacao;

    @OneToOne
    @JoinColumn(name = "local_id")
    private Local local;
}
