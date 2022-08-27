package Sobre_Escritura;

public class Figura {
    double dim1;
    double dim2;
    Figura(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    double area() {
        System.out.println("Area de Figura se indefinida.");
        return 0;
    }
}
