package Scripts;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import Bibliotecas.Utilitarios;
import Bibliotecas.LeituraDeDados;
import Bibliotecas.ManipulacaoSite;

public class FirstScript {
	
	@BeforeClass
	public static void carregamentoDados() throws Exception, IOException {
		Utilitarios.elaboraReport();
		LeituraDeDados.setArquivo("C:\\Users\\1414950\\Documents\\eclipse-workspace\\Selenium.xlsx","Link");
		Utilitarios.abrirBrowser();
		Utilitarios.abrirPagina(LeituraDeDados.getValorCelula(1,LeituraDeDados.getNumeroColuna("sUrl")));
	}
	
	@Test
	public void test() throws InterruptedException, IOException {
		ManipulacaoSite.metodoAutomacao();
		ManipulacaoSite.formulario();
	}
	
	@AfterClass
	public static void encerramentoTeste() {
		//Utilitarios.fecharBrowser();
		Utilitarios.extent.endTest(Utilitarios.extentTest);
		Utilitarios.extent.flush();
	}
}
