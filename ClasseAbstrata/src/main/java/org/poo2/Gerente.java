package org.poo2;

public class Gerente extends Funcionario {

    @Override
    public double calculaSalario() {
        return salario - (salario * 27 / 100);
    }
}
