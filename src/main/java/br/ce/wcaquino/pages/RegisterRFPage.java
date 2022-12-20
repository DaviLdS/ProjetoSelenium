package br.ce.wcaquino.pages;

import org.openqa.selenium.By;

import br.ce.wcaquino.core.BasePage;
import br.ce.wcaquino.core.DriverFactory;

public class RegisterRFPage extends BasePage {
	
	public void acessarTelaInicial(){
		DriverFactory.getDriver().get("http://gcp.rfeternals.com/gamecp_register.php");
	}
	
	public void entrarRegistro() {
		clicarBotao(By.xpath("/html/body/div[3]/center/button[1]"));
	}
	
	public void setUserName(String user) {
		escrever(By.xpath("/html/body/div[2]/div/div/div/div/form/fieldset/div[1]/input"), user);
	}
	
	public void setEmail(String email) {
		escrever(By.xpath("/html/body/div[2]/div/div/div/div/form/fieldset/div[2]/input"), email);
		escrever(By.xpath("/html/body/div[2]/div/div/div/div/form/fieldset/div[3]/input"), email);
		
	}
	
	public void setSenha(String senha) {
		escrever(By.xpath("/html/body/div[2]/div/div/div/div/form/fieldset/div[4]/input"), senha);
		escrever(By.xpath("/html/body/div[2]/div/div/div/div/form/fieldset/div[5]/input"), senha);
	}
	
	public void setPin() {
		escrever(By.xpath("/html/body/div[2]/div/div/div/div/form/fieldset/div[6]/input"),"123456");
	}
	
	public void registrar(){
		clicarBotao(By.xpath("/html/body/div[2]/div/div/div/div/form/fieldset/div[7]/button"));
	}
	
	public void logar(String user, String email, String senha) {
		acessarTelaInicial();
		entrarRegistro();
		setUserName(user);
		setEmail(email);
		setSenha(senha);
		setPin();
		registrar();
		DriverFactory.killDriver();
	}

}
