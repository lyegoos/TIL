class Accounting{
	public double valueOfSupply;	// 매개변수로 주어지는 args[0]은 타입이 String이므로 Double로 형변환 해주어야 한다.
	public double vatRate;
	public double expenseRate;
	public void print() {
		System.out.println("Value of supply : "+valueOfSupply);
		System.out.println("VAT : "+ getVAT());
		System.out.println("Total Price : "+ getTotal());
		System.out.println("Expense : "+ getExpense());
		System.out.println("Income : "+ getIncome());
		System.out.println("Dividend1 : "+ getDividend1());
		System.out.println("Dividend2 : "+ getDividend2());
		System.out.println("Dividend3 : "+ getDividend3());
	}

	public double getDividend1() {
		return getIncome()*0.5;
	}
	public double getDividend2() {
		return getIncome()*0.3;
	}
	public double getDividend3() {
		return getIncome()*0.2;
	}

	public double getIncome() {
		return valueOfSupply - getExpense();
	}

	public double getExpense() {
		return valueOfSupply * expenseRate;
	}

	public double getTotal() {
		return valueOfSupply + getVAT();
	}

	public double getVAT() {
		return valueOfSupply * vatRate;
	}
}

public class AccountingClassApp {
	
	public static void main(String[] args) {
		
//		Accounting1.valueOfSupply = 10000.0;
//		Accounting1.vatRate = 0.1;
//		Accounting1.expenseRate = 0.3;
//		Accounting1.print();	//클래스가 다르다면 같은 이름의 메서드가 공존할 수 있다! 명시적으로 표기
//		
//		Accounting2.valueOfSupply = 20000.0;
//		Accounting2.vatRate = 0.05;
//		Accounting2.expenseRate = 0.2;
//		Accounting2.print();	// 복제된 클래스를 이용해 서로 다른 값, 같은 메서드를 가지게 함
//
//		Accounting1.print();	// 이후 Accounting1에 대한 메서드를 호출하더라도 값이 바뀌지 않기에 정상적으로 출력
		
		// 클래스를 복제해서 만들어진 것 a1, a2는 인스턴스
		Accounting a1 = new Accounting(); // Accounting 클래스를 복제하는 영역
		a1.valueOfSupply = 10000.0;
		a1.vatRate = 0.1;
		a1.expenseRate = 0.3;
		a1.print();
		
		Accounting a2 = new Accounting(); // Accounting 클래스를 복제하는 영역
		a2.valueOfSupply = 20000.0;
		a2.vatRate = 0.05;
		a2.expenseRate = 0.2;
		a2.print();
		
		a1.print(); 
		
	
		
		
//		double vat = getVAT();	// 입력값을 받으면서 메서드를 호출
//		double total = getTotal();
//		double expense = getExpense();
//		double income = getIncome();
//		double dividend1 = getDividend1();
//		double dividend2 = getDividend2();
//		double dividend3 = getDividend3();
		
		
	}

	
}
