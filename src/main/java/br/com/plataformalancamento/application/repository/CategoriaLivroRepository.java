package br.com.plataformalancamento.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.plataformalancamento.application.model.CategoriaLivroModel;

@RepositoryRestResource(collectionResourceRel = "categoriaLivro", path = "categoria-livro")
public interface CategoriaLivroRepository extends JpaRepository<CategoriaLivroModel, Long> { }
