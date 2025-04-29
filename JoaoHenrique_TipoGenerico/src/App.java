
import JoaoHenrique_TipoGenerico.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite quantas cidades deseja cadastrar: ");
        int tamanhoCidades = Integer.parseInt(System.console().readLine());
        Vetor<Cidade> vetorCidades = new Vetor<>(tamanhoCidades);
        for (int i = 0; i < tamanhoCidades; i++) {
            System.out.println("Digite o nome da cidade: ");
            String nome = System.console().readLine();
            System.out.println("Digite o adjetivo da cidade: ");
            String adjetivo = System.console().readLine();
            System.out.println("Digite o estado da cidade: ");
            String estado = System.console().readLine();
            Cidade cidade = new Cidade(nome, adjetivo, estado);
            vetorCidades.setVet(cidade);
            ;
        }
        System.out.println("Digite quantas pessoas deseja cadastrar: ");
        int tamanhoPessoas = Integer.parseInt(System.console().readLine());
        Vetor<Pessoa> vetorPessoas = new Vetor<>(tamanhoPessoas);
        for (int i = 0; i < tamanhoPessoas; i++) {
            System.out.println("Digite o nome da pessoa: ");
            String nome = System.console().readLine();
            System.out.println("Digite o sexo da pessoa: ");
            String sexo = System.console().readLine();
            System.out.println("Digite a naturalidade da pessoa: ");
            String naturalidade = System.console().readLine();
            Pessoa pessoa = new Pessoa(nome, sexo, naturalidade);
            vetorPessoas.setVet(pessoa);
        }

   
        
        while (true) {
                System.out.println("Digite o nome da pessoa que deseja encontrar: ");
                String nomePessoa = System.console().readLine();

                for (int i = 0; i < tamanhoPessoas; i++) {
                    Pessoa pessoaAtual = vetorPessoas.getVet().get(i);
                    if (pessoaAtual.getNome().equalsIgnoreCase(nomePessoa)) {
                        for (int j = 0; j < tamanhoCidades; j++) {
                            Cidade cidadeAtual = vetorCidades.getVet().get(j);
                            if (pessoaAtual.getNaturalidade().equalsIgnoreCase(cidadeAtual.getNome())) {
                                String[] adjetivos = cidadeAtual.getAdjetivo();
                                String adjetivoAtual = adjetivos[0];
                                if (adjetivos.length > 1 && pessoaAtual.getSexo().equalsIgnoreCase("F")) {
                                    adjetivoAtual = adjetivos[1];
                                }
                                System.out.println(
                                        "A " + adjetivoAtual + " " + pessoaAtual.getNome() + " nasceu em "
                                                + cidadeAtual.getNome() + " - " + cidadeAtual.getEstado() + ".");
                                continue;
                            }
                            if (pessoaAtual.getNaturalidade().equalsIgnoreCase(null)) {
                                System.out.println(pessoaAtual.getNome() + " nasceu em cidade desconhecida.");
                                continue;
                            }

                            System.out.println(pessoaAtual.getNome() + " nasceu em " + pessoaAtual.getNaturalidade() + ".");
                            continue;
                        }
                    }
                }

        }
    }
}
