package statepattern;


public class Pause extends Status{	

	public Pause(Player player) {
		super(player);
		System.out.println("Player: " + getPlayer().getMusic().getName() + " esta pausada");
	}

	@Override
	public void playPause() {
		getPlayer().setState(new Tocando(getPlayer()));
	}

	@Override
	public void reset() {
		getPlayer().setState(new Vazio(getPlayer()));
	}

}