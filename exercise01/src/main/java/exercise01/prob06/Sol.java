package exercise01.prob06;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("정수[2-]: ");
		int a = scanner.nextInt();
		int sum = 0;
			
		for(int i=1; i < a; i++ ) {
			
			if(a % i==0) {
				sum += i;
			}
				
		}
		if(sum == a) {
			System.out.println(a + "는(은) 완전수 입니다.");
		
		}else;
	
		scanner.close();
	}

}
