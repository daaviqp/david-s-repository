package unidad02;

public class Ejercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el carácter para formar la pirámide: ");
		String input = sc.nextLine();
		if (input.length() == 1) {
			char caracter = input.charAt(0);
			if (caracter >= 'A' && caracter <= 'Z') {
				correcto = true;
				
			}
			
		} else {
			System.err.println("Solo puedes introducir un carácter.");
		}
		

		
		
		

	}

}
