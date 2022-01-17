package observerpattern;

public class Dispositivo implements Observer {

	private String name;

	public Dispositivo(String name) {
		super();
		this.name = name;
	}

	public void notify(Observable observable, String message) {
		System.out.println(name + " recebeu a notificacao do " + observable + ": " + message);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
