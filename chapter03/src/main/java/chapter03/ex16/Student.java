package chapter03.ex16;

public class Student extends Person{
	
	public Student() {
//		자식 생성장에서 부모생성자를 명시하지 않으면
//		컴파일러가 부모의 기본 생성자를 넣어서 컴파일한다.
		
//		super();
		
		System.out.println("Student() called");
		
	}
	
}
