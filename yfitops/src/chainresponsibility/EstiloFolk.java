package chainresponsibility;

import java.util.HashMap;
import java.util.Map;

public class EstiloFolk extends BuscarMusica{
	private Map<String, MusicaCR> banco = new HashMap<>();
	
	public EstiloFolk(BuscarMusica bm) {
		super(bm);
		
		banco.put("Hurt", new MusicaCR("Johnny Cash - Hurt"));
	}
	
	@Override
	protected MusicaCR encontrarMusica(String nome) {
		if(banco.containsKey(nome)) {
			System.out.println("Musica encontrada no banco estilo Folk");
			return banco.get(nome);
		}
			
		return null;
	}

}
