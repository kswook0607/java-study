package chapter04.object;

public class ObjectMethodExample01 {

	public static void main(String[] args) {
		
		Goods goods = new Goods();
		
		Class klass = goods.getClass(); //reflection
		System.out.println(klass.getName()); 
		
		System.out.println(goods.hashCode()); // 
				
		System.out.println(goods.toString()); // getClass().getName() + "@" + hashCode()
		System.out.println(goods);			  // 위아래 두줄은 같음
		
	}

}
