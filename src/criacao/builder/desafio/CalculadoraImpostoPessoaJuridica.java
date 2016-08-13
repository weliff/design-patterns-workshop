package criacao.builder.desafio;

import java.math.BigDecimal;

public class CalculadoraImpostoPessoaJuridica implements CalculadoraImposto {

	@Override
	public BigDecimal calcular(BigDecimal valor) {
		return valor.multiply(new BigDecimal("1.04"));
	}

}
