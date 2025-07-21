package chapter03.ex03;

public class Goods {
		
		public static int countOfGoods;
				
		private String name; //모든 접근이 가능
		private int price; // 같은 패키기 + 자식 클래스
		private int countStock; //같은 패키지 (디폴트)
		private int countSold; //클래스 내부에서만 접근 가능
		
		public Goods() {
			//ㅋ클래스 내부에서는 클래스 이름 생략이 가능
			//Goods.countofGoods++;
			countOfGoods++;
			
			System.out.println(Math.PI);
						
		}
		
		}

		

