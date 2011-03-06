
public class Algorithm {


	
	public void Algorithm (int[] a, int[] b, int[] c)
	{
	if (c[c.length-1]==1)
	{
		System.out.println("Solved! (Or there is an error on start");
	}
	else if (a[a[0]+1] == 1)
	{
		//From a to b (Start)
		b[(++b[0])+1] = a[(a[0]--)+1]=0;
		printArr(a, b, c);
		System.out.println("Moving disk from pos " + a[(a[0]--)+1] + " on a to pos " + b[(++b[0])+1] + " on b. ID = 1");
		Algorithm(a, b, c);
	}
	else if (a[0]+1 < b[0]+1)
	{
		//From a to b
		b[(++b[0])+1] = a[(a[0]--)+1];
		System.out.println("Moving disk from pos " + a[(a[0]--)+1] + " on a to pos " + b[(++b[0])+1] + " on b. ID = 2");
		Algorithm(a, b, c);		
	}
//	else if (a[0]+1 < c[1]-1) //Flyttes til sidst????
//	{
//		//From a to c (Start)
//		c[(++b[0])+1] = a[(a[0]--)+1];
//		System.out.println("Moving disk from pos " + a[(a[0]--)+1] + " on a to pos " + b[(++b[0])+1] + " on c");
//		Algorithm(a, b, c);		
//	}
	else if (a[0]+1 < c[0]+1)
	{
		//From a to c
		c[(++b[0])+1] = a[(a[0]--)+1];
		System.out.println("Moving disk from pos " + a[(a[0]--)+1] + " on a to pos " + b[(++b[0])+1] + " on c. ID = 3");
		Algorithm(a, b, c);		
	}
	
	else if (c[0]+1 < b[0]+1)
	{
		//From c to b
		b[(++b[0])+1] = c[(c[0]--)+1];
		System.out.println("Moving disk from pos " + c[(a[0]--)+1] + " on c to pos " + b[(++b[0])+1] + " on c. ID = 4");
		Algorithm(a, b, c);			
	}
//	else if ()

	
		
	}
//	
//	public void run()
//	{
//	while(c[c.length-1]==0)
//	{
//		
//	
//		//From a to b
//	b[(++b[0])+1] = a[(a[0]--)+1];
//	}
//	this.printArr(a);
//	this.printArr(b);
//	}
	
		
	
	public void printArr(int[] a, int[] b, int[] c)
	{		
		System.out.println("Printing array-values: ");
		int i;
		//System.out.println(a.length);
		for (i=a.length-1; 0<=i; i--)
		{
			System.out.print("a["+i+"]: " + a[i]+ "\n");
		}	
		System.out.println();
		
		for (i=b.length-1; 0<=i; i--)
		{
			System.out.print("b["+i+"]: " + b[i]+ "\n");
		}	
		
		System.out.println();
		
		for (i=c.length-1; 0<=i; i--)
		{
			System.out.print("c["+i+"]: " + c[i]+ "\n");
		}	
		System.out.println();
	}
	
}



