package week3.day1.HomeAssignments;

public class Elements extends Button {
	public Elements() {
		System.out.println("Execution elements");
	}

	public static void main(String[] args) {
		
		Elements e=new Elements();
		
		WebElement w=new WebElement();
		w.click();
        w.setText("WebElement Text");
        
        Button b=new Button();
        b.click();
        b.submit();
        
        TextField tf = new TextField();
        tf.click();
        tf.setText("TextField Input");
        tf.getText();
        
        CheckBoxButton ccb=new CheckBoxButton();
        ccb.click();
        ccb.submit();
        ccb.clickCheckButton();
        
        RadioButton rb=new RadioButton();
        rb.click();
        rb.submit();
        rb.selectRadioButton();       
		
	}

}
