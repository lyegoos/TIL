
public class Ex6_3 {

	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width);	// cv는 객체 생성을 하지 않아도 사용 가능하다!
		System.out.println("Card.height = " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
		c1.width = 50;	// 참조변수로 다뤘지만 cv를 조작하는 것이기 때문에 Card.width로 표기하는 것이 정확하다.
		c1.height = 80;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
	}

}

class Card{
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}
