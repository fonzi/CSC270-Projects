public class Selection_Sort {
	public static void main (String [] args)
	{
		//this mesures the compile time
		long start = System.currentTimeMillis();
		//these are 3 arrays declared to test the effectivity of the selection sort
		int [] o = {0,1,2,3,4,5};//order array
		int [] u = {4,5,2,0,1,3};//unorder array
		int [] ro = {5,4,3,2,1,0};//reverse order array
		
		/*
		 * The three following for loop consist of the exact same initiazion and mantainace and termination, 
		 * they are only for mere testing each array at its own to work effectivly
		 */
		
		//---------------------------------------------------------------------------//
		//this portion checks that the selection sort works for the order array
		System.out.println("this is the array o");
		for(int x = 0; x < o.length; x ++)
		{
			System.out.print(o[x] + ",");
		}
		System.out.println(" ");
		System.out.println("Below is the printed result for array o after the selection method has been runned");
		selection(o);
		//---------------------------------------------------------------------------//
		//this portion checks that the selection sort works for the un-order array
		System.out.println("this is the array u");
		for(int y = 0; y < u.length; y ++ )
		{
			System.out.print(u[y] + ",");
		}
		System.out.println(" ");
		System.out.println("Below is the printed result for the array after the selection method has been runned");
		selection(u);
		//----------------------------------------------------------------------------//
		//this portion checks that the selection sort works for the reversed order array
		System.out.println("this is the array ro");
		for(int z = 0; z < ro.length; z ++)
		{
			System.out.print(ro[z] + ",");
		}
		System.out.println(" ");
		System.out.println("Below is the printed result for the array after the selcetion method has been runned");
		selection(ro);
		
		long elapsedTimeMillis = System.currentTimeMillis() -start;
		//This is the time in milliseconds the whole project took in run-time
		System.out.println("RUN TIME for the project ");
		System.out.println(elapsedTimeMillis  + " ms");
	}
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
		
		System.out.println("This is the arragned set");
		//this loop prints out the array of ints
		for(int x = 0;x < sortThis.length; x ++)
		{
			System.out.println(sortThis[x]+",");
		}
	}//end method selection
	
	public String toString()
	{
		return "";
	}
}



/*
Inputs
int [] o = {0,1,2,3,4,5};//order array
int [] u = {4,5,2,0,1,3};//unorder array
int [] ro = {5,4,3,2,1,0};//reverse order array 


*Output and run time
*this is the array o
0,1,2,3,4,5, 
Below is the printed result for array o after the selection method has been runned
This is the arragned set
0,
1,
2,
3,
4,
5,
this is the array u
4,5,2,0,1,3, 
Below is the printed result for the array after the selection method has been runned
This is the arragned set
0,
1,
2,
3,
4,
5,
this is the array ro
5,4,3,2,1,0, 
Below is the printed result for the array after the selcetion method has been runned
This is the arragned set
0,
1,
2,
3,
4,
5,
RUN TIME for the project 
23 ms

*
*/