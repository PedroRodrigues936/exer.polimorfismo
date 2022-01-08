package entities;

public class OutsourcedEmployee extends Employee {

	private Double additionalCharge;

	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer houers, Double valuePerHour, Double additionalCharge) {
		super(name, houers, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public OutsourcedEmployee(String name, int hours, double valuePerHour, double additionalCharge2) {
		// TODO Auto-generated constructor stub
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.1;
	}

}
