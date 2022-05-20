public class ContaCorrente extends Conta{

    public ContaCorrente(int agencia, int numero) {
	super(agencia, numero);
    }

    @Override
    public boolean saca(double valor) {
	double taxaDeSaque = 0.20;
	return super.saca(valor + taxaDeSaque);
    }
}
