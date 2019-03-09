
public class TutorAtPJ {
	public static void main(String args[]) {
		
		
//		System.out.println(fibonacci(1, 1, 1));
//		System.out.println(fibonacci(2, 5, 6));
		System.out.println(fibonacci(3));
		System.out.println(fibonacci(4));
		System.out.println(fibonacci(5));
		System.out.println(fibonacci(6));
//		int a = 1;
//		int b = 1;
//		for ( int count = 1; count< 20; count++) {
//
//			int valuea = a;
//			
//			a = b;
//			b = b + valuea;
//			
//			System.out.println("a =" + a+ ", b =  " + b);
//			
//			
//			
		}
//	}
	
	static int fibonacci(int m) {
		return fibonacci(m, 1, 1);
	}
	
	 static int fibonacci (int n, int a, int b) {
		if (n== 1) {
			return a;
			
		}
		else if (n == 2) {
			return b;
		}
		else {
			for ( int count = 1; count<= n -2; count++) {
	
				int valuea = a;
				
				a = b;
				b = b + valuea;
				
				//System.out.println("a =" + a+ ", b =  " + b);
				
			}
			return b;
		}
	}
}
