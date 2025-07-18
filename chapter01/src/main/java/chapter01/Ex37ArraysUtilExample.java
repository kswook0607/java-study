package chapter01;

import java.util.Arrays;

public class Ex37ArraysUtilExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {3, 1, 4};
		
		//String s = Arrays.toString(arr);
						
		System.out.println(Arrays.toString(arr));
		
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		int[] arr2 = Arrays.copyOf(arr, 2);
		System.out.println(Arrays.toString(arr2));
		
		//Arrays.equals(arr, arr2);
		int [] arr3 = new int[] {1, 3, 4};
		System.out.println(Arrays.equals(arr, arr3));
		
		
	}

}
