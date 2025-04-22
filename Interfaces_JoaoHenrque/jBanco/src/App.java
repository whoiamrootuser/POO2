public class App {
    public static void main(String[] args) throws Exception {
        Conta contaCorrente = new ContaCorrente(0.1);
        contaCorrente.depositar(1000);
        contaCorrente.sacar(200);
      
        GeradorExtrato gerador = new GeradorExtrato();
        String extratoCorrente = gerador.geradorConta(contaCorrente);
        System.out.println("Extrato Conta Corrente:\n" + extratoCorrente);

        Conta contaPoupanca = new ContaPoupanca();
        contaPoupanca.depositar(1000);
        contaPoupanca.sacar(200);

        String extratoPoupanca = gerador.geradorConta(contaPoupanca);
        System.out.println("Extrato Conta Poupança:\n" + extratoPoupanca);
    }
}
