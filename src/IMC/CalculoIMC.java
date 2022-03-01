package IMC;

import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {
		System.out.println("Por favor digite o seu peso em KG");
		Scanner keyboard = new Scanner(System.in);
		float weight = keyboard.nextFloat();
		
		System.out.println("Por favor digite a sua altura em Metros");
		float height = keyboard.nextFloat();
		
		float imc = (float)(weight / Math.pow(height, 2));
		
		System.out.println("Seu IMC é: " + imc);
	}

}
