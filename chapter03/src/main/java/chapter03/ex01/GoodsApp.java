package chapter03.ex01;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Goods camera = new Goods();
		camera.name = "nikon";
		camera.price = 400000;
		camera.countSold = 20;
		camera.countStock = 20;
		
		System.out.println(camera.name);
		System.out.println(camera.price);
		System.out.println(camera.countSold);
		System.out.println(camera.countStock);
	}

}
