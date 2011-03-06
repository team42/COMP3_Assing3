


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a;
		int[] b;
		int[] c;
		
		initialising i = new initialising();
		Algorithm algo = new Algorithm();
		
		//Creating three empty arrays
		a = i.disks();
		a = i.ID(a);
		b = i.copyArray(a);
		b = i.ID(b);
		c = i.copyArray(a);
		c = i.ID(c);

		
		//Filling one of the empty arrays
		a = i.fillArr(a);

		//i.printArr(a);
		System.out.println("a[4]: " + a[4]);
		System.out.println("a[3]: " + a[3]);
		System.out.println("a[2]: " + a[2]);
		System.out.println("a[1]: " + a[1]);
		System.out.println("a[0]: " + a[0]);
		
		System.out.println();
		
		System.out.println("c[4]: " + c[4]);
		System.out.println("c[3]: " + c[3]);
		System.out.println("c[2]: " + c[2]);
		System.out.println("c[1]: " + c[1]);
		System.out.println("c[0]: " + c[0]);
		
		algo.Algorithm(a, b, c);
		
		

		
		
		
	}

}
