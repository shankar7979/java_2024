
public class Address {
	private long addressId;
	private String addressLocation;
	private String addressCity;
	private String addressState;
	private int addressPin;

	public Address(long addressId, String addressLocation, String addressCity, String addressState, int addressPin) {
		super();
		this.addressId = addressId;
		this.addressLocation = addressLocation;
		this.addressCity = addressCity;
		this.addressState = addressState;
		this.addressPin = addressPin;
	}

	public long getAddressId() {
		return addressId;
	}

	public String getAddressLocation() {
		return addressLocation;
	}

	public String getAddressCity() {
		return addressCity;
	}

	public String getAddressState() {
		return addressState;
	}

	public int getAddressPin() {
		return addressPin;
	}

}
