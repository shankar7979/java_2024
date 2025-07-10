public class Insurance {

	private long insuranceId;
	private String insuranceName;

	private final String insuranceCountry;
	// final variable must be initialized either inline or using constructor
	// final works as constant

	public Insurance(long insuranceId, String insuranceName, String insuranceCountry) {
		super();
		this.insuranceId = insuranceId;
		this.insuranceName = insuranceName;
		this.insuranceCountry = insuranceCountry;
	}

	// final attribute cannot have setter method
//	public void setInsuranceCountry(String insuranceCountry) {
//		this.insuranceCountry=insuranceCountry;
//	}

	public void setInsuranceId(long insuranceId) {
		this.insuranceId = insuranceId;
	}

	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public long getInsuranceId() {
		return insuranceId;
	}

	public String getInsuranceName() {
		return insuranceName;
	}

	public String getInsuranceCountry() {
		return insuranceCountry;
	}

	public static void main(String[] args) {

	}

}
