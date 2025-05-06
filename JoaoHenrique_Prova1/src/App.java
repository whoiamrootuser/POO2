import JoaoHenrique_Prova1.Departamento;
import JoaoHenrique_Prova1.Funcionario;
import JoaoHenrique_Prova1.Gerente;
import JoaoHenrique_Prova1.SalarioInvalidoException;

public class App {
    public static void main(String[] args) throws Exception {
       
       try{
           Funcionario funcionario1 = new Funcionario("João", "12345678900", 3000.0);
           Funcionario funcionario2 = new Funcionario("Maria", "98765432100", 2500.0);
           Gerente gerente = new Gerente("Carlos", "11122233344", 5000.0, "Gerente", 1000.0);
           
           Departamento departamentoRH = new Departamento("Recursos Humanos");
           departamentoRH.adicionarFuncionario(funcionario1);
           departamentoRH.adicionarFuncionario(gerente);

           System.out.println(departamentoRH.listarFuncionario());
           
           Departamento departamentoVendas = new Departamento("Vendas");
           departamentoVendas.adicionarFuncionario(funcionario2);
           
           System.out.println(departamentoVendas.listarFuncionario());
        } catch (SalarioInvalidoException e) {
           System.out.println("Erro: " + e.getMessage());
        }
    }
}
