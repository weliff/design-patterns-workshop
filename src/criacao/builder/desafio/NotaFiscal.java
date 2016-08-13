package criacao.builder.desafio;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import criacao.builder.desafio.beans.Produto;

public abstract class NotaFiscal {
	
	private String numero;
	private Date dataEmissao;
	private List<Produto> produtos;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Date getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public abstract CalculadoraImposto getCalculadoraImposto();
	
	public BigDecimal calcularImposto(){
		BigDecimal valorTotal = BigDecimal.ZERO;
		for (Produto produto : produtos) {
			valorTotal = valorTotal.add(produto.getValor());
		}
		return getCalculadoraImposto().calcular(valorTotal);
	}

}
