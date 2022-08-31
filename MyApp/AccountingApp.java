public class AccountingApp {

	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble(args[0]);	// 매개변수로 주어지는 args[0]은 타입이 String이므로 Double로 형변환 해주어야 한다.
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply * vatRate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;
		double dividend1 = income*0.5;
		double dividend2 = income*0.3;
		double dividend3 = income*0.2;
		
		System.out.println("Value of supply : "+valueOfSupply);
		System.out.println("VAT : "+ vat);
		System.out.println("Total Price : "+ total);
		System.out.println("Expense : "+ expense);
		System.out.println("Income : "+ income);
		System.out.println("Dividend1 : "+ dividend1);
		System.out.println("Dividend2 : "+ dividend2);
		System.out.println("Dividend3 : "+ dividend3);
		
		
		
	}
}
