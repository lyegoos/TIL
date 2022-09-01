import java.io.IOException;



public class MyOOP {
		public static String delimiter = "";
	public static void main(String[] args) throws IOException {
		delimiter = "----";	// main 메서드 안에 delimiter라는 변수가 없기 때문에 클래스에 소속된 delimiter가 된다. 그 값을 바꿔준것
		
		printA();
		printA();
		printB();
		printB();
		
		delimiter = "****";
		
		printA();
		printA();
		printB();
		printB();
	}

	public static void printA() {
		System.out.println(delimiter);	//printA에 변수가 없으므로 클래스에 속한 변수를 가져온다.
		System.out.println("A");
		System.out.println("A");
	}
	
	public static void printB() {
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	}
	
}
