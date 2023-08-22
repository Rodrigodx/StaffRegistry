package com.rodrigo.staffregistry.services;

import com.rodrigo.staffregistry.dto.imagem.ImagemRequestDTO;
import com.rodrigo.staffregistry.dto.imagem.ImagemResponseDTO;
import com.rodrigo.staffregistry.model.Imagem;
import com.rodrigo.staffregistry.repositories.ImagemRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class ImagemService {

    private final ImagemRepository imagemRepository;
    private final ModelMapper modelMapper = new ModelMapper();


    @Transactional
    public ImagemResponseDTO save(MultipartFile imagem) throws IOException {
        ImagemRequestDTO imagemRequestDTO = new ImagemRequestDTO();
        imagemRequestDTO.setImagem(imagem.getBytes());


        Imagem imagem1 = modelMapper.map(imagemRequestDTO, Imagem.class);
        imagemRepository.save(imagem1);
        return modelMapper.map(imagem, ImagemResponseDTO.class);
    }



}
