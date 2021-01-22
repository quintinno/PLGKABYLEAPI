package br.com.plataformalancamento.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.plataformalancamento.application.model.CategoriaLivroModel;

public interface CategoriaLivroRepository extends JpaRepository<CategoriaLivroModel, Long> { }
