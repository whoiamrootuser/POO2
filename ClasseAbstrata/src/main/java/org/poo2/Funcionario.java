package org.poo2;

public abstract class Funcionario {
    protected String nome;
    protected String clt;
    protected double salario;
    public Funcionario() {}

    public abstract double calculaSalario();
}
