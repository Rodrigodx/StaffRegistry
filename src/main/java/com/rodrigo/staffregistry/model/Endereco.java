package com.rodrigo.staffregistry.model;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Endereco {

    private String CEP;
    private String longradouro;
    private Integer numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String UF;
    private String pais;

}
