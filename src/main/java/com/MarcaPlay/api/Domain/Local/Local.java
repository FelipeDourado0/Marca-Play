package com.MarcaPlay.api.Domain.Local;

import com.MarcaPlay.api.Domain.Endereco.Endereco;
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
    private Endereco idEndereco;
}
