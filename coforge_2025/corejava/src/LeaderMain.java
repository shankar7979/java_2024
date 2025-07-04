
public class LeaderMain {

	public static void main(String[] args) {
		
		Leader leader=new Leader(1, "anand parsad", 35, new Speech(9001, 10, "corruption"),new Address(7001, "alpha", "gr noida", "UP", 878787));
		
		System.out.println("Leader Data");
		System.out.println("\tid : "+leader.getLeaderId());
		System.out.println("\tname : "+leader.getLeaderName());
		System.out.println("\tage : "+leader.getLeaderAge());
		
		System.out.println("\n \t speech");
		System.out.println("\tid : "+leader.getSpeech().getSpeechId());
		Speech speech=leader.getSpeech();
		
		System.out.println("\tid : "+speech.getSpeechId());
		System.out.println("\tlength : "+speech.getSpeechLength());
		System.out.println("\ttoopic : "+speech.getSpeechTopic());
	
		System.out.println("\n \t address");
		System.out.println("\tid : "+leader.getAddress().getAddressId());
		System.out.println("\tlocation : "+leader.getAddress().getAddressLocation());
		System.out.println("\tcity : "+leader.getAddress().getAddressCity());
		System.out.println("\tstate : "+leader.getAddress().getAddressState());
		System.out.println("\tpin : "+leader.getAddress().getAddressPin());
	}
}
