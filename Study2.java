package code;

import java.util.Scanner;

public class Study2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("整数1を入力してください: ");
        int value1 = scanner.nextInt();
        
        System.out.print("整数2を入力してください: ");
        int value2 = scanner.nextInt();
        
        // 正しい和の計算を行う
        int sum = value1 + value2;
        
        System.out.println("合計は: " + sum);
        
        // Scannerを閉じてリソースを解放する
        scanner.close();
    }
}