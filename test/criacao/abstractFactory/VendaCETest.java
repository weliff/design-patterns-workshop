package criacao.abstractFactory;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import criacao.abstractFactory.cliente.modulo.CearaModuloVendaFactory;
import criacao.abstractFactory.frameworkVendas.bean.Produto;
import criacao.abstractFactory.frameworkVendas.modulo.ModuloVendasFactory;
import criacao.abstractFactory.frameworkVendas.venda.Venda;

public class VendaCETest {
	
	
	private Venda venda;
	
	private List<Produto> produtos;
	
	@Before
	public void setUp(){
		ModuloVendasFactory moduloVendasFactory = new CearaModuloVendaFactory();
		venda = new Venda(moduloVendasFactory);
		produtos = Arrays.asList(new Produto("Computador", 1300.0));
	}
	
	@Test
	public void deveRealizarVendaParaCeara() throws Exception {
		String boleto = venda.realizarVenda(produtos);
		System.out.println(boleto);
		
	}

}
