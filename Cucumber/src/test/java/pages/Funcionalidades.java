package pages;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import utils.Utilitarios;

public class Funcionalidades {

	private static WebElement elemento = null;
	
	public static WebElement comecarAutomacao(WebDriver driver) throws IOException {
		try {
			elemento = driver.findElement(By.xpath("//*[@id='index-banner']/div/div[3]/a"));
			Assert.assertTrue("Botão começar automação encontrado", elemento.isDisplayed());
			Utilitarios.extentTest.log(LogStatus.PASS, "Objeto comecarAutomacao encontrado" + Utilitarios.extentTest.addScreenCapture(Utilitarios.evidenciaPagina()));
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			Assert.assertTrue("Botão começar automação não encontrado", false);
			Utilitarios.extentTest.log(LogStatus.FAIL, "Objeto comecarAutomacao não encontrado" + Utilitarios.extentTest.addScreenCapture(Utilitarios.evidenciaPagina()));
		}
		return elemento;
	}
	
	public static WebElement itemFormulario(WebDriver driver) throws IOException {
		try {
			elemento = driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[1]/a"));
			Assert.assertTrue("Botão itemFormulario encontrado", elemento.isDisplayed());
			Utilitarios.extentTest.log(LogStatus.PASS, "Objeto itemFormulario encontrado" + Utilitarios.extentTest.addScreenCapture(Utilitarios.evidenciaPagina()));
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			Assert.assertTrue("Botão itemFormulario não encontrado", false);
			Utilitarios.extentTest.log(LogStatus.FAIL, "Objeto itemFormulario não encontrado" + Utilitarios.extentTest.addScreenCapture(Utilitarios.evidenciaPagina()));
		}		
		return elemento;
	}
	
	public static WebElement criarUsuarios(WebDriver driver) throws IOException {
		try {
			elemento = driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[1]/div/ul/li[1]/a"));
			Assert.assertTrue("Botão criarUsuarios encontrado", elemento.isDisplayed());
			Utilitarios.extentTest.log(LogStatus.PASS, "Objeto criarUsuarios encontrado" + Utilitarios.extentTest.addScreenCapture(Utilitarios.evidenciaPagina()));
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			Assert.assertTrue("Botão criarUsuarios não encontrado", false);
			Utilitarios.extentTest.log(LogStatus.FAIL, "Objeto criarUsuarios não encontrado" + Utilitarios.extentTest.addScreenCapture(Utilitarios.evidenciaPagina()));
		}
		return elemento;
	}
	
	public static WebElement campoNome(WebDriver driver) throws IOException {
		try {
			elemento = driver.findElement(By.id("user_name"));
			Assert.assertTrue("Botão campoNome encontrado", elemento.isDisplayed());
			Utilitarios.extentTest.log(LogStatus.PASS, "Objeto campoNome encontrado" + Utilitarios.extentTest.addScreenCapture(Utilitarios.evidenciaPagina()));
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			Assert.assertTrue("Botão começar automação não encontrado", false);
			Utilitarios.extentTest.log(LogStatus.FAIL, "Objeto campoNome não encontrado" + Utilitarios.extentTest.addScreenCapture(Utilitarios.evidenciaPagina()));
		}
		return elemento;
	}
	
	public static WebElement campoSobrenome(WebDriver driver) throws IOException {
		try {
			elemento = driver.findElement(By.id("user_lastname"));
			Assert.assertTrue("Botão campoSobrenome encontrado", elemento.isDisplayed());
			Utilitarios.extentTest.log(LogStatus.PASS, "Objeto campoSobrenome encontrado" + Utilitarios.extentTest.addScreenCapture(Utilitarios.evidenciaPagina()));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			Assert.assertTrue("Botão campoSobrenome não encontrado", false);
			Utilitarios.extentTest.log(LogStatus.FAIL, "Objeto campoSobrenome não encontrado" + Utilitarios.extentTest.addScreenCapture(Utilitarios.evidenciaPagina()));
		}
		return elemento;
	}
	
	public static WebElement campoEmail(WebDriver driver) throws IOException {
		try {
			elemento = driver.findElement(By.id("user_email"));
			Assert.assertTrue("Botão campoEmail encontrado", elemento.isDisplayed());
			Utilitarios.extentTest.log(LogStatus.PASS, "Objeto campoEmail encontrado" + Utilitarios.extentTest.addScreenCapture(Utilitarios.evidenciaPagina()));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			Assert.assertTrue("Botão campoEmail não encontrado", false);
			Utilitarios.extentTest.log(LogStatus.FAIL, "Objeto campoEmail não encontrado" + Utilitarios.extentTest.addScreenCapture(Utilitarios.evidenciaPagina()));
		}
		return elemento;
	}
	
