package ProdPlan;

public class Parafuso extends Parte {
    private float comprimento;
    private float diametro;

    public Parafuso(int cod, String nome, String descricao, float valor, float comprimento, float diametro) {
        super(cod, nome, descricao, valor);
        this.comprimento = comprimento;
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return super.toString() + " comprimento:" + comprimento + " diametro:" + diametro;
    }
}
