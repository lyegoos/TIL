
public class Casting {

	public static void main(String[] args) {
		double a = 1.1;
		double b = 1;	// 손실이 없기 때문에 1이 자동으로 double로 캐스팅 된 것
		double b2 = (double) 1;	//명시적으로 형변환을 표기
		System.out.println(b); // 1이 자동으로 double로 캐스팅
//		int c = 1.1;	// double을 int 변환시 손실되는 값 0.1이 존재하므로 에러
		double d = 1.1;
		int e = (int) 1.1;
		
		//1 to String
		String f = Integer.toBinaryString(1);
		System.out.println(f.getClass());
		

	}

}
