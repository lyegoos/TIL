class Foo{
	public static String classVar = "I class var";
	public String instanceVar = "I instance var";
	public static void classMethod() {
		System.out.println(classVar); // ok
//		System.out.println(instanceVar); // error
	}
	public void instanceMethod() {
		System.out.println(classVar); // ok
		System.out.println(instanceVar);	//ok
	}
}
public class StaticApp {

	public static void main(String[] args) {
		System.out.println(Foo.classVar);
//		System.out.println(Foo.instanceVar); // 인스턴스메서드이므로 error
		
		Foo f1 = new Foo();
		Foo f2 = new Foo();
		f1.instanceVar = "1";
		System.out.println(f1.instanceVar);
		System.out.println(f1.classVar);
		
		f1.classVar = "changed by f1";
		System.out.println(f2.classVar);	// f1에 의해 클래스변수가 바뀌었으므로 f2 인스턴스에서도 바뀐 값이 출력된다.
	}

}
