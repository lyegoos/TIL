import java.io.IOException;
import java.io.PrintWriter;

public class InstanceApp {

	public static void main(String[] args) throws IOException {
		
		// PrintWriter 클래스를 사용하려면 패키지를 import 해야 한다.
		PrintWriter p1 = new PrintWriter("result1.txt");	// 지정한 파일명으로 저장, p1에 PrintWriter라는 클래스의 인스턴스가 담겨 있다.
		// 파일이 없을 경우(예외)를 대비해 에러가 발생하는데 예외처리를 해주면 된다.(throws IOException)
		// PrintWriter("result1.txt") 이 부분은 Constructor, 즉 생성자.
		p1.write("Hello 1");
		p1.close();
		
		PrintWriter p2 = new PrintWriter("result2.txt");
		p2.write("Hello 2");
		p2.close();
		
		
		
	}

}
