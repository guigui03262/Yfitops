package chainresponsibility;

public abstract class BuscarMusica {
	private BuscarMusica proxima;
	
	
	public BuscarMusica(BuscarMusica proxima) {
		this.proxima = proxima;
	}
	
	public MusicaCR encontrar(String nome) {
		MusicaCR m = encontrarMusica(nome);
		if(m == null) {
			return proximaMusica(nome);
		}else {
			return m;
		}
	}
	
	private MusicaCR proximaMusica(String nome) {
		if(proxima == null)
			throw new RuntimeException("Música não existe em nenhum banco de estilos.");
		return proxima.encontrar(nome);
	}
	
	protected abstract MusicaCR encontrarMusica(String nome);

}
