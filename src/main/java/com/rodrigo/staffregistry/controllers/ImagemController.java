package com.rodrigo.staffregistry.controllers;

import com.rodrigo.staffregistry.dto.imagem.ImagemResponseDTO;
import com.rodrigo.staffregistry.services.ImagemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping(value = "api/imagens")
@RequiredArgsConstructor
public class ImagemController {

    private final ImagemService imagemService;

    @PostMapping
    public ResponseEntity<ImagemResponseDTO> save (@RequestParam ("imagem")MultipartFile imagem) throws IOException {
        return new ResponseEntity<>(imagemService.save(imagem), HttpStatus.CREATED);
    }


}
