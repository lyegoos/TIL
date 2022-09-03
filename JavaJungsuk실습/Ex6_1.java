
public class Ex6_1 {

	public static void main(String[] args) {
		Tv t;
		t = new Tv();	// Tv t = new Tv(); 한 문장으로 가능!
		t.channel = 7;	// 참조변수 t와 연결된 객체의 멤버변수 channel의 값을 7로 변경!
		t.channelDown();	// t와 연결된 객체의 channelDown() 메서드 호출. channel 변수를 1 감소시키는 동작을 한다
		System.out.println("현재 채널은 " + t.channel + " 입니다.");	// t가 가리키는 객체의 채널은 6이므로 6이 출력된다.
	}
}


class Tv{
	// Tv 클래스의 멤버변수(속성)
	String color;
	boolean power;
	int channel;
	
	// Tv 클래스의 메서드(기능)
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { -- channel; }
}
