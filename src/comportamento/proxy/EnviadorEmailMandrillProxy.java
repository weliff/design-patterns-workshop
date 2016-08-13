package comportamento.proxy;

import java.util.List;
import java.util.stream.Collectors;

public class EnviadorEmailMandrillProxy implements EnviadorEmail{
	
	private List<Contato> contatos;
	private List<Contato> contatosBloqueados;
	
	public EnviadorEmailMandrillProxy(List<Contato> contatos, List<Contato> contatosBloqueados) {
		this.contatos = contatos;
		this.contatosBloqueados = contatosBloqueados;
	}

	@Override
	public void enviar(String msg) {
		contatos.removeAll(contatosBloqueados);
		List<String> emails = contatos.stream().map(Contato::getEmail).collect(Collectors.toList());
		EnviadorEmailMandrill mandrill = new EnviadorEmailMandrill(emails);
		mandrill.enviar(msg);
	}

}
