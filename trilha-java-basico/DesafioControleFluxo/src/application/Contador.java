package application;

import exception.ParametrosInvalidosException;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Digite o primeiro parâmetro: ");
		int parametroDois = sc.nextInt();
		sc.nextLine();
		
		try {
			
			contar(parametroUm, parametroDois);
			
		} catch(ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
		
		

	}
	
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if(parametroDois < parametroUm) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}
		
		int contagem = parametroDois - parametroUm;
		
		for(int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o número " + i);
		}
		
	}

}
