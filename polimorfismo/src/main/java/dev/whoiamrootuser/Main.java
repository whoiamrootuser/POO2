package dev.whoiamrootuser;

public class Main {
    public static void main(String[] args) {
        GeometriaPlana geometriaPlana = new GeometriaPlana();

        // Quadrado
        System.out.println(geometriaPlana.exibe());

        // Circulo
        geometriaPlana.mudaParaCirculo();
        System.out.println(geometriaPlana.exibe());

        // Triangulo
        geometriaPlana.mudaParaTriangulo();
        System.out.println(geometriaPlana.exibe());

        // Quadrado
        geometriaPlana.mudaParaQuadrado();
        System.out.println(geometriaPlana.exibe());
    }
}