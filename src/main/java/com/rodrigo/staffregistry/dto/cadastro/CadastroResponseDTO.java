package com.rodrigo.staffregistry.dto.cadastro;

import com.rodrigo.staffregistry.enums.PessoaEnum;
import com.rodrigo.staffregistry.model.Endereco;
import lombok.Data;

import java.time.LocalDate;

@Data
public class CadastroResponseDTO{

    private Integer id;

    private String nome;

    private String CPF;

    private PessoaEnum pessoaEnum;

    private String email;

    private LocalDate dataNascimento;

    private String telefone;

    private boolean whatsApp;

    private Endereco endereco;

}
