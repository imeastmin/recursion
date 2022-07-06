package Recursion;

public class Main {
	
	public static int func(int x) {
		if( x == 0 )
			return 0;
		else
			return x + func(x - 1);
	}

	public static void main(String[] args) {
		
		System.out.println(func(10));

	}

}
