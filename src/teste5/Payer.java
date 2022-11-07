package teste5;

public abstract class Payer {
	private String name;
	private Double anualIncome;
	
	public Payer() {}
	
	public Payer(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}
	
	// ********** GETTERS **********

	public String getName() {
		return name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}
	
	// ********** SETTER **********
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	// *********** OTHER METHODS ***********
	
	public abstract Double taxPaymemt();
	
	
	
	
}
