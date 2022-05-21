public class TesteFuncionario {

    public static void main(String[] args) {
        Gerente gabriel = new Gerente();
        gabriel.setNome("Gabriel Souza");
        gabriel.setCpf("222345968-09");
        gabriel.setSalario(1200.00);

        System.out.println(gabriel.getNome());
        System.out.println(gabriel.getBonificacao());

    }
}
