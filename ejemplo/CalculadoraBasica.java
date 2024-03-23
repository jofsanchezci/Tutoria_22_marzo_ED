import java.util.Scanner;
public class CalculadoraBasica  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese dos números
        System.out.println("Ingresa el primer número:");
        double numero1 = scanner.nextDouble();

        System.out.println("Ingresa el segundo número:");
        double numero2 = scanner.nextDouble();

        // Realizar las operaciones básicas
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;

        // Manejar la división por cero
        double division = 0;
        if (numero2 != 0) {
            division = numero1 / numero2;
        } else {
            System.out.println("No se puede dividir por cero.");
        }

        // Imprimir los resultados
        System.out.println("Suma: " + numero1 + " + " + numero2 + " = " + suma);
        System.out.println("Resta: " + numero1 + " - " + numero2 + " = " + resta);
        System.out.println("Multiplicación: " + numero1 + " * " + numero2 + " = " + multiplicacion);
        if (numero2 != 0) {
            System.out.println("División: " + numero1 + " / " + numero2 + " = " + division);
        }
    }
