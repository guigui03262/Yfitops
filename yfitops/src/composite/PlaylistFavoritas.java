package composite;

import java.util.ArrayList;

public class PlaylistFavoritas implements Favoritas{
	private String nome;
	
	private ArrayList<Favoritas> playfav;
	
	public PlaylistFavoritas(String nome) {
		this.nome =nome;
		this.playfav = new ArrayList<>();
	}
	
public void printFavoritas() {
	playfav.forEach(Favoritas::printFavoritas);
}
public void addPlaylist(Favoritas favoritas) {
	playfav.add(favoritas);
}

public void removePlaylist(Favoritas favoritas) {
	playfav.remove(favoritas);
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}
	
}
