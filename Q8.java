class OOP {
	public void add (double ...args) {
		int sum = 0;
		
		for (double x: args) {
			sum += x;
		}
		
		System.out.println(sum);
	}
}

public class Q8 {
	
	public static void main(String[] args) {
		OOP oop1 = new OOP();
		oop1.add(2, 4, 6);
	}
	
}