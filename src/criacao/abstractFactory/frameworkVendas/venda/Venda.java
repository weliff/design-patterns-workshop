package criacao.abstractFactory.frameworkVendas.venda;

import java.util.List;

import criacao.abstractFactory.frameworkVendas.bean.Produto;
import criacao.abstractFactory.frameworkVendas.boleto.Boleto;
import criacao.abstractFactory.frameworkVendas.modulo.ModuloVendasFactory;
import criacao.abstractFactory.frameworkVendas.notaFiscal.NotaFiscal;

public class Venda {
	
	private NotaFiscal notaFiscal;
	private Boleto boleto;
	
	public Venda(ModuloVendasFactory moduloVendasFactory) {
		this.notaFiscal = moduloVendasFactory.createNotaFiscal();
		this.boleto = moduloVendasFactory.createBoleto();
	}
	
	public String realizarVenda(List<Produto> produtos){
		Double valorTotal = produtos.stream().mapToDouble(p -> p.getValorUnitario()).sum();
		Double valorImposto = notaFiscal.gerarNotaFiscal(valorTotal);
		return boleto.gerarBoleto(produtos, valorImposto);
	}


}
