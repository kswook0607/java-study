package exercise02.prob03;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수[1 - ]: ");

		/* 코드 작성 */
		
		
		int num = scanner.nextInt();
		int sum = 0;
		
		
		if(num % 2 == 0) {
			for(int i = 2; i <= num; i+=2) {
				sum += i;
			}
			
		}else {
			for(int i = 1; i <= num; i +=2) {
				sum += i;
			}
		}
		System.out.println("결과 값: " + sum);

		scanner.close();
	}

}
