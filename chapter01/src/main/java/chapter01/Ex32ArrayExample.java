package chapter01;

public class Ex32ArrayExample {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// 순회1: 일반 for 문
		
		int[] arr = new int[] {10, 20, 30};
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i] + " ");
			
		}

		System.out.println("\n=====================");

		
		// 순회2: 향상된 for문(for - each)
		for(int a : arr){
			
			System.out.println(a + " ");			

		}
	}

}
