package observerpattern;

public interface Observer {
	public void notify(Observable observable, String message);
}
