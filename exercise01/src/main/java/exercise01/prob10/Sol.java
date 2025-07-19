package exercise01.prob10;

import java.util.Arrays;

public class Sol {

	public static void main(String[] args) {
		int data[] = {5, 9, 3, 8, 60, 20, 1};
		int count = data.length;

		System.out.println("Before: " + Arrays.toString(data));

		//
		// 정렬 알고리즘이 적용된 코드를 여기에 작성합니다.
		//
		
		for (int i = 0; i < count - 1; i++) {
			for(int j = 0; j < count - 1 - i; j++) {
				if(data[j] < data[j+1]) {
					int dum = data[j];
					
					data[j] = data[j+1];
					
					data[j+1] = dum;
										
				}
			}

		}
		System.out.println("After: " + Arrays.toString(data));
		
				
	}	
}
