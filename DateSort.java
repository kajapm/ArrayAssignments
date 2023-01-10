import java.util.Arrays;
import java.util.Scanner;

public class DateSort {
	public static void main(String[] args) {
		new DateSort().sort();
	}

	Scanner scanner = new Scanner(System.in);
	Date[] arr = addArray();

	Date[] addArray() {
		System.out.print("Enter array size :");
		int size = Integer.parseInt(scanner.nextLine());
		Date[] tempArr = new Date[size];
		for (int i = 0; i < size; i++) {
			String date = scanner.nextLine();
			tempArr[i] = new Date(date, convertInteger(date));
		}
		return tempArr;
	}

	void sort() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].dateReverse > arr[j].dateReverse) {
					Date temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (Date d : arr) {
			System.out.print(d.date + " ");
		}
	}

	int convertInteger(String date) {
		date = date + '-' + '\0';
		int index = 0, reversedDate = 0, day = 0, month = 0;
		String[] array = new String[3];
		String number = "";

		for (int i = 0; date.charAt(i) != '\0'; i++) {
			if (date.charAt(i) == '-') {
				array[index++] = number;
				number = "";
			} else {
				number += date.charAt(i);
			}
		}
		System.out.println(Arrays.toString(array));
		reversedDate = Integer.parseInt(array[2]);
		day = Integer.parseInt(array[0]);
		month = Integer.parseInt(array[1]);
		reversedDate = reversedDate * 100 + month;
		reversedDate = reversedDate * 100 + day;

		return reversedDate;
	}
}

class Date {
	public String date;
	public int dateReverse;

	public Date(String date, int dateReverse) {
		this.date = date;
		this.dateReverse = dateReverse;
	}
}
