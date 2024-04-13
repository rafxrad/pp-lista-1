package telephone;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Mimic the data input ability of a physical phone's keypad;
 * however, here we're just sending it fake digits.
 */
public class KeyPad implements Observable{
    private final PhoneModel model;
    public List<Observer> observers = new ArrayList<>();


    public KeyPad(PhoneModel model) {
        this.model = model;
        this.observers = new ArrayList<>();
    }

    public void simulateKeyPresses(int numKeyPresses) {
        final int MAX_DIGIT = 12;
        Random rnd = new Random();
        for (int i = 0; i < numKeyPresses; i++) {
            int newDigit = rnd.nextInt(MAX_DIGIT);
            System.out.println("Pressionando: " + newDigit);
            model.addDigit(newDigit);
            notifyObserverNewDigit();
        }
        notifyObserverDialing();
    }
    

	@Override
	public void notifyObserverNewDigit() {
		for (Observer observer : observers) {
			observer.updateNewDigit();;
		}
		
	}
	
	@Override
	public void notifyObserverDialing() {
		for (Observer observer : observers) {
			observer.updateDialing();
		}
		
	}
	

	@Override
	public void addObserver(Observer o) {
		observers.add(o);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
		
	}
	
	



}
