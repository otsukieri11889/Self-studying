package code;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
	/* 3の倍数の時に「Fizz」、5の倍数の時に「Buzz」
	 * 、3と5の両方で割り切れる場合に「FizzBuzz」と出力する。*/
		
		Scanner scanner = new Scanner(System.in);
		
		 System.out.println("１以上の整数を入力してください。");
		  int number = scanner.nextInt();
		 
		   if(number % 3== 0 && number % 5== 0) {
			   System.out.println(number + "はFizzBuzzです。");
			    
		   }else if(number % 3== 0) {
			   System.out.println(number + "はFizzです。");
			   
		   }else if(number % 5== 0){
			   System.out.println(number + "はBuzzです。");
		   
		   }else
			   System.out.println(number + "はFizzBuzzではありません。");
		  
		  
		scanner.close();
		
		
	}

}
