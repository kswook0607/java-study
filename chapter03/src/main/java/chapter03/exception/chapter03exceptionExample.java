package chapter03.exception;

public class chapter03exceptionExample {

	public static void main(String[] args) {
		
		
		int a = 10;
		int b = a - 10;
		
		System.out.println("some code 1...");
		
		try {
			System.out.println("some code 2...");
			
			int result = (1 + 2 + 3) / b;
			
			System.out.println("some code 3...");
		
		}catch (ArithmeticException e) {
			
//			System.out.println("some code 4...");  //캐치문에 아무것도 없으면 안됨, 위험
			
			e.printStackTrace(); 

			/*예외처리*/
			//1. 사용자에게 사과
			System.out.println("쏘리");
					
			//2. 복구는 불가능 하지만 고칠수 있음 - 로그 남기기
			//System.out.println("error:" + e);
			e.printStackTrace();
						
			//3. 정상 종료
//			System.exit(0);
			return;				
		}finally {
			//자원정리: close file, socket, db connection
			System.out.println("some code 5...");
		}
		System.out.println("some code 6...");
	}

}
