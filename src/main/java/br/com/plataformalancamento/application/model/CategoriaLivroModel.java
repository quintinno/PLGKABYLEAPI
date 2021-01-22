package br.com.plataformalancamento.application.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "TB_CATEGORIA_LIVRO")
public class CategoriaLivroModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "SEQ_CATEGORIA_LIVRO", sequenceName = "SEQ_CATEGORIA_LIVRO", schema = "public", allocationSize = 1)
	private Long codigo;
	
	@NotNull
	@Column(name = "DESCRICAO", length = 85)
	private String descricao;
	
	@Type(type = "org.hibernate.type.TextType")
	@OneToMany(mappedBy = "categoriaLivroModel", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	private Set<LivroModel> livroModelList = new HashSet<>();
	
	public CategoriaLivroModel() { }
	
	public CategoriaLivroModel(@NotNull String descricao) {
		this.descricao = descricao;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Set<LivroModel> getLivroModelList() {
		return livroModelList;
	}

	public void setLivroModelList(Set<LivroModel> livroModelList) {
		this.livroModelList = livroModelList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CategoriaLivroModel other = (CategoriaLivroModel) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

}
