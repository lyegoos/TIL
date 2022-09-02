class VarArgsEx {
	public static void main(String[] args) {
		String[] strArr = { "100", "200", "300" };
		
		System.out.println(concatenate("", "100", "200", "300"));
		System.out.println(concatenate("-", strArr));
		System.out.println(concatenate(",", new String[]{"1", "2", "3"}));
		System.out.println("["+concatenate(",", new String[0])+"]");	// args로 들어가는 것이 빈 배열이기 때문에 배열을 인자로 받는 concaternate 함수의 for문이 동작하지 않는다.
		System.out.println("["+concatenate(",")+"]");
	}

	static String concatenate(String delim, String... args) {
		String result = "";

		for(String str : args) {
			result += str + delim;
		}
		
		return result;
	}

/*
	static String concatenate(String... args) {
		return concatenate("",args);
	}
*/
} // class