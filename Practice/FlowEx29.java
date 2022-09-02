
public class FlowEx29 {

	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			System.out.printf("i=%d ", i);
			
			int tmp = i;
			
			do {
				if(tmp%10%3 == 0 && tmp %10 !=0)	// 뒷자리에 3의 배수가 있고, 10의 배수가 아니라면
					System.out.print("짝");
			} while((tmp/=10) != 0);	// 10으로 나눈 값이 0이 아닐때, 라는건 2자리수 이상일 때
			System.out.println();
			
		}

	}

}
