import java.util.*;
import java.lang.*;

public class DeckTest {

	public static void main(String[] args){
		Deck d = new Deck();	// Deck 클래스의 인스턴스 d를 만든다. 처음 생성시엔 순서대로 카드가 정렬되어 있다.
		Card c = d.pick(0);		// d 인스턴스에서 맨 처음 카드를 뽑는다. Card c = cardArr[0] 뽑은 카드 객체를 c 인스턴스에 넣는다
		System.out.println(c);	// 객체를 println 하므로 Card클래스의 toString 메서드가 호출되고 실행된다. 맨 처음 카드의 kind는 4, number는 1이므로 이에 맞게 출력됨

		d.shuffle();	// 카드를 섞는다. d 인스턴스에서 pick을 했지만 카드갯수는 줄어들지 않은 상태
		c = d.pick(0);	// 섞은 다음 제일 첫 번째 카드를 뽑아 c 인스턴스에 넣는다.
		System.out.println(c);	// 랜덤하게 정해진 첫 번째 카드의 객체를 출력하면 그 객체의 kind, number에 따라 값이 출력된다.
	}

}


class Deck{
	final int CARD_NUM = 52;		// 카드 총 갯수
	Card cardArr[] = new Card[CARD_NUM];	// Card 클래스의 배열 인스턴스 cardArr[]
	
	Deck() {
		int i = 0;
		
		for(int k=Card.KIND_MAX; k>0; k--)	// k는 4~1
			for(int n=0; n<Card.NUM_MAX; n++)	// n은 0~12
				cardArr[i++] = new Card(k, n+1);	// k는 Card 객체 생성시 kind, n+1은 number 매개변수로 쓰인다	
	}
	
	Card pick(int index) {	// 특정 인덱스에 있는 cardArr[index]는 타입이 Card 객체이므로 함수 앞에 Card
		return cardArr[index];
	}

	Card pick() {	// 만일 pick 함수의 인자가 없다면 0~51 사이의 랜덤값을 index로 Card pick(int index) 를 호출해서 cardArr[index]를 리턴값으로 받는다
		int index = (int)(Math.random() * CARD_NUM);
		return pick(index);
	}
	
	void shuffle() {
		for(int i=0; i<cardArr.length; i++) {	// 카드 총 갯수만큼 반복
			int r = (int)(Math.random()*CARD_NUM);	// 임의의 0~51사이 랜덤값을 받아
			
			Card temp = cardArr[i];
			cardArr[i] = cardArr[r];
			cardArr[r] = temp;	// 0번째 객체와 랜덤번째 객체 교체, 1번째와 랜덤번째 교체 ... cardArr 배열의 마지막 객체까지 반복해서 랜덤으로 교체한다.
		}
	}
}

class Card{
	static final int KIND_MAX = 4;	// 카드 무늬의 가짓수
	static final int NUM_MAX = 13;  // 각 카드 무늬별 갯수
	
	static final int SPADE = 4;		// 카드 무늬마다 번호를 지정
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	
	int kind;	// 카드 무늬 변수
	int number;	// 카드 번호 변수
	
	Card(){	// Card 클래스의 기본 생성자. 인자없이 인스턴스가 생성되면 Card(~~ , ~~) 생성자를 호출하기 위해 this를 사용했다
		this(SPADE, 1);	// Card(int kind, int number) 생성자가 없다면 빨간줄이 그임
	}
	
	Card(int kind, int number){	// 인자로 온 무늬번호, 카드번호에 대한 값을 생성된 인스턴스의 멤버변수로 넣어준다
		this.kind = kind;
		this.number = number;
	}
	
	
	public String toString() {
		String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"}; // 카드 무늬 종류 이름을 kinds 배열로 저장
		String numbers = "0123456789XJQK";	// 카드번호에 관한 문자열 numbers
		
		return "kind : " + kinds[this.kind] + ", number : " + numbers.charAt(this.number);	// 인스턴스 생성시 초기화된 kind, number 변수를 통해 kinds 배열과 numbers 문자열에서 특정 값을 추출해 프린트한다
	}
}
	