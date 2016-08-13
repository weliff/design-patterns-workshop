package criacao.factoryMethod.desafio.logger;

public class LogXML implements LoggerPrinter {

	private String nomeArquivo;
	
	public LogXML(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	@Override
	public LoggerPrinter print(String msg) {
		System.out.println("Log registrado no XML: " + nomeArquivo);
		return this;
	}

}
