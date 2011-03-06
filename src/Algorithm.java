
public class Algorithm {

int k =0;
	
	public void Algorithm (int[] a, int[] b, int[] c, int disks)
	{
	if (c[0]==disks)
	{
		System.out.println("Solved! (Or there is an error on start");
	}
	else if (a[0] == disks || (b[b[0]+1] == 0 && a[a[0]+1] != 0) || (a[a[0]+1] != 0 && a[a[0]+1] < b[b[0]+1])) //(Start)
	{
		System.out.println("Moving disk from pos " + " on a to pos " + " on b. ID = 1");
		//From a to b
		System.out.println(b[0]);
		//System.out.println(++b[0]);
		b[(++b[0])+1] = a[(a[0]--)+1];
		a[(a[0]+1)+1] = 0;
		printArr(a, b, c, disks);
		
		Algorithm(a, b, c, disks);
	}
	else if ((b[b[0]+1] == 0 && a[a[0]+1] != 0) || (a[a[0]+1] != 0 && a[a[0]+1] < b[b[0]+1]))
	{
		System.out.println("Moving disk from pos " +  " on a to pos " +  " on b. ID = 2");
		//From a to b
		b[(++b[0])+1] = a[(a[0]--)+1];
		a[(a[0]+1)+1] = 0;
		
		Algorithm(a, b, c, disks);		
	}

	else if (c[0]==0 || (c[c[0]+1] == 0 && a[a[0]+1] !=0 || a[a[0]+1] !=0  && a[a[0]+1] < c[c[0]+1]))
	{
		System.out.println("Moving disk from pos "  + " on a to pos " + " on c. ID = 3");
		//From a to c
		c[(++c[0])+1] = a[(a[0]--)+1];
		a[(a[0]+1)+1] = 0;
		printArr(a, b, c, disks);
		
		Algorithm(a, b, c, disks);		
	}
	else if (c[c[0]+1] == 0 && a[a[0]+1] !=0 || a[a[0]+1] !=0  && a[a[0]+1] < c[c[0]+1])
	{
		System.out.println("Moving disk from pos "  + " on a to pos " + " on c. ID = 4");
		//From a to c
		c[(++c[0])+1] = a[(a[0]--)+1];
		a[(a[0]+1)+1] = 0;
		printArr(a, b, c, disks);
		
		Algorithm(a, b, c, disks);		
	}
	
	
	else if (b[b[0]+1] == 0 && c[c[0]+1] != 0 || c[c[0]+1] != 0 && c[c[0]+1] < b[b[0]+1])
	{
		System.out.println("Moving disk from pos " + " on c to pos " + " on c. ID = 5");
		//From c to b
		b[(++b[0])+1] = c[(c[0]--)+1];
		c[(c[0]+1)+1] = 0;
		
		Algorithm(a, b, c, disks);			
	}
	
//	else if (c[c[0]+1] < b[b[0]+1])
//	{
//		System.out.println("Moving disk from pos " +  " on a to pos " +  " on b. ID = 5");
//		//From a to b
//		b[(++b[0])+1] = c[(c[0]--)+1];
//		c[(c[0]+1)+1] = 0;
//		
//		Algorithm(a, b, c, disks);		
//	}
	
	else if (c[c[0]+1] == 0 && b[b[0]+1] !=0 || b[b[0]+1] !=0 && b[b[0]+1] < c[c[0]+1])
	{
		System.out.println("Moving disk from pos " +  " on a to pos " +  " on b. ID = 6");
		//From b to c
		c[(++c[0])+1] = b[(b[0]--)+1];
		b[(b[0]+1)+1] = 0;
		
		Algorithm(a, b, c, disks);	
	}

//	else if (b[b[0]+1] !=0 && b[b[0]+1] < c[c[0]+1])
//	{
//		System.out.println("Moving disk from pos " +  " on a to pos " +  " on b. ID = 6");
//		//From b to c
//		c[(++c[0])+1] = b[(b[0]--)+1];
//		b[(b[0]+1)+1] = 0;
//		
//		Algorithm(a, b, c, disks);	
//	}

	
		
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
	
		
	
	public void printArr(int[] a, int[] b, int[] c, int disks)
	{	
		k++;
		System.out.println("Disks: " + disks);
		System.out.println("Printing array-values: (Algorithm) " + k);
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
		System.out.println("-------------------------------");
	}
	
}



