package com.rodrigo.staffregistry.controllers;

import com.rodrigo.staffregistry.dto.CadastroRequestDTO;
import com.rodrigo.staffregistry.dto.CadastroResponseDTO;
import com.rodrigo.staffregistry.services.CadastroService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
    @GetMapping
    @Operation(summary = "Consultar cadastros")
    public ResponseEntity<List<CadastroResponseDTO>> findAll(){
        return ResponseEntity.ok(cadastroService.findAll());
    }


}
