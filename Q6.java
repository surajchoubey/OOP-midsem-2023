class Birds {
//	void sound(String ...vargs) {
//		System.out.println("Hey this is Robin from Birds class");
//	}
	
	void sound(String s, String ...vargs) {
		System.out.println("Hey this is Sparrow from Birds class");
	}
}

public class Q6 {
	
	public static void main(String[] args) {
		Birds bird = new Birds();
		bird.sound("chuckle", "chirp");
	}
	
}