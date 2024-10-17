package unidad02.boletin2;

import java.util.Scanner;

/**
 * Escribe un programa que nos diga el horóscopo a partir del día y el mes de Nacimiento.
 */
public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Este programa muestra tu horóscopo según tu mes de nacimiento.");
		System.out.println("Introduce tu día de nacimiento: ");
		int dia = scan.nextInt();
		System.out.println("Introduce tu mes de nacimiento: ");
		int mes = scan.nextInt();
		String signo = signoZodiacal(dia,mes);
		System.out.println("Tu signo zodiacal es: " + signo);
	}
	public statatic String obtenerSignoZodiacal
}
/**
import java.util.Scanner;

public class Horoscopo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu día de nacimiento:");
        int dia = scanner.nextInt();

        System.out.println("Introduce tu mes de nacimiento:");
        int mes = scanner.nextInt();

        String signo = obtenerSignoZodiacal(dia, mes);
        System.out.println("Tu signo zodiacal es: " + signo);
    }

    public static String obtenerSignoZodiacal(int dia, int mes) {
        String signo = "";

        if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            signo = "Acuario";
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            signo = "Piscis";
        } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            signo = "Aries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            signo = "Tauro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            signo = "Géminis";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            signo = "Cáncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            signo = "Leo";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            signo = "Virgo";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            signo = "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            signo = "Escorpio";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            signo = "Sagitario";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            signo = "Capricornio";
        }

        return signo;
    }
}
*/