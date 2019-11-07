package prob2.problem2B;

import java.time.LocalDate;


public class Main {
	public static void main(String [] args) {
		Order orderOne = new Order(1, LocalDate.now(), 101, 20, 3);
		orderOne.addOL(102, 5, 4);
		
		Order orderTwo = new Order(2, LocalDate.now().plusDays(-1), 201, 20, 3);
		orderOne.addOL(202, 5, 4);
		orderOne.addOL(203, 10, 8);
		
		System.out.println(orderOne);
		System.out.println(orderOne);
	}
}
