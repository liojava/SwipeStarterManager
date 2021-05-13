/**
 * I declare that this code was written by me 
 * I will not copy or allow others to copy my code
 * I understand that copying code is considered as plagiarism.
 *
 * Student Name: Lionel Lim Jin Rong
 * Student ID: 20015553
 *
 */

public class MightyMouse {
	public String model;
	public String description;
	public String compatibility;
	public double goalAmount;
	public double currentAmountRaised;
	
	public MightyMouse(String model, String description, String compatibility, double goalAmount) {
		this.model = model;
		this.description = description;
		this.compatibility = compatibility;
		this.goalAmount = goalAmount;
		this.currentAmountRaised = 0.0;
		
	}
	public void showDetails() {
		Helper.line(30, "-");
		System.out.println("V I E W  P R O J E C T");
		Helper.line(30, "-");
		System.out.println("Model: " + model);
		System.out.println("Description: " + description);
		System.out.println("Compatibility: " + compatibility);
		System.out.println("Goal Amount: $" + goalAmount);
		System.out.println("Amount raised: $" + currentAmountRaised);
	}

}
