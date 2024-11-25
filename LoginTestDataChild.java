package week3.day1.HomeAssignments;

public class LoginTestDataChild extends TestDataSuperClass{

	    public void enterUsername(String username) {
	        System.out.println("Username entered through sub class: " + username);
	    }

	    public void enterPassword(String password) {
	        System.out.println("Password entered through sub class: " + password);
	    }

	public static void main(String[] args) {
		
		LoginTestDataChild ltdc=new LoginTestDataChild();
		ltdc.username="Subclass_username";
		ltdc.password="Subclass@1";
			
		ltdc.enterCredentials("Subclass_username", "Subclass@1");
			
		ltdc.navigateToHomePage();

	}

}
