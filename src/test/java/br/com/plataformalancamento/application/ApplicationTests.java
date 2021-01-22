package br.com.plataformalancamento.application;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.plataformalancamento.application.model.CategoriaLivroModel;
import br.com.plataformalancamento.application.model.LivroModel;
import br.com.plataformalancamento.application.repository.CategoriaLivroRepository;
import br.com.plataformalancamento.application.repository.LivroRepository;

@SpringBootTest
class ApplicationTests {

	@Autowired
	private CategoriaLivroRepository categoriaLivroRepository;
	
	@Autowired
	private LivroRepository livroRepository;
	
	@Test
	void contextLoads() { }
	
	@Test
	void cadastrarLivros() {
		CategoriaLivroModel categoriaLivroModel = new CategoriaLivroModel("Desenvolvimento Web");
			categoriaLivroRepository.save(categoriaLivroModel);
		LivroModel livroModel001 = new LivroModel();
			livroModel001.setCategoriaLivroModel(categoriaLivroModel);
			livroModel001.setDataAtualizacaoRegistro(new Date());
			livroModel001.setDataCriacaoRegistro(new Date());
			livroModel001.setDescricao("");
			livroModel001.setIsAtivo(true);
			livroModel001.setNome("PHP Programando com Orientação a Objetos");
			livroModel001.setPrecoUnitatio(new BigDecimal(71.91));
			livroModel001.setQuantidadeEstoque(10);
			livroModel001.setSku("LV_0001_0002");
			livroModel001.setUrlImagem("https://m.media-amazon.com/images/I/41hdpFDpNOL.jpg");
			livroModel001.setUsuarioUltimaAlteracao("000.000.000-00");
			livroRepository.save(livroModel001);
	}

}
