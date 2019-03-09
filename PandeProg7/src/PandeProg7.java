
//Sandipa Pande
//w0695366
//Cmps 161_04
//Program 7
//11/29/2018

// import scanner
import java.util.Scanner;

public class PandeProg7 {
	public static void main(String[] args) {
		// create scanner
		Scanner input = new Scanner(System.in);
		// prompt the user to enter number of students
		System.out.println("Enter the number of students:");

		// initialize array with false value
		boolean[] lockerStatus = new boolean[input.nextInt()];
		// close scanner
		input.close();
		for (int j = 0; j < lockerStatus.length; j++) {
			lockerStatus[j] = false;
		}//end for loop

		// first student opens all the lockers
		setLockersTrue(lockerStatus);
		// loop to change the status of locker with student's entry
		for (int i = 1; i < lockerStatus.length; i++) {
			changeLockerByIndex(lockerStatus, i);
		}//end for

		printAllOpenLockers(lockerStatus);
	}//end main

	// first student opens all the lockers
	public static void setLockersTrue(boolean[] lockers) {
		for (int j = 0; j < lockers.length; j++) {
			lockers[j] = !lockers[j];
		}//end for loop
	}//end method

	// as new student enters, the status is changed
	public static void changeLockerByIndex(boolean[] lockers, int startLocker) {
		int count = 0;
		for (int i = startLocker; i < lockers.length; i++) {
			if (++count == startLocker) {
				lockers[i] = !lockers[i];
				count = 0;

			}//end if state
		}//end for loop
	}// end method

	// dispaly all open lockers
	public static void printAllOpenLockers(boolean[] lockers) {
		for (int i = 0; i < lockers.length; i++) {
			if (lockers[i] == true) {
				System.out.println("Locker " + (i + 1) + " is open.");
			} // end if statement
		} // end for loop
	}// end method
}// end PandeProg7
