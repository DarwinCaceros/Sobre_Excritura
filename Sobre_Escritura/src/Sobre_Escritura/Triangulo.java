package Sobre_Escritura;

public class Triangulo extends Figura{

    Triangulo(double a, double b) {
        super(a, b);
    }

    // sobreescribe el área para un triángulo

    double area() {
        System.out.println("dentro Area de Triángulo.");
        return dim1 * dim2 / 2;
    }
}
