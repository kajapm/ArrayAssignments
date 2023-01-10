import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class SortDate {
	public static void main(String[] args) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date[] array = new Date[5];

		try {
			array[0] = dateFormat.parse("10-07-1998"); 
			array[1] = dateFormat.parse("08-03-1998");
			array[2] = dateFormat.parse("18-09-2000");
			array[3] = dateFormat.parse("21-12-1997");
			array[4] = dateFormat.parse("14-01-1995");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		for (int i = 0; i < array.length; i++) {
			System.out
					.println(array[i].getDate() + "-" + (array[i].getMonth() + 1) + "-" + (array[i].getYear() + 1900));
		}
	}
}
