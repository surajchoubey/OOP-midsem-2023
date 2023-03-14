class A_ {
	static int x = 2;
	A_() {
		System.out.println(x);
	}
}

class B_ extends A_ {
	int x = 3;
	B_() {
		System.out.println(x);
	}
}

class C_ extends B_ {
	C_() {
		System.out.println(x);
	}
}

public class Q10 {
	public static void main(String[] args) {
		// B_ b = new B_();
		// A_ a = new A_();
		C_ c = new C_();
		
//		A_.x = 4;
//		b.x = 5;
//		
//		System.out.println(A_.x);
//		System.out.println(b.x);
		System.out.println(c.x);
	}
}