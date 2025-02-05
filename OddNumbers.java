package code;

public class OddNumbers {

	public static void main(String[] args) {
		int[] oddNumbers = new int[5];
		
		int odd = 1; // 最初の奇数
        for (int i = 0; i < 5; i++) {
            oddNumbers[i] = odd;
            odd += 2; // 次の奇数を計算
        }

        // 4. 配列の内容を表示（オプション）
        System.out.println("1から10までの奇数:");
        for (int i = 0; i < oddNumbers.length; i++) {
            System.out.println("oddNumbers[" + i + "] = " + oddNumbers[i]);
        }
    }
}
