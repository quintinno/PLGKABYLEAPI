package br.com.plataformalancamento.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.plataformalancamento.application.model.LivroModel;

@RepositoryRestResource(collectionResourceRel = "livroList", path = "livro")
public interface LivroRepository extends JpaRepository<LivroModel, Long> { }
