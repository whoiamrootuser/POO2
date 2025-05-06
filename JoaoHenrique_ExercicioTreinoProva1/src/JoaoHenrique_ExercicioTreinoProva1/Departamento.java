package JoaoHenrique_ExercicioTreinoProva1;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nome;
    private List<Funcionario> funcionarios;


    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public String listarFuncionario() {
        StringBuilder sb = new StringBuilder();
        sb.append("Departamento: " + nome).append("\n");
        for (Funcionario funcionario : funcionarios) {
            sb.append("--------------------------------------------------").append("\n");
            sb.append(funcionario.mostrarDados()).append("\n");
        }
        return sb.toString();
    }


}
