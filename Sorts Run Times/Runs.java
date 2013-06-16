import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Runs {
	
	public static void main (String [] args)
	{
		int[] onehundred = new int[100];
		int[] onethousand = new int[1000];
		int[] tenthousand = new int[10000];
		int[] onehundredthousand = new int[100000];
		int[] onemillion = new int [1000000];
		
		Random randNumGenerator = new Random();

		for(int i = 0; i <onehundred.length; i ++ )
		{
			//onehundred[i] = (randNumGenerator.nextInt(1000000)+1);
			onehundred[i]=i;
			//System.out.println(onehundred[i]);	
		}
		//reverse(onehundred);
		//System.out.println(Arrays.toString(onehundred));
		for(int i = 0; i< onethousand.length; i ++ )
		{
			//onethousand[i] = (randNumGenerator.nextInt(1000000)+1);
			onethousand[i] = i;
			//System.out.println(onethousand[i]);
		}
		//reverse(onethousand);
	
		for(int i = 0; i< tenthousand.length; i ++ )
		{
			//tenthousand[i] = (randNumGenerator.nextInt(1000000)+1);
			tenthousand[i] = i;
		}
		//reverse(tenthousand);
		
		for(int i = 0; i< onehundredthousand.length; i ++ )
		{
			//onehundredthousand[i] = (randNumGenerator.nextInt(1000000)+1);
			onehundredthousand[i] = i;
		}
		//reverse(onehundredthousand);
		
		for(int i = 0; i< onemillion.length; i ++ )
		{
			//onemillion[i] = (randNumGenerator.nextInt(1000000)+1);
			onemillion[i] = i;
		}
		//reverse(onemillion);
		
		
		AllAlgorithms sorts = new AllAlgorithms();
		
	
		//one hundred runs
		//int[] one =  onehundred;
		//long start = System.nanoTime();
		//sorts.bubble(one);
		//start = System.nanoTime() -start;
		//System.out.println(start);

		//int[] two = onehundredthousand;
		//long start1 = System.nanoTime();
		//sorts.HEAPSORT(two,two.length-1);
		//start1 = System.nanoTime() -start1;
		//System.out.println(start1);

		
		//int[] three =  onehundred;
		//System.out.println(Arrays.toString(three));
		//long start2 = System.nanoTime();
		//sorts.insertionSort(three);
		//start2 = System.nanoTime() -start2;
		//System.out.println(start2);
		//System.out.println(Arrays.toString(three));		
		
		//int[] four =onehundred;
		//long start3 = System.nanoTime();
		//sorts.mergeSort(four,0,four.length-1);
		//start3 = System.nanoTime() -start3;
		//System.out.println(start3);
		

		
		//int[] five =  onehundred;
		//long start4 = System.nanoTime();
		//sorts.qSort(five, 0, five.length-1);
		//start4 = System.nanoTime() -start4;
		//System.out.println(start4);
		
		
		int[] six =  onehundred;
		long start5 = System.nanoTime();
		sorts.selection(six);
		start5 = System.nanoTime() - start5;
		System.out.println(start5);
		
	}
	public static void reverse(int[] arrayOne) 
	{  
		for(int s = 0, e = arrayOne.length - 1; s < e; ++s, --e) 
		{  
			int temp = arrayOne[s];    
		    arrayOne[s] = arrayOne[e];  
		    arrayOne[e] = temp;  
		}  
	}  
}
