package unidad04;

import org.apache.commons.lang3.StringUtils;

public class FuncionesCadenas {
/**
 * 
 * @param cadena
 * @return palabras
 */
	public static int contarPalabras(String cadena) {
		String [] palabrasArray = StringUtils.split(cadena, " ");
		return palabrasArray.length;
	}

}
