package drill05.prob08;

import java.util.Arrays;
import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		/* 코드 작성 */
		
		int[] numbers = new int[6];
		
		for(int i = 0; i < numbers.length; i++) {
			
			numbers[i] = scanner.nextInt();					
			
		}
		
		for(int i = 0; i < numbers.length; i++) {
			
			if(numbers[i] == -1) {
				continue;
			}
			
			for(int j = i+1; j < numbers.length; j++) {
				
				if(numbers[i] == numbers[j]) {
					numbers[j] = -1;
					
				}
			}
			
		}
		System.out.print("중복 제거 후:" + " ");
		for(int i = 0; i < numbers.length;i++ ) {
			
			if(numbers[i] != -1) {
				
				System.out.print(numbers[i] + " ");
			}
			
		}		scanner.close();
		
	}
	
		
}

