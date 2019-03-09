import java.util.Arrays;
import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOfKeys = input.nextInt();
		char[] keys = new char[numberOfKeys];
		for (int i = 0; i < keys.length; i++) {
			keys[i] = input.next().charAt(0);
		}
		int rows = input.nextInt();
		char[][] studentAnswer = new char[rows][numberOfKeys];
		for (int i = 0; i < studentAnswer.length; i++) {
			for (int j = 0; j < studentAnswer[i].length; j++) {
				studentAnswer[i][j] = input.next().charAt(0);

			}
		}
		int[] count = new int[rows];
		for (int i = 0; i < studentAnswer.length; i++) {
			int answer = 0;
			for (int j = 0; j < studentAnswer[i].length; j++) {
				if (studentAnswer[i][j] == keys[j]) {
					count[i] = ++answer;
				}

			}

		}
		System.out.println(indexOfHighestScore(count));
		System.out.println(indexOfHardQuestion(keys, studentAnswer));
	}

	public static int indexOfHighestScore(int[] numberOfCorrectAnswer) {
		int index = 0;
		int max = numberOfCorrectAnswer[0];
		for (int i = 0; i < numberOfCorrectAnswer.length; i++) {
			if (max < numberOfCorrectAnswer[i]) {
				max = numberOfCorrectAnswer[i];
				index = i;
			}
		}
		return index;
	}

	public static int indexOfHardQuestion(char[] correctAnswer, char[][] answer) {

		int[] count = new int[correctAnswer.length];
		for (int i = 0; i < answer[0].length; i++) {
			int ans = 0;
			for (int j = 0; j < answer.length; j++) {
				if (answer[j][i] == correctAnswer[i]) {
					count[i] = ++ans;
				}
			}
		}
		int index = indexOfMaxWrongAnswer(count);
		return index;
	}

	public static int indexOfMaxWrongAnswer(int[] a) {
		int index = 0;
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
				index = i;
			}
		}
		return index;

	}
		

}
																																