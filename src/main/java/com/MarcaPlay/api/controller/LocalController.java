package com.MarcaPlay.api.controller;

import com.MarcaPlay.api.domain.Local.Local;
import com.MarcaPlay.api.domain.Local.LocalRequestDTO;
import com.MarcaPlay.api.domain.Partida.Partida;
import com.MarcaPlay.api.domain.Partida.PartidaRequestDTO;
import com.MarcaPlay.api.service.LocalService;
import com.MarcaPlay.api.service.PartidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/local")
public class LocalController {
    @Autowired
    private LocalService localService;

    @PostMapping
    public ResponseEntity<Local> create(@RequestBody LocalRequestDTO local) {
        Local newLcoal = localService.criarLocal(local);
        return ResponseEntity.ok().body(newLcoal);
    }
}
