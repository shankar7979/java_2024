
public class MyPhone extends UserPhone implements Phone, basicPhone, SmartPhone {

	public MyPhone(int phoneId, String phoneModel, float cost, float discount) {
		super(phoneId, phoneModel, cost);
		this.discount = discount;
	}

	private float discount;
	


	@Override
	float phoneCost() {
		return getCost()-(getCost()*getDiscount()/100);
	}


	public float getDiscount() {
		return discount;
	}

	@Override
	public void chat() {
		System.out.println("chat feature");
	}

	@Override
	public void videoPlay() {
		System.out.println("video play feature");
	}

	@Override
	public void upiPayment() {
		System.out.println("upi payment feature");
	}

	@Override
	public void musicPlay() {
		System.out.println("music play feature");
	}

	@Override
	public void message() {
		System.out.println("message feature");
	}

	@Override
	public void call() {
		System.out.println("calling feature");
	}

}
