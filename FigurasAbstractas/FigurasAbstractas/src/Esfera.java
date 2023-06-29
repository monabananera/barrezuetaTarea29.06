import java.util.Scanner;

class Esfera extends Figura {
    double radio;

    public double calcularPerimetro() {
        return 0;
    }

    public double calcularArea() {
        return 4 * Math.PI * Math.pow(radio, 2);
    }

    public double calcularVolumen() {
        return (4.0/3.0) * Math.PI * Math.pow(radio, 3);
    }

    public void ingresarRadio() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio de la esfera: ");
        radio = sc.nextDouble();
    }
}
