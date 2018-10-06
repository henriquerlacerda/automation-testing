package stepsDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import modules.ManipulacaoSite;
import utils.LeituraDeDados;
import utils.Utilitarios;

public class Steps {

	@Given("^Usuário está na Home Page$")
	public void usuário_está_na_Home_Page() throws Throwable {
		Utilitarios.elaboraReport();
		LeituraDeDados.setArquivo("C:\\Users\\1414950\\Documents\\eclipse-workspace\\Selenium.xlsx","Link");
		Utilitarios.abrirBrowser();
		Utilitarios.abrirPagina(LeituraDeDados.getValorCelula(1,LeituraDeDados.getNumeroColuna("sUrl")));
	}

	@Given("^Clicou em começar automação web$")
	public void clicou_em_começar_automação_web() throws Throwable {
		ManipulacaoSite.metodoAutomacao();
	}

	@Given("^Clicou em formulário criar usuário, preencheu o formalário de cadastro e clicar em enviar$")
	public void clicou_em_formulário_criar_usuário() throws Throwable {
		ManipulacaoSite.formulario();
	}

	@Then("^Será exibido a mensagem de confirmação$")
	public void será_exibido_a_mensagem_de_confirmação() throws Throwable {
		//Utilitarios.fecharBrowser();
		Utilitarios.extent.endTest(Utilitarios.extentTest);
		Utilitarios.extent.flush();
	}

}
