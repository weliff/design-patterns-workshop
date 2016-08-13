package criacao.builder.desafio;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import criacao.builder.desafio.beans.Produto;

public class NotaFiscalBuilder {
	
	public NotaFiscalBuilderValid pessoaFisica(){
		return new NotaFiscalBuilderValid(new NotaFiscalPessoaFisica());
	}
	
	public NotaFiscalBuilderValid pessoaJuridica(){
		return new NotaFiscalBuilderValid(new NotaFiscalPessoaJuridica());
	}
	
	public class NotaFiscalBuilderValid {
		
		private NotaFiscal instancia;
		
		private NotaFiscalBuilderValid(NotaFiscal instancia) {
			this.instancia = instancia;
		}
		
		public NotaFiscalBuilderValid comData(String data) throws ParseException{
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date date = sdf.parse(data);
			instancia.setDataEmissao(date);
			return this;
		}
		
		public NotaFiscalBuilderValid comProduto(String nome, Integer qtd, String valor){
			addProduto(nome, qtd, new BigDecimal(valor));
			return this;
		}
		
		public NotaFiscalBuilderValid comProduto(String nome, Integer qtd, Double valor){
			addProduto(nome, qtd, new BigDecimal(valor));
			return this;
		}
		
		private void addProduto(String nome, Integer qtd, BigDecimal valor){
			if(instancia.getProdutos() == null)
				instancia.setProdutos(new ArrayList<Produto>());
			Produto produto = new Produto();
			produto.setNome(nome);
			produto.setQuantidade(qtd);
			produto.setValor(valor);
			instancia.getProdutos().add(produto);
		}
		
		public NotaFiscal build(){
			return instancia;
		}
	}
}
