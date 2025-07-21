package chapte01.ex02.app;

public class Goods {

		
		public String name; //모든 접근이 가능
		protected int price; // 같은 패키기 + 자식 클래스
		int countStock; //같은 패키지 (디폴트)
		private int countSold; //클래스 내부에서만 접근 가능
		
		
		
		
		public void m() {
			
			countSold = 0;
			
						
		}
		
		}

		

