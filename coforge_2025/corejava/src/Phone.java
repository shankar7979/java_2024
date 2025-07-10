public abstract interface Phone {
//  void call();
 public abstract void call();
  //void show() {}
}

interface basicPhone {
	void call();
	void message();
	String country="india";// by default its is public static final
}
                             // multiple inheritance
interface SmartPhone extends Phone, basicPhone{
	void chat();
	void videoPlay();
	void upiPayment();
	void musicPlay();
}

abstract class UserPhone{
     private int phoneId;	
     private String phoneModel;	
     private  float cost;

     abstract float phoneCost();
     public UserPhone(int phoneId, String phoneModel, float cost) {
		super();
		this.phoneId = phoneId;
		this.phoneModel = phoneModel;
		this.cost = cost;
	}

	public int getPhoneId() {
		return phoneId;
	}

	public String getPhoneModel() {
		return phoneModel;
	}

	public float getCost() {
		return cost;
	}
	@Override
	public String toString() {
		return "UserPhone [phoneId=" + phoneId + ", phoneModel=" + phoneModel + ", cost=" + cost + "]";
	}

} 


// one interface can extends multiple interfaces
// one class can extend only one class but can implements multiple interfaces