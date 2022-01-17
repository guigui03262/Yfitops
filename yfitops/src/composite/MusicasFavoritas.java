package composite;

public class MusicasFavoritas implements Favoritas {

	private String nome;

	public MusicasFavoritas(String nome) {
		super();
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void printFavoritas() {
		System.out.println(getNome());
	}

}
