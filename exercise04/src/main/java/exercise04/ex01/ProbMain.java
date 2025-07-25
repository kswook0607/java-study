package exercise04.ex01;

import java.util.Scanner;

public class ProbMain {
	public static void main(String[] args) {
		Employee partTime = new PartTimeEmployee();
     	Employee fullTime = new FullTime();

		System.out.println("파트타임 급여: " + partTime.getSalary());
		System.out.println("풀타임 급여: " + fullTime.getSalary());
	}
}