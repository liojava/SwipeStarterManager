/**
 * I declare that this code was written by me 
 * I will not copy or allow others to copy my code
 * I understand that copying code is considered as plagiarism.
 *
 * Student Name: Lionel Lim Jin Rong
 * Student ID: 20015553
 *
 */

public class SwipeStarterManager {

	public static void main(String[] args) {
		String[] topFunders = new String[5];
		topFunders[0] = "Jenny - 6000.00";
		topFunders[1] = "Arvin - 8000.00";
		
		
		String[] generalFunders = new String[200];
		generalFunders[0] = "Arlene - 100.00";
		generalFunders[1] = "Sufian - 500.00";
		generalFunders[2] = "Wei Cong - 150.00";
		generalFunders[3] = "Molly - 1000.00";
		generalFunders[4] = "Aisha - 700.00";
		generalFunders[5] = "Stefan - 50.00";
		generalFunders[6] = "Xueling - 10.00";
		generalFunders[7] = "Sharlene - 250.00";
		generalFunders[8] = "Benedict - 100.00";
		generalFunders[9] = "Paul - 20.00";
		
		MightyMouse view = new MightyMouse("A111", "Use this as a normal mouse, or a touchpad!", "Mac, Windows, Linux", 128000.00);
		
		int option = -1;
		while(option != 5) {
			Helper.line(30, "-");
			System.out.println("S W I P E  S T A R T E R");
			Helper.line(30, "-");
			System.out.println("1. View Project");
			System.out.println("2. Fund Project");
			System.out.println("3. View Top Funders");
			System.out.println("4. View General Funders");
			System.out.println("5. Quit");
			option = Helper.readInt("Enter choice > ");
//			
			if (option == 1){
				view.showDetails();
			}
//			
			else if (option == 2) {
				char select = Helper.readChar("Would you like to fund Mighty Mouse Project? (y/n) > ");
				if (select == 'y') {
					String name = Helper.readString("Please enter your name > ");
					double fund = Helper.readDouble("Amount to fund > $");
					if (fund >= 5000) {
						boolean isNull = true;
						int i = 0;
						while (isNull == true) {
							if(topFunders[i] == null) {
								topFunders[i] = name + " - " + fund;
								isNull = false;
								System.out.println("Thank you for your donation " + name + "! You will be in our TOP funders list");
							}
							else if(topFunders[4] != null) {
								System.out.println("Sorry " + name + " our top funder list is full for now");
								isNull = false;
							}
							i++;
						}
					}
					else if (fund < 5000) {
						boolean isNull = true;
						int i = 0;
						while (isNull == true) {
							if(generalFunders[i] == null) {
								generalFunders[i] = name + " - " + fund;
								isNull = false;
							}

							i++;	
						}
						System.out.println("Thank you for your donation " + name + "! You will be in our general funders list");
						
					}
					
				}
				
			}
//
			else if (option == 3) {
				Helper.line(30, "-");
				System.out.println("TOP FUNDERS");
				Helper.line(30, "-");
				for(int i = 0; i < topFunders.length; i++) {
					if (topFunders[i] != null) {
						System.out.println(topFunders[i]);
					}
				}
			}	
//			
			else if (option == 4) {
				Helper.line(30, "-");
				System.out.println("GENERAL FUNDERS");
				Helper.line(30, "-");
				boolean isNull = true;
				int i = 0;
				int maxNumber = 0;
				while (isNull == true) {
					if(generalFunders[i] == null) {
						maxNumber = i;
						isNull = false;
					}
						i++;
				}
				
				for(int a = (maxNumber - 1); a > (maxNumber - 6); a--) {
					System.out.println(generalFunders[a]);
				}
			}
			else if (option == 5) {
				System.out.println("Thank you for using the program!");
			}
			else {
				System.out.println("Invalid Option!");
			}
		}
	}

}
