package week2.day3;

public class Elements extends Button {

	public static void main(String[] args) {
		Elements obj =new Elements();
		obj.click();
		obj.setText("Inheritance");
		obj.submit();
		
		CheckBoxButton cbObj=new CheckBoxButton();
		cbObj.clickCheckButton();
		cbObj.click();
		cbObj.submit();
		cbObj.setText("Multilevel Inheritance");
		
		RadioButton rbObj= new RadioButton();
		rbObj.selectRadioButton();
		rbObj.click();
		rbObj.submit();
		rbObj.setText("Hybrid Inheritance");
		
		TextField tfObj=new TextField();
		tfObj.getText();
	}

}
