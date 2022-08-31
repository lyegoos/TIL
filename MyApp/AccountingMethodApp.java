public class AccountingMethodApp {
	public static double valueOfSupply;	// 매개변수로 주어지는 args[0]은 타입이 String이므로 Double로 형변환 해주어야 한다.
	public static double vatRate;
	public static double expenseRate;
	
	public static void main(String[] args) {
		
		valueOfSupply = 10000.0;
		vatRate = 0.1;
		expenseRate = 0.3;
//		double vat = getVAT();	// 입력값을 받으면서 메서드를 호출
//		double total = getTotal();
//		double expense = getExpense();
//		double income = getIncome();
//		double dividend1 = getDividend1();
//		double dividend2 = getDividend2();
//		double dividend3 = getDividend3();
		
		print();
	}

	public static void print() {
		System.out.println("Value of supply : "+valueOfSupply);
		System.out.println("VAT : "+ getVAT());
		System.out.println("Total Price : "+ getTotal());
		System.out.println("Expense : "+ getExpense());
		System.out.println("Income : "+ getIncome());
		System.out.println("Dividend1 : "+ getDividend1());
		System.out.println("Dividend2 : "+ getDividend2());
		System.out.println("Dividend3 : "+ getDividend3());
	}

	public static double getDividend1() {
		return getIncome()*0.5;
	}
	public static double getDividend2() {
		return getIncome()*0.3;
	}
	public static double getDividend3() {
		return getIncome()*0.2;
	}

	public static double getIncome() {
		return valueOfSupply - getExpense();
	}

	public static double getExpense() {
		return valueOfSupply * expenseRate;
	}

	public static double getTotal() {
		return valueOfSupply + getVAT();
	}

	public static double getVAT() {
		return valueOfSupply * vatRate;
	}
}
