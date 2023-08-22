package com.rodrigo.staffregistry.dto.imagem;

import jakarta.persistence.Lob;
import lombok.Data;

@Data
public class ImagemResponseDTO {

    private Integer id;

    private byte[] imagem;

}
