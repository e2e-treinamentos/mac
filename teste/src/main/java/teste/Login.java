package teste;

public class Login {
	
	boolean autenticado = false;
	
	int senhaCadastradaBanco = 1234;
	String usuarioCadastradoBanco = "administrador";
	
	
	public boolean login(int senha, String usuario) {
		
		if(usuario.equals(usuarioCadastradoBanco) && senha == senhaCadastradaBanco) {
			autenticado = true;
			
			System.out.println("Usuário ou senha inválida");
			
		}else if(usuario.isBlank()) {
			
			System.out.println("Usuario em branco");
			
		}else if(senha < 999 || senha > 9999) {
			
			System.out.println("Permitido somente 4 digitos");
			
			autenticado = false;
		}
		return autenticado;
	}

}
