package Adivinhacao;

import java.util.Scanner;

public class Espartanos {
	
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Digite seu palpite");
	
	int guess = keyboard.nextInt();
	
	while(guess != 10000) {
		if(guess <10000) {
			System.out.println("Um pouco mais...");
		} else {
			System.out.println("Um pouco menos...");
		}
		System.out.println("Digite seu próximo palpite");
		guess=keyboard.nextInt();
	}
	System.out.println("Seu palpite está correto!");
		
	}
}
