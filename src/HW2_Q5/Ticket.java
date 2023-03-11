package HW2_Q5;

public class Ticket implements SaleableItem{
	@Override
	public void sellCopy() {
		System.out.println("Selling a Ticket");
	}
}