package chapter03.exception;

import java.io.IOException;

public class DangerousClass {
	
	public void danger() throws IOException {
		
		int val = 10;
		
		System.out.println("some code1");
		
		if(val/2 > 0 ) {
			throw new IOException();
		}
		System.out.println("somne code2");
		
	}
	

}
