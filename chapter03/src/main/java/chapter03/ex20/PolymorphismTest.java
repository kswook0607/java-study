package chapter03.ex20;

public class PolymorphismTest {

	static interface Soundable{
		void sound();
	}
	static abstract class implements Soundable Animal {
		private String species;
		
		public void sound()	{
			System.out.println("구현불능");			
		}
		
	}
	
//	public void m() {
//		new Animal();
//	}
	

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
	
	static class AlarmBell implements Soundable{

		@Override
		public void sound() {
			
		}
		
		
	}
		public static void main(String[] args) {
			Animal a1 = new Dog();
			Animal a2 = new Dog();
			
			a1.getSpecies ();
			a1.
			a2.sound();
			
//			Animal a3 = new AlarmBell(); 객체지향 설계 위반인 "is-a 관계의 오용" 또는 "불필요한 상속”
//			a3.sound();
			
			Soundable soundable = new AlarmBell();
			soundable.sound();
			
		}
	
	



}
