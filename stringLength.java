package code;

import java.util.Scanner;

public class stringLength {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("好きな言葉を入力してください。");
    String text =scanner.nextLine();
    
    int length =text.length();
    
    System.out.print("文字数は" + length + "文字です");
    
    scanner.close();
    
	}

}
