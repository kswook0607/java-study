package chapter03.ex11;

public class GoodsApp {

	public static void main(String[] args) {	
		

//		Goods camera = new Goods();
//		
//		camera.setName("nikon"); 
//		camera.setPrice(400000);				
//		camera.setCountSold(10);
//		camera.setCountStock(20);
//		
//		camera.showInfo();
//		camera.setPrice(-100000);
		

		Goods camera = new Goods("nikon", 400000, 10, 20);
		camera.showInfo();
		
		
//		camera.setPrice(400000);
//		System.out.println(camera.calcDiscountPrice(0.5f));
		
		
	}
}
