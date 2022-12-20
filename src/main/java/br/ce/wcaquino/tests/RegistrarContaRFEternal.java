package br.ce.wcaquino.tests;

import org.junit.After;
import org.junit.Test;

import br.ce.wcaquino.core.BaseTest;
import br.ce.wcaquino.core.DriverFactory;
import br.ce.wcaquino.pages.RegisterRFPage;

public class RegistrarContaRFEternal extends BaseTest {
	private RegisterRFPage rfpage = new RegisterRFPage();
	
	@After
	public void finaliza(){
		DriverFactory.killDriver();
	}
	
	@Test
	public void cadastrarConta(){
		int i;
		for(i=0;i<10;i++) {
		rfpage.logar("luis"+i,"luis"+i+"@gmail.com","luis1601");
		}
	}
	
	
}
