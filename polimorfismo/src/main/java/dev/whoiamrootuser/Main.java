package dev.whoiamrootuser;

public class Main {
    public static void main(String[] args) {
        GeometriaPlana geometriaPlana = new GeometriaPlana();

        // Circulo
        geometriaPlana.mudaParaCirculo();
        System.out.println(geometriaPlana.exibe());

        // Triangulo
        geometriaPlana.mudaParaTriangulo();
        System.out.println(geometriaPlana.exibe());

        // Quadrado
        geometriaPlana.mudaParaQuadrado();
        System.out.println(geometriaPlana.exibe());


        // Polimorfismo Vetor
        Figura2D[] figuras = new Figura2D[3];
        figuras[0] = new Circulo();
        figuras[1] = new Quadrado();
        figuras[2] = new Triangulo();

        // Exibindo os textos de cada figura
        System.out.println("Polimorfismo Vetor");
        for (Figura2D figura : figuras) {
            System.out.println(figura.pegaTexto());
        }
    }
}