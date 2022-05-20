public class TesteConta {

    public static void main(String[] args) {
	ContaCorrente cc = new ContaCorrente(1111, 1111);
	cc.deposita(100);

	ContaPoupanca cp = new ContaPoupanca(2222, 2222);
	cp.deposita(200);

	cc.transfere(10, cp);

	double saldoCC = cc.getSaldo();
	double saldoCP = cp.getSaldo();

	System.out.println(saldoCC);
	System.out.println(saldoCP);

    }

}
