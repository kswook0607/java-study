package drill05.prob06;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
	
		
		Scanner scanner = new Scanner(System.in);

		int[] numbers = new int[5];
		
		
		for(int i=0; i < numbers.length; i++) {
			
			numbers[i] = scanner.nextInt();
						
		}
		
		int min = numbers[0];
		
		for(int n : numbers) {
			
			if(n < min) {
				min = n;
			}
			
						
		}
		System.out.println("int의 최소값: " + min);
				
		/* 코드 작성 */
		
		
		scanner.close();
	}

}
