
public class StringApp {

	public static void main(String[] args) {
		System.out.println("Hello World");	// String 큰 따옴표
		System.out.println('A');	// Character 작은 따옴표
		System.out.println("H");	// String인 한 글자
		
		System.out.println("Hello "
				+ "World");	// 줄바꿈 실패
		// new line
		System.out.println("Hello \nWorld");	// \n
		// escape
		System.out.println("Hello \"World\"");	// Hello "World"

	}

}
