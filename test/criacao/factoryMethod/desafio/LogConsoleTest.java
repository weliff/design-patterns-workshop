package criacao.factoryMethod.desafio;

import static org.junit.Assert.*;

import org.junit.Test;

import criacao.factoryMethod.desafio.creator.ConsoleLogCreator;
import criacao.factoryMethod.desafio.creator.XMLLogCreator;
import criacao.factoryMethod.desafio.logger.Logger;

public class LogConsoleTest {
	
	@Test
	public void deveCriarLogConsole() throws Exception {
		ConsoleLogCreator log = new ConsoleLogCreator();
	}
	
	@Test
	public void deveImprimirLogNoConsole() throws Exception {
		Logger logger = new ConsoleLogCreator();
		CalculadoraDeImpostos c = new CalculadoraDeImpostos(logger);
		c.calcular(12.0);
	}
	
	@Test
	public void deveImprimirLogNoXML() throws Exception {
		Logger logger = new XMLLogCreator();
		CalculadoraDeImpostos c = new CalculadoraDeImpostos(logger);
		c.calcular(12.0);
	}

}
