package drill05.prob07;

import java.util.Arrays;
import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		/* 코드 작성 */
		
		int[] numbers = new int[5];
		
		System.out.print("배열:");
		
		for(int i = 0; i < numbers.length; i++) {
			
			numbers[i] = scanner.nextInt();			
		}
		
		System.out.print("찾을 값:");	
		int target = scanner.nextInt();
				
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] == target) {
				System.out.print(numbers[i] + "는 인덱스" + i + "에 있음");			
				
			}
			
		}
		
			
		
		scanner.close();
		
//		System.out.println(Arrays.toString(numbers));
//		System.out.println(target);
	}

}
