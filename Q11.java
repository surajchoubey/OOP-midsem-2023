class _A {
	public static void OOP (String s) {
		System.out.println("Java");
	}
}

class _B {
	String s = "OOP";
	char c = 'A';
	
	public void OOP (String s) {
		this.s = s;
		System.out.println(s);
	}
}

class _C extends _A {
	public static void OOP (String x) {
		System.out.println(x);
	}
}

class _D extends _B {
	char c = 'B';
	public void OOP (String x) {
		System.out.println("213");
		System.out.println(s);
	}
}

class Q11 {
	
	public static void main(String[] args) {
		_A a = new _C();
		a.OOP("CS");
		_B b = new _B();
		b.OOP("Hi");
		_B b1 = new _D();
		b1.OOP("F");
		
		System.out.println(b1.c);
	}
}