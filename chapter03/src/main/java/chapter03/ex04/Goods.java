package chapter03.ex04;

public class Goods {
		public static int countOfGoods;
				
		private String name; //모든 접근이 가능
		private int price; 
		private int countStock; //같은 패키지 (디폴트)
		private int countSold; //클래스 내부에서만 접근 가능
		
		
		public static int getCountOfGoods() {
			return countOfGoods;
						
		}
		
		public int calcDiscoutPrice(float percentage) {
			
			return price - (int)(price * percentage);
		}
		
		public void showInfo(){
			
			System.out.println(
				"상품이름:" + name + 
				", 가격: " + price + 
				", 재고량: " + countStock + 
				"판매량: " + countSold);
			}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public int getCountStock() {
			return countStock;
		}

		public void setCountStock(int countStock) {
			this.countStock = countStock;
		}

		public int getCountSold() {
			return countSold;
		}

		public void setCountSold(int countSold) {
			this.countSold = countSold;
		}
		
		
		
		}

		

