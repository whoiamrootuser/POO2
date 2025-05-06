package JoaoHenrique_Prova1;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, String cpf, double salarioBase, String cargo, double bonus) throws SalarioInvalidoException {
        super(nome, cpf, salarioBase);
        this.bonus = validaBonus(bonus);
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario(bonus);
    }

    @Override
    public String mostrarDados() {
        return "Gerente: \n" + super.mostrarDados() + "\n" + "Salario total: " + Util.formatarMoeda(this.calcularSalario());
    }

    private double validaBonus(double bonus) throws SalarioInvalidoException {
        if (bonus < 0) {
            throw new SalarioInvalidoException("O bônus não pode ser negativo.");
        } 
        return bonus;
    }

    

}
