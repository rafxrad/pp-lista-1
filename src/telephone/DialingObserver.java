package telephone;

public class DialingObserver implements Observer {
	
	PhoneModel model = new PhoneModel();
	
	@Override
	public void update() {
			if(model.getDigits().size() == 12) {
				String fullNumber = "";
				for(int number: model.getDigits()) {
					fullNumber += "" + number + "";
				}
				System.out.println("Discando para " + fullNumber + "...");
			}
		}
	}

