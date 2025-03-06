package unidad04.boletin;

import org.apache.commons.lang3.StringUtils;

import java.util.HashSet;
import java.util.Set;

public class BibliotecaCadenas {

    // a) Verificar si una cadena es un palíndromo
    public static boolean esPalindromo(String cadena) {
        if (cadena == null) return false;
        String cadenaLimpia = StringUtils.deleteWhitespace(cadena).toLowerCase();
        return cadenaLimpia.equals(StringUtils.reverse(cadenaLimpia));
    }

    // b) Verificar si una cadena es un heterograma
    public static boolean esHeterograma(String cadena) {
        if (cadena == null) return false;
        String cadenaLimpia = StringUtils.deleteWhitespace(cadena).toLowerCase();
        Set<Character> caracteres = new HashSet<>();
        for (char c : cadenaLimpia.toCharArray()) {
            if (caracteres.contains(c)) return false;
            caracteres.add(c);
        }
        return true;
    }

    // c) Contar vocales en una cadena (incluyendo vocales acentuadas)
    public static int conteoVocales(String cadena) {
        if (cadena == null) return 0;
        String cadenaLimpia = cadena.toLowerCase();
        int contador = 0;
        for (char c : cadenaLimpia.toCharArray()) {
            if ("aeiouáéíóú".indexOf(c) >= 0) {
                contador++;
            }
        }
        return contador;
    }

    // d) Invertir una cadena
    public static String invertirCadena(String cadena) {
        if (cadena == null) return null;
        return StringUtils.reverse(cadena);
    }

    // e) Eliminar todos los espacios de una cadena
    public static String eliminarEspacios(String cadena) {
        if (cadena == null) return null;
        return StringUtils.deleteWhitespace(cadena);
    }

    // f) Eliminar espacios duplicados
    public static String eliminarEspaciosDuplicados(String cadena) {
        if (cadena == null) return null;
        return cadena.trim().replaceAll("\\s+", " ");
    }

 // g) Verificar si dos cadenas son anagramas
    public static boolean esAnagrama(String cadena1, String cadena2) {
        if (cadena1 == null || cadena2 == null) return false;

        // Eliminar espacios y convertir a minúsculas
        String limpia1 = StringUtils.deleteWhitespace(cadena1).toLowerCase();
        String limpia2 = StringUtils.deleteWhitespace(cadena2).toLowerCase();

        // Si las longitudes son diferentes, no pueden ser anagramas
        if (limpia1.length() != limpia2.length()) return false;

        // Convertir las cadenas a arrays de caracteres
        char[] array1 = limpia1.toCharArray();
        char[] array2 = limpia2.toCharArray();

        // Ordenar los arrays
        java.util.Arrays.sort(array1);
        java.util.Arrays.sort(array2);

        // Comparar los arrays ordenados
        return java.util.Arrays.equals(array1, array2);
    }


    // h) Contar el número de palabras en una cadena
    public static int contarPalabras(String cadena) {
        if (cadena == null || cadena.trim().isEmpty()) return 0;
        return cadena.trim().split("\\s+").length;
    }

    // i) Cambiar entre mayúsculas y minúsculas
    public static String mayusculasMinusculas(String cadena, boolean aMayusculas) {
        if (cadena == null) return null;
        return aMayusculas ? cadena.toUpperCase() : cadena.toLowerCase();
    }

    // j) Reemplazar un carácter específico por otro
    public static String reemplazarCaracter(String cadena, char antiguo, char nuevo) {
        if (cadena == null) return null;
        return cadena.replace(antiguo, nuevo);
    }

    // k) Verificar si una cadena es un número
    public static boolean esNumero(String cadena) {
        if (cadena == null) return false;
        return StringUtils.isNumeric(cadena);
    }

    // Método principal para pruebas
    public static void main(String[] args) {
        // Pruebas
        System.out.println(esPalindromo("Anita lava la tina")); // true
        System.out.println(esHeterograma("murcielago"));        // true
        System.out.println(conteoVocales("Héllo áéíóú"));       // 6
        System.out.println(invertirCadena("Hola"));             // aloH
        System.out.println(eliminarEspacios("Hola Mundo "));    // HolaMundo
        System.out.println(eliminarEspaciosDuplicados("Hola   Mundo")); // Hola Mundo
        System.out.println(esAnagrama("amor", "roma"));         // true
        System.out.println(contarPalabras("Hola Mundo OpenAI"));// 3
        System.out.println(mayusculasMinusculas("Hola", true)); // HOLA
        System.out.println(reemplazarCaracter("casa", 'a', 'o'));// coso
        System.out.println(esNumero("12345"));                  // true
        System.out.println(esNumero("123a5"));                  // false
    }
}
