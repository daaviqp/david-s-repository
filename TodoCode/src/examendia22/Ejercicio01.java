package examendia22;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double notaLenguajes = -1;
		double notaProgramacion = -1;
		
		
		
		System.out.println("""
				----------------| Grado D. CFGS DAW |--------------
| 1 – Módulo de Lenguaje de Marcas |
| 2 – Módulo de Programación |
| 0 – Resumen y salir |
---------------------------------------------------
				""");
		System.out.println("Introduce el número del módulo del que quieres registrar la nota: ");
		double opcion = scan.nextDouble();S
		
		

	}

}

import java.util.Scanner;

public class MenuNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double notaLenguaje = -1;
        double notaProgramacion = -1;
        int opcion;

        do {
            System.out.println("----------------| Grado D. CFGS DAW |--------------");
            System.out.println("| 1 – Módulo de Lenguaje de Marcas |");
            System.out.println("| 2 – Módulo de Programación |");
            System.out.println("| 0 – Resumen y salir |");
            System.out.println("---------------------------------------------------");
            System.out.print("Introduce una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce la nota para el Módulo de Lenguaje de Marcas (0-10): ");
                    notaLenguaje = scanner.nextDouble();
                    if (notaLenguaje < 0 || notaLenguaje > 10) {
                        System.out.println("Nota no válida. Debe estar entre 0 y 10.");
                        notaLenguaje = -1;
                    }
                    break;
                case 2:
                    System.out.print("Introduce la nota para el Módulo de Programación (0-10): ");
                    notaProgramacion = scanner.nextDouble();
                    if (notaProgramacion < 0 || notaProgramacion > 10) {
                        System.out.println("Nota no válida. Debe estar entre 0 y 10.");
                        notaProgramacion = -1;
                    }
                    break;
                case 0:
                    System.out.println("Calificaciones DAW");
                    System.out.println("Módulo de Lenguaje de Marcas: " + (notaLenguaje == -1 ? "NOEV" : notaLenguaje));
                    System.out.println("Módulo de Programación: " + (notaProgramacion == -1 ? "NOEV" : notaProgramacion));
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}
