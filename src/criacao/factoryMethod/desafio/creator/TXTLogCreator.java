package criacao.factoryMethod.desafio.creator;

import criacao.factoryMethod.desafio.logger.LogTXT;
import criacao.factoryMethod.desafio.logger.Logger;
import criacao.factoryMethod.desafio.logger.LoggerPrinter;

public class TXTLogCreator extends Logger{

	@Override
	protected LoggerPrinter createLogger() {
		return new LogTXT();
	}

}
