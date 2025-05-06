package JoaoHenrique_ExercicioTreinoProva1;

public class Funcionario extends Pessoa implements Pagavel {
    private double salarioBase;

    public Funcionario(String nome, String cpf, double salarioBase) {
        super(nome, cpf);
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        return this.salarioBase;
    }

    public double calcularSalario(double valorAdicional) {
        return this.salarioBase + valorAdicional;
    }

    @Override
    public String mostrarDados() {
        return super.mostrarDados() + "\n" + "Salario Base: " + Util.formatarMoeda(salarioBase);
    }

}
