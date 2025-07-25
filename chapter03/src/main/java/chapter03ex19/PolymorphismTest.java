package chapter03ex19;

public class PolymorphismTest {
	static abstract class Animal {
		
		
		private String species;
		
			
		public String getSpecies() {
			return species;
		}

		public void setSpecies(String species) {
			this.species = species;
		}

		public void sound()	{
		
	}
	
//	public void m() {
//		new Animal();
//	}
	
	static class Dog extends Animal{
		public void sound()	{
			System.out.println("멍멍");
		}
		
	}
	static class Sparraw extends Animal{

		@Override
		public void sound() {
			System.out.println("짹짹");
		}		
		
	}
	
		public static void main(String[] args) {
			Animal a1 = new Dog();
			Animal a2 = new Dog();
			
			a1.sound();
			a2.sound();
		}
	}
}
	
