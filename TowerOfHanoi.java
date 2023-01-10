//import java.util.Scanner;
//import java.util.Stack;

public class TowerOfHanoi {
	static {
		System.out.println("hi");
		System.exit(0);
	}

//	public static void main(String[] args) {
//		new TowerOfHanoi().play();
//	}

//	Scanner scanner = new Scanner(System.in);
//	Stack<Integer> rod1 = new Stack<Integer>();
//	Stack<Integer> rod2 = new Stack<Integer>();
//	Stack<Integer> rod3 = new Stack<Integer>();
//	int numberOfDisc;
//
//	void addDisc() {
//		System.out.print("Enter number of discs :");
//		numberOfDisc = scanner.nextInt();
//		for (int i = numberOfDisc; i > 0; i--) {
//			rod1.add(i);
//		}
//	}
//
//	void moveDisc(int numberOfDisc, Stack<Integer> from, Stack<Integer> to, Stack<Integer> aux) {
//		System.out.println(from+" "+to+" "+aux);
//		if (numberOfDisc == 0)
//			return;
//		moveDisc(numberOfDisc - 1, from, aux, to);
//		to.add(from.pop());
//		moveDisc(numberOfDisc - 1, aux, to, from);
//	}
//
//	void play() {
//		addDisc();
//		System.out.println("\nBefore play - \nRod 1 :" + rod1 + "\nRod 2 :" + rod2 + "\nRod 3 :" + rod3);
//		moveDisc(numberOfDisc, rod1, rod3, rod2);
//		System.out.println("\nAfter play - \nRod 1 :" + rod1 + "\nRod 2 :" + rod2 + "\nRod 3 :" + rod3);
//	}

}
