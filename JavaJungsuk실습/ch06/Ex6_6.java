class Data { int x; }

public class Ex6_6 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);	// 10이 출력됨
		
		change(d.x);	// 참조변수 d에 연결된 객체의 변수 x(10)를 change 메서드의 매개변수로 넘겨준다.
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);	// change 메서드에서 x를 1000으로 변경했지만 메서드 내의 x가 바뀐것이고 d 객체 내의 x가 바뀐게 아니라서 10이 출력된다.

	}
	static void change(int x) {
		x = 1000;	// 매개변수로 10이 들어왔지만 x를 1000으로 변경
		System.out.println("change() : x = " + x);	// 1000으로 변경했으므로 1000이 출력됨
	}
}
