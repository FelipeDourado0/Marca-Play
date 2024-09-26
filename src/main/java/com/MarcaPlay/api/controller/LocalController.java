package com.MarcaPlay.api.controller;

import com.MarcaPlay.api.domain.Local.Local;
import com.MarcaPlay.api.domain.Local.LocalRequestDTO;
import com.MarcaPlay.api.service.LocalService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/local")
public class LocalController {
    @Autowired
    private LocalService localService;

    @PostMapping
    @Operation(summary = "Criar local", description = "Criar local")
    public ResponseEntity<Local> create(@RequestBody LocalRequestDTO local){

            Local newLcoal = localService.criarLocal(local);
            return ResponseEntity.ok().body(newLcoal);
    }

    @GetMapping
    @Operation(summary = "Obter lista de Locais", description = "Obter lista de Locais")
    public ResponseEntity<List<Local>> getAll(){
        List<Local> todosLcoal = localService.ObterTodosLocal();
        return ResponseEntity.ok().body(todosLcoal);
    }
}
