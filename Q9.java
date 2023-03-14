
/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

class A {
    A(int x, double y) {
    	System.out.println("Hey bro, what's up?");
    	System.out.println(x + " " + y);
    }
}

class B extends A {
	B(int v, double w) {
		super(v,w);
		System.out.println("OOP is interesting");
	}
}


class C extends B {
	C(int a, int b) {
		super(a, b);
		System.out.println("I am fine, what about you?");
	}
}
    

public class Q9
{
    
	public static void main(String[] args) {
		
		
		for (int i = 0; i < args.length; i++) System.out.println(args[i]);
		
		//C c = new C(10, 12);
		//A a = new A(11, 13);
		B b = new B(25, 26);
	}
}
