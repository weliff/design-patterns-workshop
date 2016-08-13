package criacao.builder.desafio;


public class NotaFiscalPessoaFisica extends NotaFiscal{

	@Override
	public CalculadoraImposto getCalculadoraImposto() {
		return new CalculadoraImpostoPessoFisica();
	}

}
