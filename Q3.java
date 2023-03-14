class BITS {
	boolean x;
	private int w;
	static byte student = 100;
	protected char c = 'c';
	
	class EEE {
		static void show() {
			student += 1;
			BITS bt = new BITS();
			System.out.println((int) bt.c);
			System.out.println(bt.w);
		}
	}
}

class GOA extends BITS {
	
}

public class Q3 {
	public static void main(String[] args) {
		BITS.EEE.show();
	}
}