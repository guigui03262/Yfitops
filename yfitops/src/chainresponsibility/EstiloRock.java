package chainresponsibility;

import java.util.HashMap;
import java.util.Map;

public class EstiloRock extends BuscarMusica{
	private Map<String, MusicaCR> banco = new HashMap<>();
	
	public EstiloRock(BuscarMusica bm) {
		super(bm);
		banco.put("L.A. Woman", new MusicaCR("The Doors - L.A. Woman"));
	}

	@Override
	protected MusicaCR encontrarMusica(String nome) {
		if(banco.containsKey(nome)) {
			System.out.println("Musica encontrada no banco estilo Rock");
			return banco.get(nome);
		}
			
		return null;
	}

}
