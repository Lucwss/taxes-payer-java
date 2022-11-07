package teste5;

public class Company extends Payer {
	private Integer numberOfEmployees;
	
	public Company() { super(); }
	
	public Company(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}
	
	// ********** GETTERS **********

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}
	
	// ********** SETTERS **********

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	// ********** OTHER METHODS **********
	
	@Override
	public Double taxPaymemt() {
		return numberOfEmployees > 10 ? this.getAnualIncome() * 0.14 : this.getAnualIncome() * 0.16;
	}
	
	
}
