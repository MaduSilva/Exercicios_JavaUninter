package media;

public class ExercicioMedia {

	public static void main(String[] args) {
		
		Test jake = new Test();
		Test jay = new Test(7, 5, 10);
		
		jake.n1 = 8;
		jake.n2 = 3;
		jake.n3 = 10;
		
		
		System.out.println("Média aritmética do Jake: " + jake.arithmeticAverage());
		System.out.println("Média ponderada do Jake: " + jake.weightedAverage());
		
		System.out.println("Média aritmética do Jay: " + jay.arithmeticAverage());
		System.out.println("Média ponderada do Jay: " + jay.weightedAverage());
	}
}
