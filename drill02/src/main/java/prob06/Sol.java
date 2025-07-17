package drill02.prob06;

/**
 * 
 * 문제 6: 변수 타입 오류 찾기
 * 
 * 문제: 오류 발생 줄에 그 이유를 주석으로 달고 바르게 고쳐 컴파일 및 실행하기
 * 
 */
public class Sol {

	public static void main(String[] args) {
		// int count = "three"; 정수가 아님
		int count = 3;
		// boolean isOn = 1; TF 가 아님
		boolean isOn = true;
		// char c = "A";  char 가 아님, 작은 따옴표
		char c = 'A';
		// float f = 3.14; 뒤에 f가 붙거나 double 로 선언
		float f = 3.14f;
		
		String name = "Alice";
		
		System.out.println(count);
		System.out.println(isOn);
		System.out.println(c);
		System.out.println(f);
		System.out.println(name);		
	}

}
