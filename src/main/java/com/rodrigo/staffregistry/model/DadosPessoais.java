package com.rodrigo.staffregistry.model;

import com.rodrigo.staffregistry.enums.PessoaEnum;
import jakarta.persistence.Embeddable;

import lombok.Data;

import java.time.LocalDate;
@Data
@Embeddable
public class DadosPessoais {

    private String CPF;

    private PessoaEnum pessoa;

    private String nome;

    private String email;

    private LocalDate dataNascimento;

    private String telefone;

    private boolean whatsApp = false;

}
