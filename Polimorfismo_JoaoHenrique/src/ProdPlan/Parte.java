package ProdPlan;

public abstract class Parte implements Cloneable {
    private int cod;
    private String nome;
    private String descricao;
    private float valor;

    public Parte(int cod, String nome, String descricao, float valor) {
        this.cod = cod;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    public float calculaValor() {
        return valor;
    }

    public String toString() {
        return "codigo:" + cod + " nome:" + nome + " descricao:" + descricao + " valor:" + valor;
    }

    public int getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    } 
}
