package drill03.prob04;

/**
 * 
 * 문제 4. 세 수 중 최댓값 구하기
 * 
 * 변수 x, y, z 중 가장 큰 값을 출력하세요.
 * 
 * 
 */

public class Sol {

	public static void main(String[] args) {
		int x = 5, y = 7, z = 18;
		
		if(x > y && x > z) {
			System.out.println("x");
		}else if(x < y && y > z) {
			System.out.println("y");	
		}else {
			System.out.println("z");
		}
		
		
		
		// 조건문을 활용해 최댓값 출력
	}

}
