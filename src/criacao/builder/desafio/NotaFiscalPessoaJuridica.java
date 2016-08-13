package criacao.builder.desafio;

public class NotaFiscalPessoaJuridica extends NotaFiscal{

	@Override
	public CalculadoraImposto getCalculadoraImposto() {
		return new CalculadoraImpostoPessoaJuridica();
	}

}
