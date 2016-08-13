package criacao.factoryMethod.desafio.creator;

import criacao.factoryMethod.desafio.logger.LogXML;
import criacao.factoryMethod.desafio.logger.Logger;
import criacao.factoryMethod.desafio.logger.LoggerPrinter;

public class XMLLogCreator extends Logger{
	
	@Override
	protected LoggerPrinter createLogger() {
		return new LogXML("logs.xml");
	}

}
