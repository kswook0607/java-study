package drill06.prob02;

import java.util.Scanner;

import drill06.prob02.ProbMain.Book;

public class ProbMainApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Book book = new Book();
		
		System.out.print("제목: ");
		String title = scanner.next();
		book.setTitle(title);
		
		System.out.print("가격: ");
		int price = scanner.nextInt();
		book.setPrice(price);
		
		scanner.close();

		System.out.println("Book[title=" + book.getTitle() + ", price=" + book.getPrice() + "]");
	}
}
