
public class MyPhoneMain {

	public static void main(String[] args) {
		MyPhone myPhone=new MyPhone(56665, "samsung galaxy", 34000, 10);
		
		System.out.println("my phone feature");
		myPhone.call();
		myPhone.chat();
		myPhone.message();
		myPhone.videoPlay();
		myPhone.musicPlay();
		myPhone.upiPayment();
		//basicPhone.country="";
		
		System.out.println("\n my phone details ");
		System.out.println("\t id "+myPhone.getPhoneId());
		System.out.println("\t cost "+myPhone.getCost());
		System.out.println("\t discount "+myPhone.getDiscount());
		System.out.println("\t model "+myPhone.getPhoneModel());
		System.out.println("\t country "+basicPhone.country);
		System.out.println("\t after discount final price  "+myPhone.phoneCost());
	}
}
