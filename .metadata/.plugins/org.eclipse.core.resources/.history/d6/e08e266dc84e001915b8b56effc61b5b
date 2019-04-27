package com.bridgelabz.util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//import java.util.Scanner;

public class AlgorithmProgramming {
	private static Scanner scan = new Scanner (System.in);
	
public static int getInt()
	{
		return scan.nextInt();
	}
	
	
	public static String getString()
	{
		return scan.next();
	}
	

	public static Double getdouble()
	{
		return scan.nextDouble();
	}
	public static Character getChar()
	{
	     return scan.next().charAt(0);
	}
	
	public static Float getFloat()
	{
		return scan.nextFloat();
	}
	
	public static int[] arr()
	{
		int n =AlgorithmProgramming.getInt();
		int []arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = AlgorithmProgramming.getInt();
		}
		for(int e:arr)
		{
			System.out.print(e+" ");
		}
		System.out.println();
		return arr;

	}

	
	public static float flt()
	{
		float f = scan.nextFloat();
		return f;
	}
	
	public static int primeRange()
	
	{
		int i=0;
		int num=0;
	String primeNum=" ";
		for( i=1;i<=1000;i++)
		{  
			int c = 0;
			for( num =i;num>=1;num--)
			{
				if(i%num == 0)

				{
					c = c+1;
				}
			}
			if(c== 2)
			{
				primeNum = primeNum  + i + " ";
				
				}
			}
		System.out.println(primeNum);
		return num;
		}

    





/**Anagram program
 * @param str1
 * @param str2
 * @return
 */
public static boolean isAnagram(char[] str1,char[] str2)
{
	
	
	int n1 = str1.length;
	int n2 = str2.length;
	
	if(n1 != n2)
		return false;
	
	Arrays.sort(str1);
	Arrays.sort(str2);
	
	for(int i=0;i<n1;i++)
		if(str1[i] != str2[i])
		{	
			return false;
		}
	return true;
}



/**Bubble Sort
 * @param a
 */
