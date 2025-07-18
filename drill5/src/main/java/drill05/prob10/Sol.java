package drill05.prob10;

import java.util.Arrays;
import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[5];
		
		/* 코드 작성 */
		
		for(int i = 0; i < numbers.length; i++) {
			
			numbers[i] = scanner.nextInt();
			
		}
		
		for(int j = 0 ; j < numbers.length/2 ; j++ ) {
			
			int swap = numbers[j];
			numbers[j] = numbers[numbers.length - 1 - j];
			numbers[numbers.length - 1 - j] = swap;
						
		}
				
		System.out.println("뒤집힌 배열: " + Arrays.toString(numbers));
		scanner.close();		
	}

}
