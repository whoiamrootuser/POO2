package JoaoHenrique_ExercicioTreinoProva1;

public abstract class Pessoa {
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String mostrarDados() {
        return "Nome: " + nome + "\n" +
               "CPF: " + cpf;
    }

}
