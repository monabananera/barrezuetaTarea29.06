import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("Bienvenido a la calculadora de figuras.");
        System.out.println("Por favor, elija una opción:");
        System.out.println("1. Cuadrado");
        System.out.println("2. Triángulo");
        System.out.println("3. Círculo");
        System.out.println("4. Esfera");
        System.out.println("5. Pirámide");
        System.out.println("6. Cubo");

        opcion = scanner.nextInt();

        if (opcion == 1) {
            // Cuadrado
            Cuadrado cuadrado = new Cuadrado();
            cuadrado.ingresarLado();
            imprimirResultados(cuadrado);
        } else if (opcion == 2) {
            // Triangulo
            Triangulo triangulo = new Triangulo();
            triangulo.IngresarDimensiones();
            imprimirResultados(triangulo);
        } else if (opcion == 3) {
            // Círculo
            Circulo circulo = new Circulo();
            circulo.ingresarRadio();
            imprimirResultados(circulo);
        } else if (opcion == 4) {
            // Esfera
            Esfera esfera = new Esfera();
            esfera.ingresarRadio();
            imprimirResultados(esfera);
        } else if (opcion == 5) {
            // Piramide
            Piramide piramide = new Piramide();
            piramide.ingresarDimensiones();
            imprimirResultados(piramide);
        } else if (opcion == 6) {
            // Cubo
            Cubo cubo = new Cubo();
            cubo.ingresarLado();
            imprimirResultados(cubo);
        } else {
            System.out.println("Opción inválida");
        }
    }

    public static void imprimirResultados(Figura figura) {
        System.out.println("Perímetro: " + figura.calcularPerimetro());
        System.out.println("Área: " + figura.calcularArea());
        System.out.println("Volumen: " + figura.calcularVolumen());
    }
}
