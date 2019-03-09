import java.util.Scanner;

public class TimeConverter {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter t");
		
		int t=scanner.nextInt();
		
		int m=t/60;
		int s=t-60*m;
		System.out.println(m+":"+s);
	}

}
