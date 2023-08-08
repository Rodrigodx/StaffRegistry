package com.rodrigo.staffregistry.repositories;

import com.rodrigo.staffregistry.model.Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CadastroRepository extends JpaRepository<Cadastro, Integer> {
}
