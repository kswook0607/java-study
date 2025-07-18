package exercise01.prob05;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수[1-]: ");
		
		int a = scanner.nextInt();
		int sum = 0;
		
		while(a > 0) {
			
			sum = sum + (a % 10);
			a = a/10;		
			
		}
		
		System.out.println("자리수 합: " + sum);		
		
		scanner.close();
	}

}
