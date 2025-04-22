public class ContaCorrente implements Conta {
    private double saldo;
    private double taxa;

    public ContaCorrente(double taxa) {
        this.taxa = taxa;
        this.saldo = 0;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor + this.taxa;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }

}
