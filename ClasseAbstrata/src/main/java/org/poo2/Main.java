package org.poo2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente();
        System.out.println("Salario gerente: " + gerente.calculaSalario());
        Funcionario vendedor = new Vendedor();
        System.out.println("Salario vendedor: " + vendedor.calculaSalario());
    }
}