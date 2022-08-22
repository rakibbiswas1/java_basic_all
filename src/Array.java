// non-primitive data type.
// 1st method      //array elements using 1st way
public class Array {
	
	public static void main(String[] args) {
		int[]array = new int[5];  // (5 is size) // it can store or use only same or fixed element(string,int,char etc....)
		
 // array index position always start from "0" and can't store more than (here 5)
		array[0] = 10; //array 0 1 ..is position.
		array[1] = 20; // 10 20 ... is size/element
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		
		System.out.println(array[3]); // if we know array position use this (only print given array position number)
		
		System.out.println("==================");
		
//array elements using 1st way		
		for(int i = 0; i < array.length; i++) { // if don't know then use this
			System.out.println(array[i]);
		}
		
		System.out.println("=================="); 
		
// array using second way
		// starting = 0 posi & 1st ele..
		int arr[] = {15,25,35,45};    // there is three position and four elements(if we use array then this line show red,bcz of same element)
		System.out.println(arr.length); // if u need calculate length
		
		for(int index = 0; index < arr.length; index++) {   // or use i & a // lenghth store position (++ means increase 1 everytime in position)
			System.out.println(arr[index]);
		}
		
		System.out.println("==================");
		
// array using 3rd way	//but 1st method
		
				char[] ch = {'A','B','C','D'};
				
				for (char c : ch) {   // or use this [    for (char c = 0; c < ch.length; c++) {    ]
					System.out.println(c);  // or use this printlm(ch[c]0);
				}
				
		System.out.println("==================");
		
// array using 4th way
// second method  [for each loop method]          [it's look diffrent but it same as for loop] (it only can use for array n collection)
// [ int arr[] = {15,25,35,45}; ]  we use this value
		for(int i : arr) {
			System.out.println(i);
		}
		
		System.out.println("==================");
	

	}
}
