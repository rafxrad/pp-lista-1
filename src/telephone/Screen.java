package telephone;

/**
 * Prints things out to the screen, when needed
 * Printing to the screen:
 *  System.out.println("hello");
 */
public class Screen implements Observer {
	
    private final PhoneModel model;
    

    public Screen(PhoneModel model) {
        this.model = model;
       
    }


	@Override
	public void updateNewDigit() {
		System.out.println(model.getLastDigit());
		
	}
	
	public void updateDialing() {
		System.out.println("Ligando para... " + model.getAllDigits());
	}
    
    
}
