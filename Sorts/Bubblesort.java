public class Bubblesort {
	public static void main (String [] args)
	{
		long start = System.currentTimeMillis();
		//this array is an unorder array set to random numbers at a random order 
		int[] arrayU = {2,4,1,3,5,7,6,9,8,0};
		//this is an order array set to order numbers at a order oderd
		int[] arrayO = {0,1,2,3,4,5,6,7,8,9};
		//this is an reverse order array set to reverse order set
		int[] arrayOR ={9,8,7,6,5,4,3,2,1,0};
		
		/*
		 * The following test are made to compare the three arrays created 
		 * The three for loops consist of the same implementations only using different variables
		 */
		
		//arrayU Test unorders
		System.out.println("This is the array U");
		for(int x = 0;x <arrayU.length; x ++)
		{			
			System.out.print(arrayU[x]+",");
		}
		System.out.println("");
		System.out.println("This prints the array U set, after the bubble method");
		bubble(arrayU);
		//------------------------------------------------------//
		//arrayO tests order array for the bubble sort
		System.out.println("this is the array O");
		for(int y = 0; y < arrayO.length; y ++)
		{
			System.out.print(arrayO[y] + ",");
		}
		System.out.println("");
		System.out.println("This prints the array Orderd set");
		bubble(arrayO);
		//------------------------------------------------------//
		System.out.println("this is the array OR");
		for(int z = 0; z < arrayOR.length; z ++)
		{
			System.out.print(arrayOR[z] + ",");
		}
		System.out.println("");
		System.out.println("This prints the array Reversed Order set into an order set");
		bubble(arrayOR);
		
		
		long elapsedTimeMillis = System.currentTimeMillis() -start;
		//This is the time in milliseconds the whole project took in run-time
		System.out.println("RUN TIME for the project ");
		System.out.println(elapsedTimeMillis  + " ms");
	}
	
	//this is the bubble sort method 
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
		
		//This for loop and print line is for the simple matter to see the test results clearly. 
		System.out.println("This is the arragned set");
		//this loop prints out the array of ints
		for(int x = 0;x < sortThis.length; x ++)
		{
			System.out.println(sortThis[x]+",");
		}
	}
	
	//A to string to see objects printed if needed.
	@Override
	public String toString()
	{
		return " ";
	}

}


/*
 * In
 * 
 * output results 
 * 
 * This is the array U
2,4,1,3,5,7,6,9,8,0,
This prints the array U set, after the bubble method
This is the arragned set
0,
1,
2,
3,
4,
5,
6,
7,
8,
9,
this is the array O
0,1,2,3,4,5,6,7,8,9,
This prints the array Orderd set
This is the arragned set
0,
1,
2,
3,
4,
5,
6,
7,
8,
9,
this is the array OR
9,8,7,6,5,4,3,2,1,0,
This prints the array Reversed Order set into an order set
This is the arragned set
0,
1,
2,
3,
4,
5,
6,
7,
8,
9,
RUN TIME for the project 
8 ms

 */

