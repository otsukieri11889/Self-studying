package code;

import java.util.Scanner;

public class study {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("名前を入力してください。");
		
		 String name = scanner.nextLine();
		
		System.out.println("こんにちは" + name);
		
		scanner.close();
	}

}
