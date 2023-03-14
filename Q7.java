class Mechanic {
	static int parts_sum;
	
	
	Mechanic() {
		System.out.println("Mechanic is created!");
	}
	
	static // runs only once before the constructor when class files are loaded into Memory
	{
		for (int i = 0; i < 3; i++) {
			parts_sum += i;
			
			System.out.println(parts_sum);
		}
	}

}

public class Q7 {
	
	public static void main(String[] args) {
		Mechanic m2 = new Mechanic(); 
		System.out.println(Mechanic.parts_sum);
		Mechanic m3 = new Mechanic();
		System.out.println(Mechanic.parts_sum);
	}
	
}