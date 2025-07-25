package chapter03.exception;

public class DangerousClassTest {

	public static void main(String[] args) {
		
		try {
		DangerousClass dc = new DangerousClass();
		
		dc.danger();
		
		}
	}

}
