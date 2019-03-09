import java.util.Scanner;

public class Character {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
				
		String name=scanner.next();
		if(name.equals("Ram")) {
			System.out.println("you are cartoon");
			
		}
		else if(name.equals("Sita")) {
			System.out.println("you are talented");
			
		}
		else {
			System.out.println("you are stupid");
		}
	}

}
