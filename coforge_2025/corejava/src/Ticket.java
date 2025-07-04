public class Ticket {

	private int ticketid;
	private int price;
	private static int availableTickets;

	public int calculateTicketCost(int nooftickets) {
		if (getAvailableTickets() > 0) {
			Ticket.availableTickets = Ticket.availableTickets - nooftickets;
			return nooftickets * price;
		} else {
			System.out.println("Tickets are not available ");
			return 0;
		}
	}

	public int getTicketid() {
		return ticketid;
	}

	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public static void setAvailableTickets(int availableTickets) {
		if (availableTickets <= 0)
			System.out.println("invalid available tickets");
		else
			Ticket.availableTickets = availableTickets;
	}

	public static int getAvailableTickets() {
		return availableTickets;
	}

}
