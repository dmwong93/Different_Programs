import java.util.Scanner;

public class File_Array_Test
{
	public static void main(String[] args)
	{
	
	int values;
	double[] arrayList;

	Scanner kb = new Scanner(System.in);

	System.out.print("Enter the amount of values entering: ");
	values = kb.nextInt();

	arrayList = new double[values];
	for (int index = 0; index < arrayList.length; index++)	
	{
		System.out.print("Enter the values for number " +
			          (index + 1) + ": ");
		arrayList[index] = kb.nextDouble();
	}
			
	File_Array numberDisplay = new File_Array(arrayList);

	System.out.println("This average of you numbers is: " + numberDisplay.average());
	}
}
