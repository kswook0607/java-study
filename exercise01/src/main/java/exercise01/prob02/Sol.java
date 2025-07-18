package exercise01.prob02;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		int n = scanner.nextInt();
		
		for(int i = 0; i < n; i ++) {
			
			char txt = (char)('A' + i);
						
			System.out.print(txt + " ");
		}
		
		
		
		
		
		
		scanner.close();
	}

}
