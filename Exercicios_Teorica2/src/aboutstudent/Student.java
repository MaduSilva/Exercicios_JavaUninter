package aboutstudent;

public class Student {

	public static void main(String[] args) {
		
		StudentInfo a1 = new StudentInfo("Jay", "Fashion Design", new Test(10, 9 , 10));
		StudentInfo a2 = new StudentInfo("Jake", "Veterinary", new Test(8, 7 , 8));

		
		a1.about();
		a2.about();
	}

}
