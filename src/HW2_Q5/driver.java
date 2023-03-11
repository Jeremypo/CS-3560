package HW2_Q5;

public class driver {
	public static void main(String[] args) {
		Payroll pay = new Payroll();
		pay.processPayments(new Worker("Jer", 30));
	}
}
