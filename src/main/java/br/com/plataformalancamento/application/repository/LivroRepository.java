package br.com.plataformalancamento.application.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import br.com.plataformalancamento.application.model.LivroModel;

@CrossOrigin("http://localhost:8080")
@RepositoryRestResource(collectionResourceRel = "livroList", path = "livro")
public interface LivroRepository extends JpaRepository<LivroModel, Long> {
	
	public Page<LivroModel> findByCategoriaLivroModelCodigo(@Param("codigo") Long codigo, Pageable pageable);
	
}
