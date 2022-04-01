package teste;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LoginTeste {
	
	Login login = new Login();
	
	
	@Test
	public void loginTestValido() {
		
		assertTrue(login.login(1234, "administrador"));
		
	}
	
	@Test
	public void loginSenhaEmbranco() {
		
		assertTrue(login.login(0, "administrador"));
		
	}
	
	@Test
	public void loginUsuarioEmbranco() {
		
		assertTrue(login.login(1234, ""));
		
	}
	
	@Test
	public void loginUsuarioInvalido() {
		
		assertTrue(login.login(1234, "Admin"));
		
	}
	
	

}
