package sampleprograms;
import java.util.*;

public class MyArrayList {
	
static Scanner input = new Scanner(System.in);
static ArrayList<Integer> array = new ArrayList<Integer>();

public static void main(String[] args)
{
	System.out.println("Enter the Integers now. To Terminate type 0");
	int i = input.nextInt();
	while (i != 0)
	{
		array.add(i);
		i = input.nextInt();
	}
	printArray();
	
	System.out.println("Enter the Integer to delete");
	i = input.nextInt();
	for(int j = 0; j < array.size();j++)
	{
		if (array.get(j) == i)
		{
			array.remove(j);
		}
	}
	printArray();
	
}

public static void printArray()
{
	System.out.printf("\n---------------------------------------\n");
	for (int element : array)
	{
		System.out.printf("%d ",element);
	}
	System.out.printf("\n---------------------------------------\n");
	
}

}