public static void bubbleSort(int arr[])
{
	for(int i=0;i<arr.length-1;i++)
	{
		for(int j=0;j<arr.length-1;j++)
	
			{
				if(arr[j]>arr[j+1])
				{
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
			}
		}
	for(int e:arr)
	{
		System.out.println(e+ " ");
	}

}



public static void insertString(String str)
{
	char[] array=str.toCharArray();
	int i=0,j=0,w;
	char temp;
for( i=0;i<array.length;i++)
{
	for(j=0;j<=i;j++)
	{
		if(array[j]>array[i])
		{
			temp = array[j];
			array[j]=array[i];
			array[i]=temp;
			for(w=i;w>j+1;w--)
			{
				array[w] = array[w-1];
			}
			array[w] = temp;
			
		}
		
	}
}
for(int k=0;k<array.length;k++)
	System.out.print(array[k] + " ");
System.out.println(" ");
}

/**Insertion sort using int
 * @param array
 */
public static void intInsertion(int[] array)
{
	int i,j,temp,w;
	for(i=0;i<array.length;i++)
	{
		for(j=0;j<=i;j++)
		{
			if(array[j]>array[i])
			{
				 temp=array[j];
				array[j]=array[i]; 
				for(w=i;w>j+1;w--)
				{
				    array[w]=array[w-1];
				}
                array[w]=temp;
		}
		}
	}for(int k:array)
	System.out.println(k + " ");
}


/**Payment 
	 * @param p
	 * @param y
	 * @param r
	 * @return
	 */
	public static double monthlyPayment(double p, double y, double r)
	{
		double n = 12 * y;
		double r0 = r / (12 * 100);
		double payment = p * r0 / (1 - Math.pow((1 + r0), -n));
		return payment;
	}


	public static void binInt(int[] array, int n, int key) {
		int low = 0;
		int high = n-1;
		int middle = (low + high)/2;

		while( low <=high )
		{
			if ( array[middle] < key )
				low = middle + 1;    
			else if ( array[middle] == key )
			{
				System.out.println(key + " found at location " + middle  + ".");
				break;
			}
			else
				high = middle - 1;

			middle = (low +high)/2;
		}
		if (low > high)
			System.out.println(key + " isn't present in the list\n");
	}
	
		
	
	/**Celsius temperature to Fahrenheit
	 * @param celsius
	 * @return
	 */
	public static float toFahrenheit(float celsius) {
        float fahrenheit = 9 * (celsius / 5) + 32;
        return fahrenheit;
    }
    /**
    * Converts fahrenheit temperature to celsius
     *
     * @param fahrenheit
     * @return
     */
    public static float toCelsius(float fahrenheit) {
        float celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }

    
    
    /**Vending Machine
     * @param change
     * @param cash
     */
    public static void vendingMachine(int[] change,int cash)
    {
    for(int i=change.length-1;i>=0;i--)
    {
        int count=0;
        if(cash==0)
            return;
        else 
            {
            if(cash>=change[i])
        {
            count=cash/change[i];
            System.out.println(change[i]+" notes:"+count);
            cash=cash-(count*change[i]);
        }
    } 
}

}
    
    /**Day of the week
     * @param d
     * @param m
     * @param y
     * @return
     */
    public static int dayOfWeek(int d,int m,int y)	
    {
      int y0 = y - (14 - m) / 12;
      int x = y0 + y0 / 4 -y0 / 100 + y0 / 400;
      int m0 = m + 12 * ((14 - m) / 12) -2;
      int d0  = (d + x + (31 * m0) / 12) % 7;
      return d0;
    }


	public static void binString(String str, int n1, char key1) {
		// TODO Auto-generated method stub
		int[] binaryNum = new int[1000]; 
		   
        // counter for binary array 
        int i = 0; 
        while (n1 > 0)  
        { 
            // storing remainder in binary array 
            binaryNum[i] = n1 % 2; 
            n1 = n1 / 2; 
            i++; 
        } 
   
        // printing binary array in reverse order 
        for (int j = i - 1; j >= 0; j--) 
            System.out.print(binaryNum[j]); 
    } 
	
    

    
    
    
/**Decimal to Binary
 * @param n
 */
public static void decimaToBinary(int n) {
	
    { 
        // array to store binary number 
        int[] binaryNum = new int[1000]; 
   
        // counter for binary array 
        int i = 0; 
        while (n > 0)  
        { 
            // storing remainder in binary array 
            binaryNum[i] = n % 2; 
            n = n / 2; 
            i++; 
        } 
   
        // printing binary array in reverse order 
        for (int j = i - 1; j >= 0; j--) 
            System.out.print(binaryNum[j]); 
    } 
}

// TODO Auto-generated method stub
	


public static void mergeSort(String[] array) {
	if (array.length >= 2) {
		
        String[] left = new String[array.length / 2];
        String[] right = new String[array.length - array.length / 2];

        for (int i = 0; i < left.length; i++) {
            left[i] = array[i];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = array[i + array.length / 2];
        }
        mergeSort(left);
        mergeSort(right);
        merge(array, left, right);
    }
}
public static void merge(String[] array, String[] left, String[] right) {
    int a = 0;
    int b = 0;
    for (int i = 0; i < array.length; i++) {
        if (b >= right.length || (a < left.length && left[a].compareToIgnoreCase(right[b]) < 0)) {
            array[i] = left[a];
            a++;
        } else {
            array[i] = right[b];
            b++;
        }
    }
}
      



 public static <T extends Comparable<T>> T maximum(T[] array, T key) {
     // assume x is initially the largest
int arrLength=array.length;
int first = 0;
int last = arrLength - 1;
int middle = (first + last)/2;


        while( first <= last )
        {
            if (array[middle].compareTo(key)>0)
                first = middle + 1;                        
            else if ( array[middle] == key )
            {
                System.out.println(key + " found at location " + middle);
                break;
            }
            else
                last = middle - 1;

            middle = (first + last)/2;
        }
        if (first > last)
            System.out.println(key + " isn't present in the list.\n");
        return key;
    }

 
 /*
Function to convert decimal to binary//
	/**
	 * @param d
	 * @return
	 */
	public static int[] toBinary(int d)
	{
		String bin = "";
		while (d != 0)
		{
			bin = (d % 2) + bin;
			d /= 2;
		}
		
		while (bin.length() % 4 != 0) 
		{
			bin = 0 + bin;
		}
		return stringToIntArray(bin);

	}

	// Function to convert string to int array helper function for swapnibble in//

	/**
	 * @param bin
	 * @return
	 */
	 static int[] stringToIntArray(String bin)
	{
		int[] binary = new int[bin.length()];
		for (int i = 0; i < binary.length; i++)
		{
			binary[i] = bin.charAt(i) - 48;
		}
		return binary;
	}

	// Function to convert binary to decimal//
	/**
	 * @param binary
	 * @return
	 */
	public static int toDecimal(int[] binary)
	{
		int dec = 0, j = 0;
		for (int i = binary.length - 1; i >= 0; i--) 
		{
			if (binary[i] == 1)
			{
				dec = dec + (int) Math.pow(2, j);
			}
			j++;
		}
		return dec;

	}
	// Function to convert string to int array helper function for swapnibble in//


	public static String[] binString(String[] array, String key)
	{
		int arrLength = array.length;
		int first = 0;
		int last = arrLength - 1;
		int middle = (first + last)/2;
		
		while(first<=last)
		{
			if(array[middle].compareTo(key)<0)
				first = middle + 1;
		
		else if(array[middle].equals(key))
		{
			System.out.println(key + "Found at location" + middle);
			break;
		}
		else
			last = middle - 1;
		middle = (first + last)/2;
		}
		if(first>last)
			System.out.println(key + "It is not present in the list\n");
		return array;
		}

	
	public static void bubbleList(List<Integer> nos, int n) {
		int i, temp;

		for (i = 0; i < nos.size() - 1; i++) {
			for (int j = 0; j < nos.size() - i - 1; j++) {

				if (nos.get(j) > nos.get(j + 1)) {
					temp = nos.get(j);
					nos.set(j, nos.get(j + 1));
					nos.set(j + 1, temp);

					
				}
			}
		}
		for (int k:nos) {
			System.out.print(k+ " ");
		}
	
	}
	
	
	
	public static void insertionSortList(List <String> array,int n) {

		int i = 0, j = 0, w;
		String temp;
		for (i = 0; i < array.size(); i++) {
			for (j = 0; j <= i; j++) {
				if (array.get(j).compareTo(array.get(i))>0)
				{
					temp = array.get(j);
					array.set(j, array.get(i));
					for (w = i; w > j + 1; w--)
						array.set(w, array.get(w-1));
					array.set(w, temp);
				}
			}
		}

		for (String k:array)
			System.out.print(k + " ");
		System.out.println(" ");
	}
	
	
	public static <T extends Comparable<T>> void binary(T[] array, T key){
		int length=array.length;
		int first=0;
		int last=length-1;
		int middle=(first+last)/2;
		while(first<=last)
		{
			if(key.compareTo(array[middle])>0)
		     {
		       first=middle+1;
	          }
			
		else if(array[middle].equals(key))
		{
			System.out.println(key+"-found at location-"+middle);
			break;
		}
		else
		{
			last=middle-1;
		}
			middle=(first+last) /2;
	}
	if(first>last)
		System.out.println("key not found");
	}
	
	
	public static <T extends Comparable<T>> void insertionSort(T[] array) {
		int i = 0, j = 0, w;
		for (i = 0; i < array.length; i++) {
			for (j = 0; j <= i; j++) {
				if (array[j].compareTo(array[i])>0) {
					T temp = array[j];
					array[j] = array[i];
					for (w = i; w > j + 1; w--)
						array[w] = array[w - 1];
					array[w] = temp;
				}
			}
		}
		for (T kl : array)
			System.out.println(kl + " ");
		System.out.println(" ");
	}
	
	public static <T extends Comparable<T>> T[] bubble(T[] array){
		for (int j = 0; j < array.length; j++) {
	         for (int i = j + 1; i < array.length; i++) {
	            // comparing strings
	            if (array[i].compareTo(array[j]) < 0) {
	         
	               T temp = array[j];
	               array[j] = array[i];
	               array[i] = temp;
	            }
           
	}
		} for(int k=0;k<array.length;k++) {
        	System.out.println(array[k]);
        }
		return array;
	
	}
	

/*PalindromePrimeAnagram*/
	
	public static void prime() {
		String primeNumbers = "";
		for (int i = 0; i <= 1000; i++) {
			int counter = 0;
			for (int j = i; j >= 1; j--) {
				if (i % j == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				primeNumbers = primeNumbers + i + " ";
			}
		}

		
		
		System.out.println(primeNumbers);
		
	}

public static void primePallindrome() {
		 System.out.println();
		boolean b;
		for (int j = 2; j <= 1000; j++) {
			b = true;
			for (int i = 2; i < j / 2; i++) {
				if (j % i == 0) {
					b = false;
					break;
				}
			}
			if (b && isPallindrome(j))
				System.out.print(j + " ");
		}
	}
	private static boolean isPallindrome(int n) {
		for (int i = 2; i < n / 2; i++) {
			if (i % n == 0) {
				return false;
			}
		}
		return true;
	}
	public static void primeAnagrams() {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		System.out.println();
		boolean b;
		for (int j = 2; j <= 1000; j++) {
			b = true;
			for (int i = 2; i < j / 2; i++) {
				if (j % i == 0) {
					b = false;
					break;
				}
			}
			if (b)
				ar.add(j);
		}
		for (int i = 0; i < ar.size(); i++) {
			for (int j = i + 1; j < ar.size(); j++) {
				if (anagram(ar.get(i), ar.get(j))) {
					System.out.println(ar.get(i) + "  " + ar.get(j));
				}
			}
		}
		
		
		
	}
	private static boolean anagram(Integer n1,Integer n2){
		int[] n1count = count(n1);
		int[] n2count = count(n2);
		for (int i = 0; i < n2count.length; i++) {
			if (n1count[i] != n2count[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static int[] count(int n) {
		int[] count = new int[10];
		int temp = n;
		while (temp != 0) {
			int r = temp % 10;
			count[r]++;
			temp = temp / 10;
		}
		return count;
	}
	

	}
