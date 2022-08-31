
public class ArrayApp {

	public static void main(String[] args) {
		
		String[] users = new String[3];
		users[0] = "egoing";
		users[1] = "jinhuck";
		users[2] = "youbin";
		
		System.out.println(users[1]);	// 배열의 2번째 값 출력
		System.out.println(users.length);	// 3칸짜리 배열임이 출력됨

		int[] scores = {10, 100, 100};
		System.out.println(scores[1]);
		System.out.println(scores.length);
	}

}
