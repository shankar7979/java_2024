package exception;

public class InterestCalculation {
	private float amount;
	private float rate;
	private int time;

	public InterestCalculation(float amount, float rate, int time) {
		super();
		this.amount = amount;
		this.rate = rate;
		this.time = time;
	}

	public float getAmount() {
		return amount;
	}

	public float getRate() {
		return rate;
	}

	public int getTime() {
		return time;
	}

	@Override
	public String toString() {
		return "InterestCalculation [amount=" + amount + ", rate=" + rate + ", time=" + time + "]";
	}

	float intCacl(float amt, int time, float rate) throws Exception {
		try {
			if (amt <= 0)
				// System.out.println("invalid amount");
//			throw new RuntimeException("invalid amount");
				throw new Exception("invalid amount");

			if (time <= 0)
				// System.out.println("invalid time");
//			throw new RuntimeException("invalid time");
				throw new Exception("invalid time");

			if (rate <= 0)
				// System.out.println("invalid rate");
//			throw new RuntimeException("invalid rate");
				throw new Exception("invalid rate");
		} catch (Exception e) {
			System.err.println("in method intCalc error is " + e.getMessage());
			throw e; // rethrow the exception 
		}
		return amt * rate * time / 100;

	}

}
