package com.MarcaPlay.api.domain.Local;

import com.MarcaPlay.api.domain.Endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "local")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Local {
    @GeneratedValue
    @Id
    private UUID id;
    private String nome;
    private String esporte;

    @OneToOne
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;
}
