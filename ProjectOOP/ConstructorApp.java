class Cal4{
	int v1, v2;
	Cal4(int v1, int v2){
		System.out.println("Cal init");
		this.v1 = v1;
		this.v2 = v2;
	}
}
class Cal5 extends Cal4{ // 상속해준 부모 클래스에 생성자가 존재한다면 자식 클래스는 반드시 부모 생성자를 실행시켜야 한다.

	Cal5(int v1, int v2) {	// 부모 클래스의 생성자를 실행
		super(v1, v2);
		System.out.println("Cal3 init");
	}	
	// 생성자가 있는 클래스를 상속받았다면 생성자를 만들어서 부모클래스를 반드시 호출해야한다! 
}
public class ConstructorApp {

	public static void main(String[] args) {

		Cal4 c4 = new Cal4(2, 1);
		Cal5 c5 = new Cal5(2, 1);
		/* 실행결과
		 *  Cal init
			Cal init
			Cal3 init
			처음엔 Cal4의 생성자가 호출된 다음, Cal5의 생성자가 호출되는데 Cal5의 생성자에서는
			super로 부모의 생성자를 호출하기 때문에 Cal init이 한 번 더 출려되었다.
		 * 
		 */
	}

}
