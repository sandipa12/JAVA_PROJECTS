import java.util.Scanner;

public class ProgrammingAssignment3 {
    // Get correct answer keys
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numOfKeys = input.nextInt();
		char[] keys = new char[numOfKeys];
		for (int i = 0; i < keys.length; i++) {
			keys[i] = input.next().charAt(0);
		}
		// get answer keys of each student
		int numOfStudents = input.nextInt();
		char[][] answers = new char[numOfStudents][numOfKeys];
		for (int i = 0; i < answers.length; i++) {
			for (int j = 0; j < answers[i].length; j++) {
				answers[i][j] = input.next().charAt(0);

			}
		}
		// create an array to store count of correct answer
		int[] count = new int[numOfStudents];
		for (int i = 0; i < answers.length; i++) {
			int answer = 0;
			for (int j = 0; j < answers[i].length; j++) {
				if (answers[i][j] == keys[j]) {
					count[i] = ++answer;
				}

			}

		}
		// print out indices of highest score and toughest question
		System.out.println(indexOfHighestScore(count));
		System.out.println(indexOfToughestQuestion(keys, answers));
	}
    // method to get index of highest score
	public static int indexOfHighestScore(int[] numOfRightAnswer) {
		int index = 0;
		int max = numOfRightAnswer[0];
		for (int i = 0; i < numOfRightAnswer.length; i++) {
			if (max < numOfRightAnswer[i]) {
				max = numOfRightAnswer[i];
				index = i;
			}
		}
		return index;
	}
     // method to get index of toughest question
	public static int indexOfToughestQuestion(char[] correctAnswer, char[][] answer) {

		int[] count = new int[correctAnswer.length];
		for (int i = 0; i < answer[0].length; i++) {
			int value = 0;
			for (int j = 0; j < answer.length; j++) {
				if (answer[j][i] == correctAnswer[i]) {
					count[i] = ++value;
				}
			}
		}
		int index = indexOfHard(count);
		return index;
	}

	public static int indexOfHard(int[] Ans) {
		int index = 0;
		int min = Ans[0];
		for (int i = 0; i < Ans.length; i++) {
			if (min > Ans[i]) {
				min = Ans[i];
				index = i;
			}
		}
		return index;
		

	}

}
