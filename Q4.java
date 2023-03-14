class Car {
	
	char ch = '8';
	
	String s;
	void display() {
		System.out.println("Hi");
	}
}

class Honda extends Car {
	
	char ch = '5';
	
	void display() {
		System.out.println("Hi - 2");
	}
	
	void carColor(String s) {
		this.s = s;
		System.out.println(s);
	}
	
}

public class Q4 {
	
	public static void main(String[] args) {
		
		Car car1 = new Car();
		Car City = new Honda();
		Honda h3 = new Honda();
		
		car1.display();
		System.out.println(car1.ch);
		
		City.display();
		System.out.println(City.ch);
		
		h3.display();
		System.out.println(h3.ch);
		
		// City.carColor("Platinum White Pearl");
		((Honda) City).carColor("Platinum White Pearl");
	}
}