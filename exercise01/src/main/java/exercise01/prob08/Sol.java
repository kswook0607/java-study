package exercise01.prob08;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		final int[] MONEYS = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};

		/* 코드 작성 */
		
		System.out.print("입력: ");
		
		int n = scanner.nextInt();
		
		for(int i : MONEYS) {
			
			int c = n / i;
			if(c > 0) {
				System.out.println(i + "원" + c + "개");
				
			}
			n = n % i;			
			
		}
		
		
		
		
		
		scanner.close();
	}

}
