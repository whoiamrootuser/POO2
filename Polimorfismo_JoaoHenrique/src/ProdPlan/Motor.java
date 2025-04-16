package ProdPlan;

public class Motor extends Parte {

    private float potencia;
    private float corrente;
    private int rpm;

    public Motor(int cod, String nome, String descricao, float valor, float potencia, float corrent, int rpm) {
        super(cod, nome, descricao, valor);
        this.potencia = potencia;
        this.corrente = corrent;
        this.rpm = rpm;
    }

    @Override
    public String toString() {
        return super.toString() + " potencia:" + potencia + " corrente:" + corrente + " rpm:" + rpm;
    }
}
