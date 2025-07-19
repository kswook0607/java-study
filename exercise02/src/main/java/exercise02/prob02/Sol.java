package exercise02.prob02;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[10];
	
		System.out.print("입력: ");

		for(int i = 0; i < numbers.length; i++) {
			
			numbers[i]= scanner.nextInt();
		}
		
		int max = numbers[0];
		int min = numbers[0];
		
		for(int i = 1; i < numbers.length; i++ ) {
			
			if(numbers[i] > max) {
				
				max = numbers[i];				
				
			}
			
			if(numbers[i] < min ) {
				
				min = numbers[i];
			}
		}
				
		int sub = max - min;
		
		System.out.println("최대-최소 차이: " + sub);
		
		
		
		/* 코드 작성 */

		scanner.close();		
	}

}
