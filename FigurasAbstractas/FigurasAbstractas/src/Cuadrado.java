import java.util.Scanner;

class Cuadrado extends Figura {
    double lado;

    public double calcularPerimetro() {
        return 4 * lado;
    }

    public double calcularArea() {
        return Math.pow(lado, 2);
    }

    public double calcularVolumen() {
        return 0;
    }

    public void ingresarLado() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el lado del cuadrado: ");
        lado = sc.nextDouble();
    }
}
