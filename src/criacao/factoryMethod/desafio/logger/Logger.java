package criacao.factoryMethod.desafio.logger;

import java.time.LocalDateTime;

public abstract class Logger {
	
	protected abstract LoggerPrinter createLogger();
	
	public void log(String msg){
		createLogger().print("Date: "+ LocalDateTime.now()).print("MSG: " +msg);
	}

}
