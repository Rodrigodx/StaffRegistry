package com.rodrigo.staffregistry.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Cadastro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Embedded
    private DadosPessoais dadosPessoais;

    @Embedded
    private Endereço endereço;


}
