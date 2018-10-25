package Assessment;

public class Current extends Account{
	private double rateOfInt;

	
	public Current(int accNo, String accName, String accBal, double rateOfInt) {
		super(accNo, accName, accBal);
		this.rateOfInt = rateOfInt;
	}

	public double getRateOfInt() {
		return rateOfInt;
	}

	public void setRateOfInt(double rateOfInt) {
		this.rateOfInt = rateOfInt;
	}
	
}
