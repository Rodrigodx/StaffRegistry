package com.rodrigo.staffregistry.model;

import com.rodrigo.staffregistry.enums.PessoaEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Cadastro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 60, nullable = false)
    private String nome;

    private String CPF;

    @Enumerated(EnumType.STRING)
    private PessoaEnum pessoaEnum;

    private String email;

    @Column(columnDefinition = "DATE")
    private LocalDate dataNascimento;

    private String telefone;

    private boolean whatsApp = false;

    @Embedded
    private Endereco endereco;


}
