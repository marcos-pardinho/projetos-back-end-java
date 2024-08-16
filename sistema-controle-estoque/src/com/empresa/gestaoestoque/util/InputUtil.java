package com.empresa.gestaoestoque.util;

import java.util.Locale;
import java.util.Scanner;


// Classe utilitária para captura de entrada do usuário
public class InputUtil {
	private static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
	
	public static String LerString(String mensagem) {
		System.out.println(mensagem);
		return scanner.nextLine();
	}
	
	public static double LerDouble(String mensagem) {
		System.out.println(mensagem);
		return scanner.nextDouble();
	}
	
	public static int LerInt(String mensagem) {
		System.out.println(mensagem);
		return scanner.nextInt();
	}
	
}
