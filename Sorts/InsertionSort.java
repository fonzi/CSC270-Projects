public class InsertionSort {
	public static void main (String [] args)
	{
		//this array is an unorder array set to random numbers at a random order 
		int[] arrayU = {2,4,1,3,5,7,6,9,8,0};
		//this is an order array set to order numbers at a order oderd
		int[] arrayO = {0,1,2,3,4,5,6,7,8,9};
		//this is an reverse order array set to reverse order set
		int[] arrayOR ={9,8,7,6,5,4,3,2,1,0};
				
		//this three parts are almost identical the only difference is that they all test one differnt array		
		//---------------------unorderd-array-----------------------------------//
		System.out.println("this is the arrayU");
		for(int a = 1; a < arrayU.length; a ++)
		{
			System.out.print(arrayU[a]+" ,");
		}		
		System.out.println("");
		System.out.println("this is the printed arrayU after it has been passed trough the method insertionSort");
		insertionSort(arrayU);
		//--------------------------orderd-array--------------------------------//
		System.out.println("this is the arrayO");
		for(int b = 1; b < arrayO.length; b ++)
			{
				System.out.print(arrayO[b]+" ,");
			}
		System.out.println("");
		System.out.println("this is the printed arrayO after it has been passed trough the method insertionSort");
		insertionSort(arrayO);
		//------------------------arrayOR----------------------------------------//
		System.out.println("this is the arrayOR");
		for(int c = 1; c < arrayOR.length; c ++)
			{
				System.out.print(arrayO[c]+" ,");
			}
		System.out.println("");
		System.out.println("this is the printed arrayOR after it has been passed trough the method insertionSort");
		insertionSort(arrayOR);
	}
	//this method is the insertion sort it sorts an array trough the insertion method
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
		//This for loop and print line is for the simple matter to see the test results clearly. 
		System.out.println("This is the arragned set");
		//this loop prints out the array of ints
		for(int x = 0;x < insertThis.length; x ++)
			{
				System.out.println(x+",");
			}
	}
}


/*
*This are the Run Results
*
this is the arrayU
4 ,1 ,3 ,5 ,7 ,6 ,9 ,8 ,0 ,
this is the printed arrayU after it has been passed trough the method insertionSort
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
this is the arrayO
1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,
this is the printed arrayO after it has been passed trough the method insertionSort
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
this is the arrayOR
1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,
this is the printed arrayOR after it has been passed trough the method insertionSort
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
*
*/