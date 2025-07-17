package chapter01;

public class Ex21PowerOfTwo {

	public static void main(String[] args) {
	
		int result = 1;
		int i = 0;
		
		for(i = 0; i < 10; i++) {

			result = result * 2;
			i++;
		}
		System.out.println("2의 10승 값은" + result);
	}
}
