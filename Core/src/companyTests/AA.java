package companyTests;

public class AA //Nimap
{
	public static void main(String[] args)
	{
		int output=10;
		boolean b1=false;
		if((b1==true)&&(output+=10)==20)
		{
			System.out.println("Equal "+output);
		}
		else
		{
			System.out.println("Not equal "+output);
		}
	}
}
