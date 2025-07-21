package chapter03.ex02;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Goods camera = new Goods();
		camera.name = "nikon";
		//protected 는 같은 패키기 접근이 가능
		//더 중요한것은 자식에서 접근이 가능
		
		//camera.price = 400000;
		
		camera.countStock = 20;
		
//		camera.countSold = 20 // 
	}

}
