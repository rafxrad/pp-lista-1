package telephone;

import java.util.ArrayList;
import java.util.List;

/**
 * Prints things out to the screen, when needed
 * Printing to the screen:
 *  System.out.println("hello");
 */
public class Screen {
	
    private final PhoneModel model;
    public final List<Observer> observers = new ArrayList<>();
    

    public Screen(PhoneModel model) {
        this.model = model;
        this.addObserver(new DialingObserver());
        this.addObserver(new NewDigitObserver());
       
    }
    
    public void addObserver(Observer event) {
    	observers.add(event);
    }
    
   
    public void notify(Observer observer) {
    	observer.notify();
    }
}
