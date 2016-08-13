package criacao.abstractFactory.frameworkVendas.boleto;

import java.util.List;

import criacao.abstractFactory.frameworkVendas.bean.Produto;

public interface Boleto {
	
	public String gerarBoleto(List<Produto> produtos, Double valorImposto);

}
