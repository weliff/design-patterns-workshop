package criacao.factoryMethod.desafio;

import criacao.factoryMethod.desafio.logger.Logger;

public class CalculadoraDeImpostos {
	
	private Logger logger;
	
	public CalculadoraDeImpostos(Logger logger){
		this.logger = logger;
	}
	
	public void calcular(double valor){
		logger.log("Imposto calculado no valor de " + valor);
	}

}
