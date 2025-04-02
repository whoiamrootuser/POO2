package org.poo2;

public class Vendedor extends Funcionario {
    @Override
    public double calculaSalario() {
        return salario - (salario * 13 / 100);
    }

    private double totalVendas(){
        return 0;
    }
}
