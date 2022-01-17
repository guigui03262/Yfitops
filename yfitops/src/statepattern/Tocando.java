package statepattern;


public class Tocando extends Status {

	public Tocando(Player player) {
		super(player);
		System.out.println("Player: Tocando " + getPlayer().getMusic().getName());
	}

	@Override
	public void playPause() {
		getPlayer().setState(new Pause(getPlayer()));
	}

	@Override
	public void reset() {
		getPlayer().setState(new Vazio(getPlayer()));
	}

}
