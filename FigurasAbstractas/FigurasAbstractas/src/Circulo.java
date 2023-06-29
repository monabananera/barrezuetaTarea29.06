import java.util.Scanner;

class Circulo extends Figura {
    double radio;

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularVolumen() {
        return 0;
    }

    public void ingresarRadio() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio del círculo: ");
        radio = sc.nextDouble();
    }
}
