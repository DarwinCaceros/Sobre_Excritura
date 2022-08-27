package Sobre_Escritura;

public class Rectangulo extends Figura {

    Rectangulo(double a, double b) {
        super(a, b);
    }

    // sobreescribe el área para un rectángulo.

    double area() {
        System.out.println("dentro Area de Rectángulo.");
        return dim1 * dim2;
    }
}


