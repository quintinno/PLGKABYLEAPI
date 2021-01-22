package br.com.plataformalancamento.application.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "TB_LIVRO")
public class LivroModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "SEQ_LIVRO", sequenceName = "SEQ_LIVRO", schema = "public", allocationSize = 1)
	private Long codigo;
	
	@NotNull
	@Column(name = "SKU", length = 85)
	private String sku;
	
	@NotNull
	@Column(name = "NOME")
	private String nome;
	
	@Lob
	@Type(type = "org.hibernate.type.TextType")
	@Column(name = "DESCRICAO")
	private String descricao;
	
	@NotNull
	@Min(value = 0)
	@Column(name = "PRECO_UNITARIO", columnDefinition = "NUMERIC(10,2)")
	private BigDecimal precoUnitatio;
	
	@NotNull
	@Column(name = "URL_IMAGEM")
	private String urlImagem;
	
	@NotNull
	@Column(name = "QUANTIDADE_ESTOQUE")
	private Integer quantidadeEstoque;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATA_CRIACAO_REGISTRO")
	private Date dataCriacaoRegistro;
	
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATA_ATUALIZACAO_REGISTRO")
	private Date dataAtualizacaoRegistro;
	
	@NotNull
	@Column(name = "USUARIO_ULTIMA_ALTERACAO", length = 85)
	private String usuarioUltimaAlteracao;
	
	@Type(type = "org.hibernate.type.TextType")
	@ManyToOne
	@JoinColumn(name = "ID_CATEGORIA_LIVRO", nullable = false)
	private CategoriaLivroModel categoriaLivroModel;

	@NotNull
	@Column(name = "IS_ATIVO")
	private Boolean isAtivo;
	
	public LivroModel() { }

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPrecoUnitatio() {
		return precoUnitatio;
	}

	public void setPrecoUnitatio(BigDecimal precoUnitatio) {
		this.precoUnitatio = precoUnitatio;
	}

	public String getUrlImagem() {
		return urlImagem;
	}

	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}

	public Integer getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(Integer quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public Date getDataCriacaoRegistro() {
		return dataCriacaoRegistro;
	}

	public void setDataCriacaoRegistro(Date dataCriacaoRegistro) {
		this.dataCriacaoRegistro = dataCriacaoRegistro;
	}

	public Date getDataAtualizacaoRegistro() {
		return dataAtualizacaoRegistro;
	}

	public void setDataAtualizacaoRegistro(Date dataAtualizacaoRegistro) {
		this.dataAtualizacaoRegistro = dataAtualizacaoRegistro;
	}

	public String getUsuarioUltimaAlteracao() {
		return usuarioUltimaAlteracao;
	}

	public void setUsuarioUltimaAlteracao(String usuarioUltimaAlteracao) {
		this.usuarioUltimaAlteracao = usuarioUltimaAlteracao;
	}

	public Boolean getIsAtivo() {
		return isAtivo;
	}

	public void setIsAtivo(Boolean isAtivo) {
		this.isAtivo = isAtivo;
	}

	public CategoriaLivroModel getCategoriaLivroModel() {
		return categoriaLivroModel;
	}

	public void setCategoriaLivroModel(CategoriaLivroModel categoriaLivroModel) {
		this.categoriaLivroModel = categoriaLivroModel;
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
		LivroModel other = (LivroModel) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

}
