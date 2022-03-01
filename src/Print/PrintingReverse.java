package Print;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintingReverse {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		
		Scanner keyboard = new Scanner(System.in);
		String msg;
		System.out.println("Digite quantos nomes irá inserir");
		int result = keyboard.nextInt();
		
		System.out.println("Digite os nomes: ");
		for(int i=0; i<result;i++) {
			msg = keyboard.next();
			names.add(msg);
		}
		System.out.println("Ordem normal");
		for(String name : names) {
			System.out.println (name);
		}
		
		System.out.println("Ordem inversa");
		for(int i=result-1;i>=0;i--) {
			System.out.println (names.get(i));
		}
		
	}

}
