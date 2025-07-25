package chapter03.ex18;

public class PolymorphismTest {
	class Animal {
		private String species;
		
		public void sound()	{
			System.out.println("구현불능");			
		}
		
	}
	
//	public void m() {
//		new Animal();
//	}
	
annotation
	static class Dog extends Animal{
		public void sound()	{
			System.out.println("짹짹");
		}
		
	}
	static class Sparraw extends Animal{		
		@override
		public void sound()	{
			System.out.println("짹짹");
		}	
	}
	
		public static void main(String[] args) {
			Animal a1 = new Dog();
			Animal a2 = new Dog();
			
			a1.sound();
		}
	
	



}
