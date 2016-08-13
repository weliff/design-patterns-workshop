package criacao.factoryMethod.desafio.logger;

public class LogTXT implements LoggerPrinter {

	@Override
	public LoggerPrinter print(String msg) {
		System.out.println("Log registrado no arquivo TXT.");
		return this;
	}

}
