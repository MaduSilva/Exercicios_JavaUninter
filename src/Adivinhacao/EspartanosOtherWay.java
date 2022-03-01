package Adivinhacao;

import java.util.Scanner;

public class EspartanosOtherWay {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Digite seu palpite");
		
		int guess = keyboard.nextInt();
		String msg;
		
		while(guess != 10000) {
			
		msg = guess<10000?"Um pouco mais...":"Um pouco menos...";
		System.out.println(msg);
		System.out.println("Digite seu próximo palpite");
		guess = keyboard.nextInt();
		}
		System.out.println("Seu palpite está correto!");
			
		}
}
