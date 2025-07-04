
public class Leader {

	private int leaderId;
	private String leaderName;
	private int leaderAge;
	
	private Speech speech;  // Leader has speech  -- composition
    private Address address; // Leader has address
    
    
	public Leader(int leaderId, String leaderName, int leaderAge, Speech speech, Address address) {
		super();
		this.leaderId = leaderId;
		this.leaderName = leaderName;
		this.leaderAge = leaderAge;
		this.speech = speech;
		this.address = address;
	}


	public int getLeaderId() {
		return leaderId;
	}


	public String getLeaderName() {
		return leaderName;
	}


	public int getLeaderAge() {
		return leaderAge;
	}


	public Speech getSpeech() {
		return speech;
	}


	public Address getAddress() {
		return address;
	}
    
	
    
	
	
}
