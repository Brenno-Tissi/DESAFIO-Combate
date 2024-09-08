package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados do primeiro campeão: ");
		System.out.print("Nome: ");
		String name1 = sc.nextLine();
		System.out.print("Vida inicial: ");
		int initialLife1 = sc.nextInt();
		System.out.print("Ataque: ");
		int attack1 = sc.nextInt();
		System.out.print("Armadura: ");
		int armor1 = sc.nextInt();
		sc.nextLine();
		Champion campeao1 = new Champion(name1, initialLife1, attack1, armor1);
		
		System.out.println();
		System.out.println("Digite os dados do segundo campeão: ");
		System.out.print("Nome: ");
		String name2 = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life2 = sc.nextInt();
		System.out.print("Ataque: ");
		int attack2 = sc.nextInt();
		System.out.print("Armadura: ");
		int armor2 = sc.nextInt();
		sc.nextLine();
		Champion campeao2 = new Champion(name2, life2, attack2, armor2);
		
		
		System.out.print("Quantos turnos você deseja executar? ");
		int n = sc.nextInt();
		
		System.out.println();
		for(int i = 0; i < n; i++) {
		
		System.out.println("Resultado do turno " + (i+1) + ": ");
		
		
		campeao1.takeDamage(attack2);
		campeao2.takeDamage(attack1);
		
		
		System.out.println(campeao1.status());
		System.out.println(campeao2.status());
		
		System.out.println();
		
		if (campeao1.life == 0 || campeao2.life == 0) {
			i = n;
		}
		}
		
		System.out.println("FIM DO COMBATE");
		sc.close();
	}

}
