package criacao.builder.desafio;

import java.math.BigDecimal;

public class CalculadoraImpostoPessoFisica implements CalculadoraImposto {

	@Override
	public BigDecimal calcular(BigDecimal valor) {
		return valor.multiply(new BigDecimal("1.07"));
	}

}
