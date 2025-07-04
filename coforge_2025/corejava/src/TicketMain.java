import java.util.Scanner;

public class TicketMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter no of bookings ");
		int no = scanner.nextInt();

		System.out.println("Enter no of avaibale tickets ");
		Ticket.setAvailableTickets(scanner.nextInt());

		Ticket ticket[] = new Ticket[no];

		for (int i = 0; i < ticket.length; i++) {
			ticket[i] = new Ticket();
			System.out.println("Enter the ticket id ");
			ticket[i].setTicketid(scanner.nextInt());

			System.out.println("Enter the  price");
			ticket[i].setPrice(scanner.nextInt());

			System.out.println("Enter no of tickets ");
			int no1=scanner.nextInt();
			
			System.out.println("Available tickets "+Ticket.getAvailableTickets());
			int calculateTicketCost  = ticket[i].calculateTicketCost(no1);

			System.out.println("Total amount "+calculateTicketCost);
			System.out.println("Available ticket after booking "+Ticket.getAvailableTickets());
		}

	}

}
