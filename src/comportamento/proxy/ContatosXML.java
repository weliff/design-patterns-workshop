package comportamento.proxy;

import java.net.URL;
import java.util.List;

import com.thoughtworks.xstream.XStream;

public class ContatosXML implements Contatos {

	@Override
	public List<Contato> recuperar(String arquivo) {
		XStream xstream = new XStream();
		xstream.alias("contatos", List.class);
		xstream.alias("contato", Contato.class);
		URL xml = this.getClass().getResource(arquivo);
		@SuppressWarnings("unchecked")
		List<Contato> emails = (List<Contato>) xstream.fromXML(xml);
		return emails;
	}

}
