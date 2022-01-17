package statepattern;


public class Player {
	private Musica music;
	private Status state;

	public Player() {
		super();
		this.state = new Vazio(this);
	}
	
	public void playPause() {
		state.playPause();
	}
	
	public void reset() {
		state.reset();
	}

	public Musica getMusic() {
		return music;
	}

	public void setMusic(Musica playlist) {
		this.music = playlist;
		this.setState(new Tocando(this));
	}

	public Status getState() {
		return state;
	}

	public void setState(Status state) {
		this.state = state;
	}

}
