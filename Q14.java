class Num {
	int m;
	Num (int _m) {
		m = _m;
	}
}

public class Q14 {
	public static void main (String[] args) {
		final Num a1 = new Num(5);
		a1.m = 6;
		System.out.println(a1.m);
	}
}