import java.util.Scanner;
public class Mydoubt {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Hello lord, give us values");
		
		System.out.print("n: ");
		int n = input.nextInt();
		
		System.out.println("Thanks. Now, how many green hats can you see? ");
		int b = input.nextInt();
		
		System.out.println("Oh lord, I'm blind. If I could see, how many blue hats would I see? ");
		int c = input.nextInt();
		
		if(b + c == n) {
			System.out.println("Wow, I'm in blue hat! ");
			
		}else {
			System.out.println("Oh no, I don't have a blue hat! ");
		}
			
	}

}
