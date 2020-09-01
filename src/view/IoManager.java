package view;

import java.util.Scanner;

public class IoManager {
	public static final String TEXT_MENU = "         Selecione un diccionario escribiendo 1 o 2: \n\n  "
														+ "1. Diccionario españor e ingles "
														+ "2. Diccionario españor frances";
	
	public static final String TEXT_MENU_SECONDARY = " Selecione:\n"
														+ " 1. Agregar palabra al dicionario \n "
														+ "2. Buscar traducion de una palabra \n "
														+ "3. Ver numero de palabras en el dicionario\n"
														+ " 4. Volver al menu principal";
	
	public static final String DICTIONARY_OF = " \n      DICIONARIO DE \n";
	public static final String NEW_WORD= "Escriba la palabra que desea agregar (españor)";
	public static final String NEW_TRANSLATION= "Escriba la traducion de la palabra";
	public static final String SEARH_WORD_TRANSLATION= "ESCRIBA LA PALABRA PARA BUSCAR LA TRADUCION";
	public static final String MESSAGER_NOT_WORD_TRANSLATION= "No se enconto traducion de la palabra buscada";
	public static final String MESSAGER_TRANSLATION_OF_WORD= "\n    La traduccion de ";
	public static final String MESSAGER_IS= " es ";
	public static final String MESSAGER_NUMERE_WORD= "\nEl dicionario ";
	public static final String MESSAGER_HAVE= " tiene ";
	public static final String MESSAGER_WORD= " palabras\n ";
	public static final String ERROR_MESSAGER_MENU_SECONDARY = "     ¡TIENE QUE SER UN NU8MERO DE 1 A 4 PARA ELEGIR UNA OPCION!    \n ";
	public static final String ERROR_MESSAGER_MENU = "     ¡TIENE QUE SER UN NU8MERO DE 1 A 2 PARA ELEGIR UNA OPCION!    \n ";
	
	private Scanner scanner;
	
	
	public IoManager() {
		scanner = new Scanner(System.in);
	}
	
	public int getUserOption(){
		System.out.println(TEXT_MENU);
		return Integer.parseInt(scanner.nextLine());
	}
	public int getUserOptionSecondary(String titule){
		System.out.println(DICTIONARY_OF+titule);
		System.out.println(TEXT_MENU_SECONDARY);
		return Integer.parseInt(scanner.nextLine());
	}
	public String getWord() {
		System.out.println(NEW_WORD);
		return scanner.nextLine();
	}
	
	public String getTranslation() {
		System.out.println(NEW_TRANSLATION);
		return scanner.nextLine();
	}
	
	public String searchWordTranslation() {
		System.out.println(SEARH_WORD_TRANSLATION);
		return scanner.nextLine();
	}
	
	public void printMessageNotTranslation() {
		System.out.println(MESSAGER_NOT_WORD_TRANSLATION);
	} 
	
	public void printMessageTranslationOfWord(String word, String translation) {
		System.out.println(MESSAGER_TRANSLATION_OF_WORD+word+MESSAGER_IS+translation);
	} 
	
	public void printMessageNumereWord(String nameDicionario, int NumereWord) {
		System.out.println(MESSAGER_NUMERE_WORD+nameDicionario+MESSAGER_HAVE+NumereWord+MESSAGER_WORD);
	} 
	
	public void showErrorMessageOptionSecondary() {
		System.out.println(ERROR_MESSAGER_MENU_SECONDARY);
	}
	
	public void showErrorMessage() {
		System.out.println(ERROR_MESSAGER_MENU);
	}
}



