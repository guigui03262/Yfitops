package statepattern;


public abstract class Status {

	private Player player;

	public Status(Player player) {
		super();
		this.player = player;
	}
	
	public abstract void playPause();
	
	public abstract void reset();

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

}
