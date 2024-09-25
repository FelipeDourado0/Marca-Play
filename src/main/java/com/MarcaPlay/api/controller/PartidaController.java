package com.MarcaPlay.api.controller;

import com.MarcaPlay.api.domain.Partida.Partida;
import com.MarcaPlay.api.domain.Partida.PartidaRequestDTO;
import com.MarcaPlay.api.infra.exception.GlobalExceptionHandler;
import com.MarcaPlay.api.service.PartidaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/partida")
public class PartidaController {
    @Autowired
    private PartidaService partidaService;
    @Autowired
    private GlobalExceptionHandler globalExceptionHandler;

    @PostMapping
    @Operation(summary = "Cria Partida", description = "Cria partidas")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Retorna a partida cadastrada."),
            @ApiResponse(responseCode = "400", description = "Falha ao cadastrar partida."),
            @ApiResponse(responseCode = "500",  description = "Dados enviados não estão corretos.")
    })
    public ResponseEntity<Partida> create(@RequestBody PartidaRequestDTO partida) {

        Partida newPartida = this.partidaService.criarPartida(partida);
        return ResponseEntity.ok(newPartida);
    }
}
