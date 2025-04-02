import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Por favor, informe o código da agência: ");
		String agencia = sc.nextLine();
		
		System.out.print("Por favor, informe o número da conta: ");
		int numero = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Por favor, informe o nome do cliente: ");
		String nome = sc.nextLine();
		
		System.out.print("Por favor, informe o saldo da conta: ");
		double saldo = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.println("Olá, " + nome + ". Obrigado por criar uma conta no nosso banco. Sua agência é " + agencia
				+ ", conta " + numero + " e seu saldo de " + saldo + " já está disponível.");
		sc.close();
		

	}

}
