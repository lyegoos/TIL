class Print{
	public String delimiter;
	public void b() {	//인스턴스의 메서드이므로 static을 빼줘야 t1.b() 이런 식으로 사용가능
		System.out.println(this.delimiter);
		System.out.println("b");
		System.out.println("b");
		
	}
	public void a() {
		System.out.println(this.delimiter);
		System.out.println("a");
		System.out.println("a");
		
	}
	
	public static void c(String delimiter) {
		System.out.println(delimiter);
		System.out.println("c");
		System.out.println("c");
		
	}
}

public class staticMethod {	
	public static void main(String[] args) {
//		Print.a("-");	// 클래스인 Print에 소속되어 a메서드가 실행됨
//		Print.b("-");
		
		Print t1 = new Print();
		t1.delimiter = "-";
		t1.a();	// t1이라는 인스턴스의 소속으로 a메서드가 실행됨! 메서드가 인스턴스 소속일 때는 메서드에서 static을 빼줘야된다.
		t1.b();
		
		Print.c("$");	// 클래스의 메서드는 static이 필요하다.
//		Print.a("*");
//		Print.b("*");
		
		Print t2 = new Print();
		t2.delimiter = "*";
		t2.a();
		t2.b();

	}


}
