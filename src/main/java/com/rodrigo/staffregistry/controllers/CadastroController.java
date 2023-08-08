package com.rodrigo.staffregistry.controllers;

import com.rodrigo.staffregistry.model.Cadastro;
import com.rodrigo.staffregistry.services.CadastroService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping (value = "/api/cadastro")
@RequiredArgsConstructor
public class CadastroController {

    private final CadastroService cadastroService;

    @PostMapping
    @Operation(summary = "Salvar um cadastro de funcionário")
    public ResponseEntity<Cadastro> save (Cadastro cadastro){
        return new ResponseEntity<>(cadastroService.save(cadastro), HttpStatus.CREATED);
    }


}
