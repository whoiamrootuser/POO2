public class GeradorExtrato {
    String geradorConta(Conta conta) {
        StringBuilder extrato = new StringBuilder();
        extrato.append("Saldo: ").append(conta.getSaldo()).append("\n");
        return extrato.toString();
    }
}
