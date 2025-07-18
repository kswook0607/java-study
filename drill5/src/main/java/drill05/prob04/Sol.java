package drill05.prob04;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		/* 코드 작성 */
		
		
		int[] average = new int[4];
		int sum = 0;
		
		for(int i = 0; i < average.length; i++) {
			
			average[i] = scanner.nextInt();
			sum += average[i];
				
		}
		
		System.out.println("평균: " + sum/average.length);
		
		scanner.close();
	}

}