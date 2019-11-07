package prob2.problem2B;

public class OrderLine {
	//fields
	private int lineNumber;
	private double price;
	private int quantity;
	private Order order;

	OrderLine(int lineNumber, double price, int quantity, Order order) {
		this.lineNumber = lineNumber;
		this.price = price;
		this.quantity = quantity;
		this.order = order;
	}

	@Override
	public String toString() {
		return String.format("%d\t%.2f\t%d\t", lineNumber, price, quantity);
	}
	

}
