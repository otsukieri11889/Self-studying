package code;

public class EvenNumbers {

	public static void main(String[] args) {
		int[] evenNumbers =new int[51];

		int even = 0; // 最初の偶数
        for (int i = 0; i < 51; i++) {
        	evenNumbers[i] = even;
            even += 2; // 次の偶数を計算
        }

        // 4. 配列の内容を表示（オプション）
        System.out.println("0から100までの偶数:");
        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.println("oevenNumbers[" + i + "] = " + evenNumbers[i]);
        }
    }
}
