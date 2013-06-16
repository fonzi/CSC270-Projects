
public class Merge_Sort {

	public static void main(String [] args)
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
		System.out.println("this is the printed arrayU after it has been passed trough the method merge");
		merge(arrayU);
		//--------------------------orderd-array--------------------------------//
		System.out.println("this is the arrayO");
		for(int b = 1; b < arrayO.length; b ++)
		{
			System.out.print(arrayO[b]+" ,");
		}
		System.out.println("");
		System.out.println("this is the printed arrayO after it has been passed trough the method merge");
		merge(arrayO);
		//------------------------arrayOR----------------------------------------//
		System.out.println("this is the arrayOR");
		for(int c = 1; c < arrayOR.length; c ++)
		{
			System.out.print(arrayO[c]+" ,");
		}
		System.out.println("");
		System.out.println("this is the printed arrayOR after it has been passed trough the method merge");
		merge(arrayOR);
	}
	public static void merge(int array[])
	{
		int[] fixedArray = {};
		if(array.length > 1)
		{
			//elements in array 1
			int eArray1 = array.length/2;
			//elements in array 2
			int eArray2 = array.length- eArray1;
			//creates two new arrays with the elements of eArray 1 and 2
			int array1 [] = new int [eArray1];
			int array2 [] = new int [eArray2];
			//loops trough the eArray and increments the i
			for(int i = 0; i < eArray1; i ++)
			{
				//sets i of array1 to array 
				array1[i] = array[i];
			}
			//loops through e array 1 
			for(int i = eArray1; i < eArray1 + eArray2; i ++ )
			{
				//sets array 2 to the index of array - earray1 to array
				array2[i - eArray1] = array[i];
			}
			//calls the arrays in recursion
			//declares 3 new variables for i j and k 
			//these variable will keep track of all the arrays that are called and created in merge sort
			int i =0, j = 0, k =0;
			//this while loop checks if length of array 1 and 2 are not equal to i,j
			while(array1.length != j && array2.length != k)
			{
				//while array1 is less or equal than array2 then i and j are incremented
				if(array1[j] <= array2[k])
				{
					i++;
					j++;
				}
				//while both array 1 and 2 are equal
				//both i and k are incremented
				else
				{
					array[i] = array2[k];
					i ++;
					k++;
				}
			}
			//this loop now cheks if the array1 length is not equal to j
			while(array1.length != j)
			{
				array[i] = array1[j];
				i++;
				j++;
			}
			
			while(array2.length != k)
			{
				array[i] = array2[k];
				i ++;
				k++;
			}
		}
		
		//This for loop and print line is for the simple matter to see the test results clearly. 
		System.out.println("This is the arragned set");
		//this loop prints out the array of ints
		for(int x = 0;x < array.length; x ++)
		{
			System.out.println(x+",");
		}
		
		
	}


	public String toString()
	{
		return " ";
	}
	
}

/*
*This are the run results
*
this is the arrayU
4 ,1 ,3 ,5 ,7 ,6 ,9 ,8 ,0 ,
this is the printed arrayU after it has been passed trough the method merge
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
this is the printed arrayO after it has been passed trough the method merge
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
this is the printed arrayOR after it has been passed trough the method merge
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
*/