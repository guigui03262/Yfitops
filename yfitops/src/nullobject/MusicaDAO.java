package nullobject;

public class MusicaDAO {
	
	public static final String[] musicas = {"Riders on the storm", "People Are Strange", "The End", "Break On Through"};
	
	public static AbstractMusica getMusica(String nome) {
		for (int i = 0; i < musicas.length; i++) 
			if (musicas[i].equalsIgnoreCase(nome)) 
				return new RealMusica(nome);			
		
		return new NullMusica();
	}	
	
}
