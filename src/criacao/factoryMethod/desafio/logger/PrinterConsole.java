package criacao.factoryMethod.desafio.logger;

public class PrinterConsole implements LoggerPrinter {

	@Override
	public LoggerPrinter print(String msg) {
		System.out.println(msg);
		
		return this;
	}

}
