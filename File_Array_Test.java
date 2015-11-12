import java.util.Scanner;

public class File_Array_Test
{
	public static void main(String[] args)
	{
	
	int values;
	double[] arrayList;

	Scanner kb = new Scanner(System.in);

	System.out.print("How many values are you entering: ");
	values = kb.nextInt();

	arrayList = new double[values];
	for (int index = 0; index < arrayList.length; index++)	
	{
		System.out.print("Enter the value for number " +
			          (index + 1) + ": ");
		arrayList[index] = kb.nextDouble();
	}
			
	File_Array numberDisplay = new File_Array(arrayList);

	System.out.println("Some facts about your numbers:");
	System.out.println("-------------");
	System.out.println("This is the sum of all your numbers: " + numberDisplay.sum());	
	System.out.println("This is the average of your numbers: " + numberDisplay.average());
	System.out.println("This is the highest of your numbers: " + numberDisplay.highestValue());
	System.out.println("This is the lowest of your numbers: " + numberDisplay.lowestValue());
	

	}
}
