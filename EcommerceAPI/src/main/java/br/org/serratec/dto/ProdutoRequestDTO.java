package br.org.serratec.dto;

import java.util.Date;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import br.org.serratec.model.Categoria;
import br.org.serratec.model.Cliente;

public class ProdutoRequestDTO {

	private String nome;
	
	private String descricao;
	
	private Integer quantidadeEstoque;
	
	private Date dataCadastro;
	
	private Double valorUnitario;
	
	private MultipartFile imagemProduto;
	
	private List<Categoria> categoria;
	
	private Cliente cliente;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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

	public Integer getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(Integer quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public List<Categoria> getCategoria() {
		return categoria;
	}

	public void setCategoria(List<Categoria> categoria) {
		this.categoria = categoria;
	}

	public MultipartFile getImagemProduto() {
		return imagemProduto;
	}

	public void setImagemProduto(MultipartFile imagemProduto) {
		this.imagemProduto = imagemProduto;
	}
	
	
}
