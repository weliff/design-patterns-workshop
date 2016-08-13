package criacao.abstractFactory.cliente.modulo;

import criacao.abstractFactory.cliente.boleto.bb.BoletoBB;
import criacao.abstractFactory.cliente.notafiscalCE.NotaFiscalCE;
import criacao.abstractFactory.frameworkVendas.boleto.Boleto;
import criacao.abstractFactory.frameworkVendas.modulo.ModuloVendasFactory;
import criacao.abstractFactory.frameworkVendas.notaFiscal.NotaFiscal;

public class CearaModuloVendaFactory implements ModuloVendasFactory{

	@Override
	public Boleto createBoleto() {
		return new BoletoBB();
	}

	@Override
	public NotaFiscal createNotaFiscal() {
		return new NotaFiscalCE();
	}

}
