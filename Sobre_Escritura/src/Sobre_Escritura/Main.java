package Sobre_Escritura;

public class Main {

    public static void main(String[] args) {

        Figura f = new Figura(10, 10);
        Rectangulo r = new Rectangulo(9, 5);
        Triangulo t = new Triangulo(10, 8);
        Figura figref;
        figref = r;
        System.out.println("El area es: " + figref.area());
        figref = t;
        System.out.println("El area es: " + figref.area());
        figref = f;
        System.out.println("El area es: " + figref.area());

    }
}
