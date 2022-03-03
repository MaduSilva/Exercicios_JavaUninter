package media;

public class Test {

	double n1, n2, n3;
	
	Test(double n1, double n2, double n3){
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}
	
	Test(){
		
	}
	
	public double arithmeticAverage() {
		return (n1 + n2 + n3)/3;
	}
	
	public double weightedAverage() {
		return (n1 * 2 + n2 * 3 + n3*4)/9;
	}
	
	
}
