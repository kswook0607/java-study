package exercise01.prob04;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자: ");
		char c = scanner.next().charAt(0);
		
		if(c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
			
			System.out.println("알파벳 입니다. ");			
		}else;
		
				
		scanner.close();
	}

}
