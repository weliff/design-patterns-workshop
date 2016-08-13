package comportamento.proxy;

import java.util.List;

import org.junit.Test;

public class EnviadorEmailTest {
	
	@Test
	public void deveEnviarEmailParaNaoBloqueados() throws Exception {
		Contatos contatosXML = new ContatosXML();
		List<Contato> contatos = contatosXML.recuperar("contatos.xml");
		List<Contato> contatosBloqueados = contatosXML.recuperar("contatos-bloqueados.xml");
		EnviadorEmail enviador = new EnviadorEmailMandrillProxy(contatos, contatosBloqueados);
		enviador.enviar("Esse email é de teste");
	}

}
