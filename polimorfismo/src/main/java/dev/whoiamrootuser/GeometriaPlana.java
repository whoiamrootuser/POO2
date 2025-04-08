package dev.whoiamrootuser;

public class GeometriaPlana {

    private Figura2D fig;

    GeometriaPlana() {
        this.fig = new Quadrado();
    }


    public void mudaParaCirculo() {
        this.fig = new Circulo();
    }
    public void mudaParaQuadrado() {
        this.fig = new Quadrado();
    }
    public void mudaParaTriangulo() {
       this.fig = new Triangulo();
    }

    public String exibe() {
        return this.fig.pegaTexto();
    }

}
