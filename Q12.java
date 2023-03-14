class MyClass {
	
	int value;
	
	MyClass (int v) {
		value = v;
	}
	
	static void F1(MyClass u, int v) {
		u.value = 12;
		v = 12;
	}
	
}

public class Q12 {
	
	public static void main(String[] args) {
		
		MyClass s = new MyClass(20);
		int t = 13;
		MyClass.F1(s, t);
		System.out.println(s.value + " " + t);
	}

}