package criacao.abstractFactory.cliente.boleto.bb;

import java.util.List;

import criacao.abstractFactory.frameworkVendas.bean.Produto;
import criacao.abstractFactory.frameworkVendas.boleto.Boleto;

public class BoletoBB implements Boleto {

	@Override
	public String gerarBoleto(List<Produto> produtos, Double valorImposto) {
		String boleto = "PRODUTOS: {" + produtos + "} \n"
				+ "=========================================================================\n"
				+ "VALOR DO IMPOSTO:" + valorImposto;
		return boleto;
	}

}
