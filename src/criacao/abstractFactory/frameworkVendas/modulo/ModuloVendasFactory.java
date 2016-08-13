package criacao.abstractFactory.frameworkVendas.modulo;

import criacao.abstractFactory.frameworkVendas.boleto.Boleto;
import criacao.abstractFactory.frameworkVendas.notaFiscal.NotaFiscal;

public interface ModuloVendasFactory {
	
	public Boleto createBoleto();
	public NotaFiscal createNotaFiscal();

}
