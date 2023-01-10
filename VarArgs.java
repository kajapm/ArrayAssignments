
public class VarArgs {
	public static void main(String[] args) {
		Execute e=new Execute();
		e.print();
		e.print("V","A","R","A","R","G","S");
	}
}

class Execute
{
	void print(String... string)
	{
		for(String s:string)
		{
			System.out.print(s);
		}
	}
}