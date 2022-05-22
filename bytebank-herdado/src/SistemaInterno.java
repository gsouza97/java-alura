public class SistemaInterno {

    private int senha = 2222;

    public void autentica(Autenticavel autenticavel) {
	boolean autenticou = autenticavel.autentica(this.senha);
	if (autenticou) {
	    System.out.println("Autenticou");
	} else {
	    System.out.println("Não autenticou");
	}
    }
}
