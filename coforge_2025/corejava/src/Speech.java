
public class Speech {

	private long speechId;
	private int speechLength;
	private String speechTopic;

	public Speech(long speechId, int speechLength, String speechTopic) {
		super();
		this.speechId = speechId;
		this.speechLength = speechLength;
		this.speechTopic = speechTopic;
	}

	public long getSpeechId() {
		return speechId;
	}

	public int getSpeechLength() {
		return speechLength;
	}

	public String getSpeechTopic() {
		return speechTopic;
	}

}
