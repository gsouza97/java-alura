public class TesteGerente {

    public static void main(String[] args) {
        Gerente g1 = new Gerente();
	g1.setNome("Gabriel");
	g1.setSalario(5000);
	g1.setSenha(2222);

        System.out.println(g1.getNome());
        System.out.println(g1.getBonificacao());

	boolean autenticou = g1.autentica(2222);
	System.out.println(autenticou);
    }
}