	public static WebElement campoEndereco(WebDriver driver) throws IOException {
		try {
			elemento = driver.findElement(By.id("user_address"));
			Assert.assertTrue("Botão campoEndereco encontrado", elemento.isDisplayed());
			Utilitarios.extentTest.log(LogStatus.PASS, "Objeto campoEndereco encontrado" + Utilitarios.extentTest.addScreenCapture(Utilitarios.evidenciaPagina()));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			Assert.assertTrue("Botão campoEndereco não encontrado", false);
			Utilitarios.extentTest.log(LogStatus.FAIL, "Objeto campoEndereco não encontrado" + Utilitarios.extentTest.addScreenCapture(Utilitarios.evidenciaPagina()));
		}
		return elemento;
	}
	
	public static WebElement campoUniversidade(WebDriver driver) throws IOException {
		try {
			elemento = driver.findElement(By.id("user_university"));
			Assert.assertTrue("Botão campoUniversidade encontrado", elemento.isDisplayed());
			Utilitarios.extentTest.log(LogStatus.PASS, "Objeto campoUniversidade encontrado" + Utilitarios.extentTest.addScreenCapture(Utilitarios.evidenciaPagina()));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			Assert.assertTrue("Botão campoUniversidade não encontrado", false);
			Utilitarios.extentTest.log(LogStatus.FAIL, "Objeto campoUniversidade não encontrado" + Utilitarios.extentTest.addScreenCapture(Utilitarios.evidenciaPagina()));
		}
		return elemento;
	}
	
	public static WebElement campoProfissao(WebDriver driver) throws IOException {
		try {
			elemento = driver.findElement(By.id("user_profile"));
			Assert.assertTrue("Botão campoProfissao encontrado", elemento.isDisplayed());
			Utilitarios.extentTest.log(LogStatus.PASS, "Objeto campoProfissao encontrado" + Utilitarios.extentTest.addScreenCapture(Utilitarios.evidenciaPagina()));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			Assert.assertTrue("Botão campoProfissao não encontrado", false);
			Utilitarios.extentTest.log(LogStatus.FAIL, "Objeto campoProfissao não encontrado" + Utilitarios.extentTest.addScreenCapture(Utilitarios.evidenciaPagina()));
		}
		return elemento;
	}
	
	public static WebElement campoSexo(WebDriver driver) throws IOException {
		try {
			elemento = driver.findElement(By.id("user_gender"));
			Assert.assertTrue("Botão campoSexo encontrado", elemento.isDisplayed());
			Utilitarios.extentTest.log(LogStatus.PASS, "Objeto campoSexo encontrado" + Utilitarios.extentTest.addScreenCapture(Utilitarios.evidenciaPagina()));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			Assert.assertTrue("Botão campoSexo não encontrado", false);
			Utilitarios.extentTest.log(LogStatus.FAIL, "Objeto campoSexo não encontrado" + Utilitarios.extentTest.addScreenCapture(Utilitarios.evidenciaPagina()));
		}
		return elemento;
	}
	
	public static WebElement campoIdade(WebDriver driver) throws IOException {
		try {
			elemento = driver.findElement(By.id("user_age"));
			Assert.assertTrue("Botão campoIdade encontrado", elemento.isDisplayed());
			Utilitarios.extentTest.log(LogStatus.PASS, "Objeto campoIdade encontrado" + Utilitarios.extentTest.addScreenCapture(Utilitarios.evidenciaPagina()));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			Assert.assertTrue("Botão campoIdade não encontrado", false);
			Utilitarios.extentTest.log(LogStatus.FAIL, "Objeto campoIdade não encontrado" + Utilitarios.extentTest.addScreenCapture(Utilitarios.evidenciaPagina()));
		}
		return elemento;
	}
	
	public static WebElement botaoCriar(WebDriver driver) throws IOException {
		try {
			elemento = driver.findElement(By.xpath("//*[@id=\"new_user\"]/div[5]/div/div"));
			Assert.assertTrue("Botão botaoCriar encontrado", elemento.isDisplayed());
			Utilitarios.extentTest.log(LogStatus.PASS, "Objeto botaoCriar encontrado" + Utilitarios.extentTest.addScreenCapture(Utilitarios.evidenciaPagina()));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			Assert.assertTrue("Botão botaoCriar não encontrado", false);
			Utilitarios.extentTest.log(LogStatus.FAIL, "Objeto botaoCriar não encontrado" + Utilitarios.extentTest.addScreenCapture(Utilitarios.evidenciaPagina()));
		}
		return elemento;
	}	
	
}
