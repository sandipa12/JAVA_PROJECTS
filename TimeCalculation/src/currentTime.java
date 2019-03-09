
public class currentTime {

	public static void main(String[] args) {

		long totalMilliseconds = System.currentTimeMillis();

		long totalSeconds = totalMilliseconds / 1000;

		long totalCurrentSeconds = totalSeconds % 60;

		long totalMinute = totalSeconds / 60;

		long totalCurrentMinute = totalMinute % 60;

		long totalHour = totalMinute / 60;

		long totalCurrentHour = totalHour % 24;

		System.out.println(
				"The current time is " + totalCurrentHour + ":" + totalCurrentMinute + ":" + totalCurrentSeconds);

	}

}
