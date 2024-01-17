package br.ufscar.dc;

public class Triangulo {

    private boolean ehTriangulo(int a, int b, int c) {
        boolean ehTriangulo = true;
        if (a < 0 || b < 0 || c < 0
                || a > b + c || b > a + c || c > a + b) {
            ehTriangulo = false;
        }
        return ehTriangulo;
    }

    public Tipo classifica(int a, int b, int c) {
        Tipo tipo;
        if (!ehTriangulo(a, b, c)) {
            tipo = Tipo.NAO;
        } else {
            if (a == b && a == c) {
                tipo = Tipo.EQ;
            } else if (a == b || a == c || b == c) {
                tipo = Tipo.ISO;
            } else {
                tipo = Tipo.ESC;
            }
        }
        return tipo;
    }
}
