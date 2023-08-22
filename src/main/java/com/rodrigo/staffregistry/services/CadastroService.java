package com.rodrigo.staffregistry.services;

import com.rodrigo.staffregistry.dto.cadastro.CadastroRequestDTO;
import com.rodrigo.staffregistry.dto.cadastro.CadastroResponseDTO;
import com.rodrigo.staffregistry.model.Cadastro;
import com.rodrigo.staffregistry.repositories.CadastroRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class CadastroService {

    private final CadastroRepository cadastroRepository;
    private final ModelMapper modelMapper = new ModelMapper();

    @ReadOnlyProperty
    public List<CadastroResponseDTO> findAll(){
       List<Cadastro> cadastros = cadastroRepository.findAll();
       return cadastros.stream().map(cadastro -> modelMapper.map(cadastro, CadastroResponseDTO.class)).collect(Collectors.toList());
    }

    @ReadOnlyProperty
    public CadastroResponseDTO findById(Integer id){
        Cadastro cadastro = cadastroRepository.findById(id).get();
        CadastroResponseDTO cadastroResponseDTO = modelMapper.map(cadastro, CadastroResponseDTO.class);
        return cadastroResponseDTO;
    }

    @Transactional
    public CadastroResponseDTO save(CadastroRequestDTO cadastro){
        Cadastro cadastro1 = modelMapper.map(cadastro, Cadastro.class);
        cadastroRepository.save(cadastro1);
        return modelMapper.map(cadastro1, CadastroResponseDTO.class);
    }

    @Transactional
    public CadastroResponseDTO update(CadastroRequestDTO cadastroRequestDTO, Integer id){
        Cadastro cadastro = modelMapper.map(cadastroRequestDTO, Cadastro.class);
        if(cadastroRepository.existsById(id)){
            cadastro.setId(id);
            cadastroRepository.save(cadastro);
        }
        return modelMapper.map(cadastro, CadastroResponseDTO.class);
    }

    @Transactional
    public void delete (Integer id){
        if(cadastroRepository.existsById(id)){
            cadastroRepository.deleteById(id);
        }
    }

}
