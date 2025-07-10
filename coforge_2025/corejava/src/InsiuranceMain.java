
public class InsiuranceMain {

	public static void main(String[] args) {

		Insurance insurance = new Insurance(56656565, "life insuarnce", "india");

		System.out.println("insurance details ");
		System.out.println("\t id " + insurance.getInsuranceId());
		System.out.println("\t name " + insurance.getInsuranceName());
		System.out.println("\t country " + insurance.getInsuranceCountry());

		insurance.setInsuranceId(7878787);
		insurance.setInsuranceName("health insurance");

		// can not change final insuranceCountry

		// Math.PI=989898;

	}
}
