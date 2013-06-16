public class QuickSort {

	public static void QuickSort(int [] A, int p , int r)
	{
		//this if statments recursivly calls quicksort 
		if(p < r)
		{
			int q = Partition(A, p, r);
			QuickSort(A, p, q-1);//recursive call
			QuickSort(A,q+1,r);//recursive call
		}	
	}
	//this method is the one that partitions the array and checks the pivot (r)
	public static int Partition(int []A, int p, int r)
	{
		//sets x to a[r]
		int x = A[r];
		//sets i to p-1
		int i = p-1;
		int temp = 0;
		//this for loop creates the subarray of j 
		for(int j = p; j<=r-1; j++)
		{
			//if j is  less than x then it swaps A[i] with A[j]
			if (A[j]<=x)
			{
				i = i +1;
				temp = A[i];
                A[i] = A[j];
                A[j] = temp;
			}
		}
		//swaps A[i+1] with A[r]
		temp = A[i+1];
        A[i+1] = A[r];
        A[r] = temp;
        //returns 1 +1
        return (i+1);
	}
	public static void main(String [] args)
	{
		//this is a random orderd array 
		int[] arrayU = {2,4,1,3,5,7,6,9,8,0};
		//this is an orderd array
		int[] arrayO = {0,1,2,3,4,5,6,7,8,9};
		//this is a reversed orderd array
		int[] arrayOR ={9,8,7,6,5,4,3,2,1,0};
		
		//These for loops are basically the same excpet each one calls a different array
		//----------------Array U ---------------//
		System.out.println("--------ArrayU-------");
        System.out.println("Original  Array : ");
        for(int i=0; i<arrayU.length;i++)
        {
            System.out.print(arrayU[i] + " ");
        }
        QuickSort(arrayU, 0, arrayU.length-1);
        System.out.println("");
        System.out.println("Sorted  Array : ");
        for(int i=0; i<arrayU.length;i++)
        {
            System.out.print(arrayU[i] + " ");
        }
        System.out.println("");
        System.out.println("----------------------");
       
        //-----------------array O----------------//
        System.out.println("-------arrayO---------");
        System.out.println("Original  Array : ");
        for(int i=0; i<arrayO.length;i++)
        {
            System.out.print(arrayO[i] + " ");
        }
        QuickSort(arrayO, 0, arrayO.length-1);
        System.out.println("");
        System.out.println("Sorted  Array : ");
        for(int i=0; i<arrayO.length;i++)
        {
            System.out.print(arrayO[i] + " ");
        }
        System.out.println("");
        System.out.println("----------------------");
       //-------------------Array OR ----------------//
        System.out.println("-------arrayOR---------");
        System.out.println("Original  Array : ");
        for(int i=0; i<arrayOR.length;i++)
        {
            System.out.print(arrayOR[i] + " ");
        }
        QuickSort(arrayOR, 0, arrayOR.length-1);
        System.out.println("");
        System.out.println("Sorted  Array : ");
        for(int i=0; i<arrayOR.length;i++)
        {
            System.out.print(arrayOR[i] + " ");
        }
        System.out.println("");
        System.out.println("----------------------");
    }
}
/*Output runs
*--------ArrayU-------
Original  Array : 
2 4 1 3 5 7 6 9 8 0 
Sorted  Array : 
0 1 2 3 4 5 6 7 8 9 
----------------------
-------arrayO---------
Original  Array : 
0 1 2 3 4 5 6 7 8 9 
Sorted  Array : 
0 1 2 3 4 5 6 7 8 9 
----------------------
-------arrayOR---------
Original  Array : 
9 8 7 6 5 4 3 2 1 0 
Sorted  Array : 
0 1 2 3 4 5 6 7 8 9 
----------------------
*/