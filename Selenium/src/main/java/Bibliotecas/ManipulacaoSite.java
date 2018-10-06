package Bibliotecas;

import java.io.IOException;

import org.openqa.selenium.By;

import com.relevantcodes.extentreports.LogStatus;

import Repositorio.Funcionalidades;

public class ManipulacaoSite {
	
	public static String manipulacao = "";
	
	public static void metodoAutomacao() throws IOException {
		
		LeituraDeDados.setArquivo("C:\\Users\\1414950\\Documents\\eclipse-workspace\\Selenium.xlsx","Link");
		manipulacao = LeituraDeDados.getValorCelula(1, LeituraDeDados.getNumeroColuna("sTipoTeste"));
		switch(manipulacao) {
			
			case "Automação Web":
				Funcionalidades.comecarAutomacao(Utilitarios.driver).click();
				break;
			case "Automação API":
				System.out.println("Não estamos automatizando API's ainda");
				break;
			default: 
					System.out.println("Opção inválida na massa de dados");
		}
	}
	
	public static void formulario() throws InterruptedException, IOException {
		
		Funcionalidades.itemFormulario(Utilitarios.driver).click();
		LeituraDeDados.setArquivo("C:\\Users\\1414950\\Documents\\eclipse-workspace\\Selenium.xlsx","Link");
		manipulacao  = LeituraDeDados.getValorCelula(1, LeituraDeDados.getNumeroColuna("sTipoFormulario"));
		switch(manipulacao) {
			
			case "Criar Usuários":
				Thread.sleep(1000);
				Funcionalidades.criarUsuarios(Utilitarios.driver).click();
				informacoes();
				break;
			case "Lista de Usuários":
				Thread.sleep(1000);
				System.out.println("Em breve");
				break;
		}
	}
	
	public static void informacoes() throws IOException {
		
		LeituraDeDados.setArquivo("C:\\Users\\1414950\\Documents\\eclipse-workspace\\Selenium.xlsx","CadastroUsuario");
		Funcionalidades.campoNome(Utilitarios.driver).sendKeys(LeituraDeDados.getValorCelula(1, LeituraDeDados.getNumeroColuna("sNome")));
		Funcionalidades.campoSobrenome(Utilitarios.driver).sendKeys(LeituraDeDados.getValorCelula(1, LeituraDeDados.getNumeroColuna("sSobrenome")));
		Funcionalidades.campoEmail(Utilitarios.driver).sendKeys(LeituraDeDados.getValorCelula(1, LeituraDeDados.getNumeroColuna("sEmail")));
		Funcionalidades.campoEndereco(Utilitarios.driver).sendKeys(LeituraDeDados.getValorCelula(1, LeituraDeDados.getNumeroColuna("sEndereco")));
		Funcionalidades.campoUniversidade(Utilitarios.driver).sendKeys(LeituraDeDados.getValorCelula(1, LeituraDeDados.getNumeroColuna("sUniversidade")));
		Funcionalidades.campoProfissao(Utilitarios.driver).sendKeys(LeituraDeDados.getValorCelula(1, LeituraDeDados.getNumeroColuna("sProfissao")));
		Funcionalidades.campoSexo(Utilitarios.driver).sendKeys(LeituraDeDados.getValorCelula(1, LeituraDeDados.getNumeroColuna("sSexo")));
		Funcionalidades.campoIdade(Utilitarios.driver).sendKeys(LeituraDeDados.getValorCelula(1, LeituraDeDados.getNumeroColuna("iIdade")));
		Funcionalidades.botaoCriar(Utilitarios.driver).click();
		
		if(Utilitarios.driver.findElement(By.id("notice")).isDisplayed()) {
			Utilitarios.extentTest.log(LogStatus.PASS, "Cadastro Concluído com sucesso" + Utilitarios.extentTest.addScreenCapture(Utilitarios.evidenciaPagina()));
		}
 		else {
 			Utilitarios.extentTest.log(LogStatus.FAIL, "Falha ao efetuar cadastro" + Utilitarios.extentTest.addScreenCapture(Utilitarios.evidenciaPagina()));
 		}
	}

}
