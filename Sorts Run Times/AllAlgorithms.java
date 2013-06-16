public class AllAlgorithms {
	//--------------------bubble sort -------------------------//
	public static void bubble(int [] sortThis)
	{
		int temp =0;
		for(int i = 0; i < sortThis.length; i ++)
		{
			for(int j = 0; j <sortThis.length-1; j ++)
			{
				if(sortThis[j] > sortThis[j+1])
				{
					temp = sortThis[j];
					sortThis[j] = sortThis[j+1];
					sortThis[j+1] = temp;
				}//end if 
			}//end inner for 
		}//end for
	}
	
	//-----------------------heap sort --------------------------//
	public static void MAX_HEAPIFY(int [] A, int i, int n)
	{

		int l = i + 1;//sets the left tree root
		int r = i + 2;//sets the right tree root
		int largest = 0;
	
		if(l <= n && A[l] > A[i])
		{
			largest = l;
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
			MAX_HEAPIFY(A, largest, n);
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
		for(int i = n; i >= 1; i --)
		{
			//exchanges the elements of the arrays.
			int temp = A[0];
			A[0] = A[i];
			A[i] = temp;
			MAX_HEAPIFY(A, 0, i-1);
			
		}
		/**
		//this for loop is to print the arrays 
		System.out.println("this is the arranged set");
		for( int x =0; x<A.length; x++)
		{
			System.out.println(x+",");
		}
		*/
	}
	//-----------------------------------Insertion Sort-------------------------------------//
	public static void insertionSort(int [] insertThis)
	{
		//declares 3 int variables 
		int key, j, i;
		//runs troungh the array
		for(j = 1; j<insertThis.length; j ++)
		{
			//sets key to array in elemt j
			key = insertThis[j];
			//sets i to j
			i = j;
			//checks i > 0 and if array is greated than key
			while(i > 0 && insertThis[i - 1] > key )
			{
				insertThis[i] = insertThis[i - 1];
				i--;
			}
		insertThis[i] = key;	
		}
	}
	//---------------------------Merge sort ---------------------------------------------//	
	public static void mergeSort(int[] A, int p, int r) 
	  {
	      if (p < r) {
	         int q = (int) (Math.floor((p + r) / 2));
	         mergeSort(A, p, q);
	         mergeSort(A, q + 1, r);
	         merge(A, p, q, r);
	      }
	   }
	
	 public static void merge(int[] A, int p, int q, int r) 
	 {
		 int n1 = q - p + 1;
	     int n2 = r - q;
	     int[] L = new int[n1 + 1];
	     int[] R = new int[n2 + 1];
	     L[n1] = Integer.MAX_VALUE;
	     R[n2] = Integer.MAX_VALUE;
	     for (int i = 0; i < n1; i++) 
	     {
	    	 L[i] = A[p + i];
	     }
	     for (int j = 0; j < n2; j++) 
	     {
	    	 R[j] = A[q + j + 1];
	     }
	     int x = 0, y = 0;
	     for (int k = p; k < r; k++) 
	     {
	    	 if (L[x] <= R[y]) 
	    	 {
	    		 A[k] = L[x];
	    		 x++;
	         } 
	    	 else 
	    	 {
	    		 A[k] = R[y];
	    		 y++;
	         }
	      }
	   }
	//-----------------------Quick Sort-----------------------------------------//
	 public static void qSort(int[] a, int p, int r)
	    {
	        if(p<r)
	        {
	            int q = Partition(a, p,r);
	            qSort(a, p, q-1);
	            qSort(a, q+1, r);
	        }
	     }

	 private static int Partition(int[] a, int p, int r)
	 {
		 int x = a[r];

	     int i = p-1;
	     int temp=0;

	     for(int j=p; j<r; j++)
	     {
	    	 if(a[j]<=x)
	    	 {
	    		 i++;
	    		 temp = a[i];
	             a[i] = a[j];
	             a[j] = temp;
	         }
	     }

	     temp = a[i+1];
	     a[i+1] = a[r];
	     a[r] = temp;
	     return (i+1);
	 }
	//-----------------------------------------Selection Sort----------------------//
	public static void selection(int [] sortThis)
	{
		for(int i = 0; i <sortThis.length; i ++)
		{
			for(int j= i+1; j<sortThis.length; j ++)
			{
				if(sortThis[i] > sortThis[j])
				{
					int temp = sortThis[i];
					sortThis[i] = sortThis[j];
					sortThis[j] = temp;
				}//end if 
			}//end inner loop
		}//end outer for loop
	}
	
}