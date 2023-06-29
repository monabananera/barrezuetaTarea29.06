import java.util.Scanner;

class Cubo extends Figura {
    double lado;

    public double calcularPerimetro() {
        return 12 * lado;
    }

    public double calcularArea() {
        return 6 * Math.pow(lado, 2);
    }

    public double calcularVolumen() {
        return Math.pow(lado, 3);
    }

    public void ingresarLado() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el lado del cubo: ");
        lado = sc.nextDouble();
    }
}
