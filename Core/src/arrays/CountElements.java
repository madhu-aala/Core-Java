package arrays; 
public class CountElements
{
	public static void main(String args[])   
	{  
		int arr[] = {9,2,112,259,64657,323236595,002,0};
		int count=0;
		for(int i=0; i<arr.length; i++)
		//for(int i:arr)
		{
			count++;
		}
		System.out.println("No.of elements in the array is " + count);
	}
}