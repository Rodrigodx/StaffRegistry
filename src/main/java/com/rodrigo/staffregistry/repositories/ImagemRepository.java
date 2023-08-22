package com.rodrigo.staffregistry.repositories;

import com.rodrigo.staffregistry.model.Imagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImagemRepository extends JpaRepository<Imagem, Integer> {
}
