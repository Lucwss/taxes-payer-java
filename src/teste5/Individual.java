package teste5;

public class Individual extends Payer {
	private Double healthCares;
 	
	public Individual () { super(); }
	
	public Individual(String name, Double anualIncome, Double healthCares) {
		super(name, anualIncome);
		this.healthCares = healthCares;
	}
	
	// ********** GETTERS **********

	public Double getHealthCares() {
		return healthCares;
	}
	
	// ********** SETTERS **********

	public void setHealthCares(Double healthCares) {
		this.healthCares = healthCares;
	}
	
	// ********** OTHER METHODS **********
	
	@Override
	public Double taxPaymemt() {
		return this.getAnualIncome() < 20000.00 ?
				healthCares > 0 ? ((this.getAnualIncome() * 0.15) - (healthCares * 0.50)) : (this.getAnualIncome() * 0.15)
				:
				healthCares > 0 ? ((this.getAnualIncome() * 0.25) - (healthCares * 0.50)) : (this.getAnualIncome() * 0.25);
	}
}

//if(this.getAnualIncome() < 20000.00) {
//return healthCares > 0 ? ((this.getAnualIncome() * 0.15) - (healthCares * 0.50)) : (this.getAnualIncome() * 0.15);
//}
//else {
//return healthCares > 0 ? ((this.getAnualIncome() * 0.25) - (healthCares * 0.50)) : (this.getAnualIncome() * 0.25);
//}
