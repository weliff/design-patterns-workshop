package criacao.builder.desafio;

import static org.junit.Assert.*;

import org.junit.Test;

public class NotaFiscalTest {
	
	@Test
	public void deveCalcularNotaFiscalImpostoPessoaFisica() throws Exception {
		NotaFiscal nf = new NotaFiscalBuilder().pessoaFisica()
												.comData("12/03/2015")
												.comProduto("Mochila", 3, 201.0)
												.build();
		assertEquals(215.07, nf.calcularImposto().doubleValue(), 0.0001);
	}
	
	@Test
	public void deveCalcularNotaFiscalImpostoPessoaJuridica() throws Exception {
		NotaFiscal nf = new NotaFiscalBuilder().pessoaJuridica()
												.comData("12/03/2015")
												.comProduto("Mochila", 3, 201.0)
												.build();
		
		assertEquals(209.04, nf.calcularImposto().doubleValue(), 0.0001);
	}
}
