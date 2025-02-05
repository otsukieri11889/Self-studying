package code;

public class MyArray1 {
 public static void main(String[] args) {
	int []myArray =new int[5];
	
	for(int i =0; i < myArray.length; i++) {
		myArray[i] =0;
	}
	
	for(int i =0; i <myArray.length; i++) {
		System.out.println("myArray[" + i + "] = " + myArray[i]);
	}
  }
}
