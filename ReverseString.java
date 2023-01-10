
public class ReverseString {
	public static void main(String[] args) {
		new ReverseString().reverse();
	}

	char[] array = "A B C".toCharArray();

	void reverse() {
		int left = 0;
		int right = array.length - 1;
		while (left < right) {
			if ((array[right] >= 58 && array[right] <= 64) || array[right] == 32) {
				right--;
			} else if ((array[left] >= 58 && array[left] <= 64) || array[left] == 32) {
				left++;
			} else {
				char temp = array[left];
				array[left] = array[right];
				array[right] = temp;
				left++;
				right--;
			}
		}
		System.out.println(new String(array));
	}
}
