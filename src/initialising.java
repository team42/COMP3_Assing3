import java.util.Scanner;


public class initialising {
	int disks;
	int k = 1;
	public int[] copyArray(int[] array)
	{
		int[] copy = java.util.Arrays.copyOf(array, array.length);		
		return copy;		
	}
	
	
	public int[] disks()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("How many disks do you want to use?");
		disks = s.nextInt();
		return this.createArr(disks);
	}
	
	public int[] createArr(int disks)
	{
		int[] a = new int[disks + 2];
		return a;
	}
	
	
	public int[] fillArr(int[] array)
	{
		int i;
		int j = array.length-2;
		for (i=2; i<array.length; i++)
		{
			array[i] = j;
			j--;
		}
		
		array[0] = array.length-2;
		
		return array;
	}
	
	public void printArr(int[] array)
	{
		System.out.print("Printing array-values: ");
		int i;
		for (i=2; i<array.length; i++)
		{
			System.out.print(array[i] + ", ");
		}	
		System.out.println();
	}
	
	public int[] ID (int[] array)
	{
		array[1] = k;
		k++;
		return array;
	}
}
