import java.util.Scanner;

class Piramide extends Figura {
    double base;
    double altura;

    public double calcularPerimetro() {
        return 4 * base;
    }

    public double calcularArea() {
        return base * base + 2 * base * Math.sqrt(Math.pow(base / 2, 2) + Math.pow(altura, 2));
    }

    public double calcularVolumen() {
        return (1.0/3.0) * base * base * altura;
    }

    public void ingresarDimensiones() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la longitud de la base de la pirámide: ");
        base = sc.nextDouble();
        System.out.println("Ingrese la altura de la pirámide: ");
        altura = sc.nextDouble();
    }
}
