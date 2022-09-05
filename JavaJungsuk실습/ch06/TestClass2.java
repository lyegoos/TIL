
public class TestClass2 {
	
	int iv = 1;		// 인스턴스 변수
	static int cv = 2;		// 클래스 변수
	
	void instanceMethod() {
		System.out.println(iv);
		System.out.println(cv);
	}
	
	static void staticMethod() {	// 객체 생성없이 호출가능한 static 메서드
//		System.out.println(iv);	 // 클래스 메서드는 iv를 사용할 수 없기 떄문에 에러 발생! (iv는 객체 생성 후에만 호출가능하기 때문에 모순되기 때문)
		System.out.println(cv);
	}
	
	public static void main(String[] args) {
		TestClass2 t = new TestClass2();
		
		t.instanceMethod();		// 인스턴스 메서드는 객체 생성 후 참조변수를 통해 메서드를 사용하므로 iv, cv를 둘 다 사용가능하다.
		TestClass2.staticMethod();

	}

}
