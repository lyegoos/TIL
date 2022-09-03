
public class Ex6_2 {

	public static void main(String[] args) {
		Tv t1 = new Tv();	
		Tv t2 = new Tv();	
		System.out.println("현재 채널은 " + t1.channel + " 입니다.");	// 객체를 만든 뒤 초기화를 안 했기 때문에 초기값은 0이다.
		System.out.println("현재 채널은 " + t2.channel + " 입니다.");	// 객체를 만든 뒤 초기화를 안 했기 때문에 초기값은 0이다.
		
		t1.channel = 7;		// t1이 가리키는 객체의 channel 변수 값을 7로 변경
		System.out.println("t1의 channel값을 7로 변경했습니다.");
		
		System.out.println("t1의 channel은 " + t1.channel + " 입니다.");	// 7이 출력
		System.out.println("t2의 channel은 " + t2.channel + " 입니다.");	// 0이 출력
	
		t2 = t1;	// t1이 가리키고 있는 객체의 주소를 t2에 넣음. t1, t2는 같은 객체를 가리키게 된다.
		
		System.out.println("t1의 channel은 " + t1.channel + " 입니다.");	// 7이 출력
		System.out.println("t2의 channel은 " + t2.channel + " 입니다.");	// 7이 출력
	}
}
