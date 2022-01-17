package statepattern;


public class Vazio extends Status {

	public Vazio(Player player) {
		super(player);
		System.out.println("Player: Vazio");
	}

	@Override
	public void playPause() {
		System.out.println("Player: Nao tem musica para tocar ou pausar");
	}

	@Override
	public void reset() {
		System.out.println("Player: Ja ta vazio");
	}

}
