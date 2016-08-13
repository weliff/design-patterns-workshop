package criacao.factoryMethod.desafio.creator;

import criacao.factoryMethod.desafio.logger.Logger;
import criacao.factoryMethod.desafio.logger.LoggerPrinter;
import criacao.factoryMethod.desafio.logger.PrinterConsole;

public class ConsoleLogCreator extends Logger{

	@Override
	public LoggerPrinter createLogger() {
		return new PrinterConsole();
	}


}
