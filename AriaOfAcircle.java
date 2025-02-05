package code;

import java.util.Scanner;

public class AriaOfAcircle {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		Double pi =3.14159;
		
		System.out.print("半径を入力してください。");
		Double radius = scanner.nextDouble();
		
		Double  area = pi * radius * radius;
		
		System.out.print("円の面積は" + area+ "㎡");
		
		scanner.close();
		
	}
	

}
