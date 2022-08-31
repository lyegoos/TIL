
public class AuthApp {

	public static void main(String[] args) {
		
		String id = "egoing";	// 올바른 ID
		String inputId = args[0];	// 입력받은 ID
		
		String pwd = "1111";
		String inputPwd = args[1];
		
		System.out.print("Hi. ");
		
		if(inputId.equals(id) && (inputPwd.equals(pwd))) {	//inputId == id 를 조건식으로 사용하면 false
			System.out.println("Master!");
		} else {
			System.out.println("Who are you?");
		}

	}

}
