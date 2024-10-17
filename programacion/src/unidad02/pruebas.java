package unidad02;

import java.util.Scanner;

public class pruebas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("~~~~~~~~~~~~~~| CALCULADORA |~~~~~~~~~~~~~~");
            System.out.println("1 - Suma");
            System.out.println("2 - Resta");
            System.out.println("3 - Multiplicación");
            System.out.println("4 - División");
            System.out.println("5 - Raíz cuadrada");
            System.out.println("6 - Potencia");
            System.out.println("0 - Salir del programa");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("Introduce una opción: ");
            opcion = scanner.nextInt();

            if (opcion == 0) {
                System.out.println("Gracias por usar la calculadora. ¡Adiós!");
                System.out.println("Presiona cualquier tecla para salir...");
                scanner.next();
                break;
            }

            if (opcion >= 1 && opcion <= 6) {
                System.out.print("Introduce el primer número: ");
                double num1 = scanner.nextDouble();
                double num2 = 0;
                if (opcion != 5) { // Raíz cuadrada solo necesita un número
                    System.out.print("Introduce el segundo número: ");
                    num2 = scanner.nextDouble();
                }

                switch (opcion) {
                    case 1:
                        System.out.println("Resultado: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Resultado: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Resultado: " + (num1 * num2));
                        break;
                    case 4:
                        if (num2 != 0) {
                            System.out.println("Resultado: " + (num1 / num2));
                        } else {
                            System.out.println("Error: División por cero.");
                        }
                        break;
                    case 5:
                        if (num1 >= 0) {
                            System.out.println("Resultado: " + Math.sqrt(num1));
                        } else {
                            System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
                        }
                        break;
                    case 6:
                        System.out.println("Resultado: " + Math.pow(num1, num2));
                        break;
                }
            } else {
                System.out.println("Error: Introduce una opción válida.");
            }
        } while (true);

        scanner.close();
    }
}