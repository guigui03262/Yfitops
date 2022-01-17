package nullobject;

public class RealMusica extends AbstractMusica{
	
	public RealMusica(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String getNome() {
		return "Tocando: " + nome;
	}

}