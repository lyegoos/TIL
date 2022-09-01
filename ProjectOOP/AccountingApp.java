class Accounting{
	// 공급가액
    public double valueOfSupply;
    // 부가가치세율
    public static double vatRate = 0.1;	// 어떤 인스턴스던 간에 동일한 값이기 때문에 static으로 두는 것이 좋다. 인스턴스를 만들 때마다 새로운 메모리를 할당하지 않아도 되기 때문.
    public Accounting(double valueOfSupply) {	// 생성자
    	this.valueOfSupply = valueOfSupply;
    }
    public double getVAT() {
        return valueOfSupply * vatRate;
    }
     
    public double getTotal() {
        return valueOfSupply + getVAT();
    }
 
}
public class AccountingApp {
    
    public static void main(String[] args) {
    	
    	Accounting a1 = new Accounting(10000.0);
    	Accounting a2 = new Accounting(20000.0);
//    	a2.valueOfSupply = 20000.0;
//    	a1.valueOfSupply = 10000.0;
    	
        System.out.println("a1 Value of supply : " + a1.valueOfSupply);
        System.out.println("a2 Value of supply : " + a2.valueOfSupply);
        
        System.out.println("a1 VAT : " + a1.getVAT());
        System.out.println("a2 VAT : " + a2.getVAT());
        
        System.out.println("a1 Total : " + a1.getTotal());
        System.out.println("a2 Total : " + a2.getTotal());
 
    }
 
}