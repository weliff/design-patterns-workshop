package comportamento.proxy;

import java.util.List;

public class EnviadorEmailMandrill implements EnviadorEmail{
	
	private List<String> emails;
	
	public EnviadorEmailMandrill(List<String> emails) {
		this.emails = emails;
	}

	@Override
	public void enviar(String msg) {
		emails.forEach(e -> System.out.println("To:" + e + " \n Mensagem: "+ msg));
	}

}
