package week3.day1.HomeAssignments;

public class TestDataSuperClass {
	
	String username; 
	String password;
	
	public void enterCredentials(String Username, String Password) {
		
		System.out.println("Enter the username :" +username);
		System.out.println("Enter the password :" +password);
		
	}
	
	public void navigateToHomePage(){
		System.out.println("Navigating to home page");
	}

	public static void main(String[] args) {
		TestDataSuperClass tdsuper=new TestDataSuperClass();
		tdsuper.username="Kiruthika_wins";
		tdsuper.password="KiruthikaNaga@1";
			
		tdsuper.enterCredentials("Kiruthika_wins", "KiruthikaNaga@1");
			
		tdsuper.navigateToHomePage();
	}

}
