import java.util.Scanner;

class Triangulo extends Figura {
    double base;
    double altura;

    public double calcularPerimetro() {
        return 2 * altura + base;
    }

    public double calcularArea() {
        return 0.5 * base * altura;
    }

    public double calcularVolumen() {
        return 0;
    }

    public void IngresarDimensiones() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la base del triángulo: ");
        base = sc.nextDouble();
        System.out.println("Ingrese la altura del triángulo: ");
        altura = sc.nextDouble();
    }
}
