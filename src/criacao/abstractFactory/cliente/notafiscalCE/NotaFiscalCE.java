package criacao.abstractFactory.cliente.notafiscalCE;

import criacao.abstractFactory.frameworkVendas.notaFiscal.NotaFiscal;

public class NotaFiscalCE implements NotaFiscal{

	@Override
	public Double gerarNotaFiscal(Double value) {
		return value * 0.1;
	}

}
