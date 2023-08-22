package com.rodrigo.staffregistry.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Imagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Lob
    private byte[] imagem;

}
