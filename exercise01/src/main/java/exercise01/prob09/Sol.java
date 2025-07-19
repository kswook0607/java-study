package exercise01.prob09;

public class Sol {

	public static void main(String[] args) {
		char text[] = { 'J', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n', ' ', 't', 'o', ' ', 'l', 'e', 'a', 'r', 'n' };
		
		int count = 0;
		
		for(int i =0; i< text.length; i++) {
			
			if(text[i] == ' ') {
				
				text[i] = '-';				
				count++;
			}
			
		}
		System.out.println("변환: " +new String(text));
		System.out.println("바뀐 공백 수 " + count);

		
		
		
		
		// 공백 문자 바꾸기

		// 수정된 배열 원소 및 개수 출력
		
	}

}
