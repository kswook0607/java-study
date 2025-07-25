package Chapter03ex15;

import chapter03ex14.Goods;

public class DiscoutGoods extends Goods {
	
			public int calcDiscountPrice(float rate) {
//			return (int)(getPrice() * rate);
			return (int)(price * rate);
		}
		
	}
