class Show {
	static void display(String[] greetings) {
		
		for (int i = 0; i < greetings.length; i++) {
			
			System.out.print(greetings[i] + " ");
			// return;
		}
	}
}

public class Q1 {
	public static void main(String[] args) {
		Show.display(args);
	}
}