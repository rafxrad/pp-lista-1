package telephone;

public interface Observable {

	public void addObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObserverNewDigit();
	public void notifyObserverDialing();
}
