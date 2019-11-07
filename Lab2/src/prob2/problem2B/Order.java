package prob2.problem2B;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order {

	//fields

	private int orderNumber;
	private LocalDate orderDate;
	private List<OrderLine> oL;

	//constructor
	public Order(int orderNumber, LocalDate orderDate, int lineNumber, double price, int quantity) {
		this.orderNumber = orderNumber;
		this.orderDate = orderDate;
		oL = new ArrayList<OrderLine>(Arrays.asList(new OrderLine(lineNumber,price, quantity, this)));
	}

	//methods
	public List<OrderLine> getOL() {
		return oL;
	}

	public void addOL(int linenum, double price, int quantity) {
		oL.add(new OrderLine(linenum, price, quantity, this));
	}
	@Override
	public String toString() {
		StringBuilder order = new StringBuilder("Order# "+orderNumber+"\tDate: "
	+orderDate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"))+"\nLine#\tPrice\tQuantity\n");
		for(OrderLine ol : oL) {
			order.append(ol+"\n");
		}
		return order.toString();
	}
	
}
