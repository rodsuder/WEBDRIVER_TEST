package openGoogle;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class googlePage {

	private static WebDriver driver;
	
	//Cria uma inst�ncia no navegador e abre a p�gina do Google
	@BeforeClass
	public static void setUpTest(){
		driver = new FirefoxDriver();
		driver.get("http://www.google.com.br/search");
	}
	
	//Met�do que finaliza o teste - stop webdriver
	@AfterClass
	public static void tearDownTest(){
		driver.quit();
	}
	
	//Digita o valor para uma consulta e clica no botao
	@Test
	public void searchBy(){
		//verifica se o elemento de pesquisa est� visivel na tela
		driver.findElement(By.id("lst-ib")).sendKeys("maratona de porto alegre");
		
		driver.findElement(By.name("btnG")).click();
	}
}
