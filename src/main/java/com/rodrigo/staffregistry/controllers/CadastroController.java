package com.rodrigo.staffregistry.controllers;

import com.rodrigo.staffregistry.dto.CadastroRequestDTO;
import com.rodrigo.staffregistry.dto.CadastroResponseDTO;
import com.rodrigo.staffregistry.services.CadastroService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping (value = "/api/cadastros")
@RequiredArgsConstructor
public class CadastroController {

    private final CadastroService cadastroService;

    @PostMapping
    @Operation(summary = "Salvar cadastro")
    public ResponseEntity<CadastroResponseDTO> save (@RequestBody CadastroRequestDTO cadastro){
        return new ResponseEntity<>(cadastroService.save(cadastro), HttpStatus.CREATED);
    }

    @PutMapping(value = "/{id}")
    @Operation(summary = "Atualizar um cadastro")
    public ResponseEntity<CadastroResponseDTO> update(@RequestBody CadastroRequestDTO cadastroRequestDTO, @PathVariable Integer id){
        return ResponseEntity.ok(cadastroService.update(cadastroRequestDTO, id));
    }

    @GetMapping
    @Operation(summary = "Consultar cadastros")
    public ResponseEntity<List<CadastroResponseDTO>> findAll(){
        return ResponseEntity.ok(cadastroService.findAll());
    }

    @GetMapping(value = "/{id}")
    @Operation(summary = "Buscar cadastro por Id")
    public ResponseEntity<CadastroResponseDTO> findById(@PathVariable Integer id){
        return ResponseEntity.ok(cadastroService.findById(id));
    }

    @DeleteMapping(value = "/{id}")
    @Operation(summary = "Delatar um cadastro")
    public ResponseEntity<Void> delete (@PathVariable Integer id){
        cadastroService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
