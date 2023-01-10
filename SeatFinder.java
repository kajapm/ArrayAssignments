import java.util.Scanner;

public class SeatFinder {
	public static void main(String[] args) {
		new Seat().findStatus();
	}
}
class Seat{
	private Scanner scanner=new Scanner(System.in);
	void findStatus()
	{
		int seatNo=scanner.nextInt();
		if(seatNo%8==0)
		{
			System.out.println("side upper birth");
		}
		else if(seatNo%8==7)
		{
			System.out.println("side lower birth");
		}
		else if(seatNo%8==6 | seatNo%8==1)
		{
			System.out.println("Lower birth");
		}
		else if(seatNo%8==5 | seatNo%8==2)
		{
			System.out.println("Middle birth");
		}
		else if(seatNo%8==4 | seatNo%8==3)
		{
			System.out.println("Upper birth");
		}
	}
}

