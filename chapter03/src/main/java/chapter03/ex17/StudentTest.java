package chapter03.ex17;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();
		s1.setName("둘리");
		s1.setSchool("Java school");
		
		
		Person p1 = s1;						//Upcasting (암시적, Implicity)
		System.out.println(p1.getName());
		
		Person p2 = (Person) new Student(); //upcasting, 다형성
		p2.setName("마이콜");
		
//		Student s2 = (Student)p2;					//Downcasting (명시해야됨, Explicity)		
//		s2.setSchool("Java school")					//또는
													
		((Student)p2).setSchool("Java school");      //Downcasting (명시해야됨, Explicity)
	}

}
