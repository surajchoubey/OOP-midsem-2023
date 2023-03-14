class _A_ {
	int val;
	
	_A_(int _val) {
		val = _val;
		System.out.println(val);
	}
	
	void output() {
		System.out.println(val);
	}
}

class _B_ extends _A_ {
	
	int val;
	
	_B_ (int _val) {
		super(_val);
		val = _val;
	}
	
	_B_ (int v1, int v2) {
		super(v1 + v2);
	}
	
	void output() {
		System.out.println(val);
		super.output();
	}
	
}

public class Q13 {
	public static void main(String[] args) {
		_A_ p0 = new _A_(3);
		_A_ p1 = new _B_(5);
		_A_ p2 = new _B_(6, 7);
		_B_ p3 = new _B_(8, 9);
		
		// Code snippet goes HERE
		
		System.out.println("=======================");
		
		p0.output(); // (i)
		p1.output(); // (ii)
		// p2 = p3;	 // (iii)
		// p3 = p2;     // (iv)
		p3.output(); // (v)
		
	}
}