import java.io.IOException;

public class MyOOP2{
		
	public static void main(String[] args) throws IOException {
//		Print.delimiter = "----";	// main 메서드 안에 delimiter라는 변수가 없기 때문에 클래스에 소속된 delimiter가 된다
		
		Print p1 = new Print(); // Print 클래스로 p1 인스턴스를 생성
		p1.delimiter = "----";
		
		p1.A();
		p1.A();
		p1.B();
		p1.B();
		
		Print p2 = new Print(); // Print 클래스로 p2 인스턴스를 생성
		
		p2.delimiter = "****";
		p2.A();
		p2.A();
		p2.B();
		p2.B();
		
		p1.A();	// 클래스를 사용할 때처럼 delimiter를 계속해서 수정할 필요없이 원하는대로 인스턴스를 사용하면 된다.
		p2.A();
	}
}
