package code;

public class Kakezan {

	public static void main(String[] args) {
	// 「kuku」メソッドを呼び出す
		Kakezan instance = new Kakezan();
		instance.kuku();
		
	}
		
    private  void kuku() {
	for(int i =1; i<=9; i++) {
		for(int j=1; j<=9; j++) {
			System.out.print( " " + i * j  );
	}
		// 改行
        System.out.println();
        
	}
  }
}


