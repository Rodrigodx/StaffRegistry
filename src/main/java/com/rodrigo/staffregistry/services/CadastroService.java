package com.rodrigo.staffregistry.services;

import com.rodrigo.staffregistry.model.Cadastro;
import com.rodrigo.staffregistry.repositories.CadastroRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CadastroService {

    private final CadastroRepository cadastroRepository;

    @Transactional
    public Cadastro save(Cadastro cadastro){
        return cadastroRepository.save(cadastro);
    }

}
