class Car_ {
	private float Mileage;
	private String Model;
	
	Car_ (float _M, String __M) {
		this.Mileage = _M;
		this.Model = __M;
	}
	
	// copy constructor
	Car_ (Car_ copy) {
		this.Mileage = copy.Mileage;
		this.Model = copy.Model;
	}
	
	void print() {
		System.out.println("this.mileage = " + this.Mileage);
		System.out.println("this.model = " + this.Model);
	}
}

public class Q2 {
	
	public static void main(String[] args) {
		Car_ car1 = new Car_(87.9f, "Honda City");
		
		Car_ car2 = new Car_(car1);
		
		car1.print();
		car2.print();
	}
	
}