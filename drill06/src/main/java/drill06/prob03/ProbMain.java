package drill06.prob03;

import java.util.Scanner;

public class ProbMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		

		// 학생1
		System.out.print("학생1: ");
		String name1 = scanner.next();
		int score1 = scanner.nextInt();
		
		Student student1 = new Student();
		student1.setName(name1);
		student1.setScore(score1);
		
				
		// 학생2
		System.out.print("학생2: ");
		String name2 = scanner.next();
		int score2 = scanner.nextInt();
		
		Student student2 = new Student();
		student2.setName(name2);
		student2.setScore(score2);		
		
		if (student1.getScore() > student2.getScore()) {
            System.out.println(student1.getName() + "의 점수가 더 높습니다.");
        } else if (student1.getScore() < student2.getScore()) {
            System.out.println(student2.getName() + "의 점수가 더 높습니다.");
        } else {
            System.out.println("두 학생의 점수가 같습니다.");
        }
		
		scanner.close();
	}

}
