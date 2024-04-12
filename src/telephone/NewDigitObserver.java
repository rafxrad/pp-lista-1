package telephone;

public class NewDigitObserver implements Observer {
	
	PhoneModel model = new PhoneModel();
	@Override
	public void update() {
		int newDigit = (model.getDigits()).size()-1;
		System.out.println(newDigit);
		
	}
	
}
