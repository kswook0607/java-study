package chapter04.object;

public class Goods {
	
		public String name; //모든 접근이 가능
		protected int price; // 같은 패키기 + 자식 클래스
		int countStock; //같은 패키지 (디폴트)
		private int countSold; //클래스 내부에서만 접근 가능
		
		public Goods() {
		}
		
		public Goods(String name, int price, int countStock, int countSold) {
			this.name = name;
			this.price = price;
			this.countStock = countStock;
			this.countSold = countSold;
			
		}
		
		public void sell(int quantity) {
			if(countStock >= quantity) {
				countStock -= quantity;
				countSold += quantity;
			}
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

		

