
public class Player {
	private String LastName;
	private String FirstName;
	private Ticket ticket;
	
	public Player(String ln, String fn){
		LastName = ln;
		FirstName = fn;
		ticket = new Ticket();
	}
	
	public String getLastName() {
		return LastName;
	}
	
	public String getFirstName(){
		return FirstName;
	}
	
	public Ticket getTicket(){
		return ticket;
	}
}
