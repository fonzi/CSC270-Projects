public class HeapSort {
	public static void main(String [] args)
	{
		//this is a random orderd array 
		int[] arrayU = {2,4,1,3,5,7,6,9,8,0};
		//this is an orderd array
		int[] arrayO = {0,1,2,3,4,5,6,7,8,9};
		//this is a reversed orderd array
		int[] arrayOR ={9,8,7,6,5,4,3,2,1,0};
		
		//--------------------arrayU------------------------//
		/*
		 * This three for loops are almost identical
		 * the only difference is that they each 
		 * are used for a different array
		 */
		System.out.println("Array U this is the array as it was defined at the start");
		for(int a = 0; a < arrayU.length; a ++)
		{
			System.out.println(arrayU[a]+",");
		}
		System.out.println("");
		System.out.println("this is the printed arrayU " +
				"after it has been passed trough the heapsort");
		
		HEAPSORT(arrayU, 9);
		//-----------------------arrayO-----------------------------//
		System.out.println("Array O this is the array as it was defined at the start");
		for(int a = 0; a < arrayO.length; a ++)
		{
			System.out.println(arrayO[a]+",");
		}
		System.out.println("");
		System.out.println("this is the printed arrayU " +
				"after it has been passed trough the heapsort");
		
		HEAPSORT(arrayO, 9);
		//------------------------arrayOR----------------------------//
		System.out.println("Array OR this is the array as it was defined at the start");
		for(int a = 0; a < arrayOR.length; a ++)
		{
			System.out.println(arrayOR[a]+",");
		}
		System.out.println("");
		System.out.println("this is the printed arrayU " +
				"after it has been passed trough the heapsort");
		
		HEAPSORT(arrayOR, 9);
	}
	
	/*
	 * A is the array taken in by the method 
	 * i is the root position or the index of the array
	 * n is the size of the array or the heap
	 */
	public static void MAX_HEAPIFY(int [] A, int i, int n)
	{

		int l = i + 1;//sets the left tree root
		int r = i + 2;//sets the right tree root
		int largest = 0;
	
		if(l <= n && A[l] > A[i])
		{
			largest = l;
			largest = i;
		}
		else
		{
			largest = i;
		}
		if(r <= n && A[r] > A[largest])
		{
			largest = r;
		}
		if(largest != i)
		{
			int temp = A[largest];
			A[largest] = A[i];
			A[i] = temp;
			MAX_HEAPIFY(A, l, n);
		}
	}
	//this method builds a max heap takes in an array and a int n
	public static void BUILD_MAX_HEAP(int [] A, int n)
	{
		for(int i = (int) Math.floor(n/2); i >= 0; i --)
		{
			//calls the method max_heapify and inputs the Array passed in
			//the i from the for loop
			//and the n passed in as well.
			MAX_HEAPIFY(A, i, n);
		}
	}
	//this method is the heap sort it takes in one array and a lenght 
	public static void HEAPSORT(int [] A, int n)
	{
		BUILD_MAX_HEAP(A, n);
		for(int i = n; i >= 0; i --)
		{
			//exchanges the elements of the arrays.
			int temp = A[1];
			A[1] = A[i];
			A[i] = temp;
			MAX_HEAPIFY(A, 1, i-1);
			
		}
		//this for loop is to print the arrays 
		System.out.println("this is the arranged set");
		for( int x =0; x<A.length; x++)
		{
			System.out.println(x+",");
		}
	}
}





