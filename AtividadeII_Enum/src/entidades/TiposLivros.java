package entidades;

public enum TiposLivros {
	Romance("Romance"),
	FICCAO_CIENTÍFICA("Ficcao_Cientifica"),
	AVENTURA("Aventura"),
	TUTORIAL("Tutorial");

	private String nome;

	TiposLivros(String nome) {
		this.nome=nome;	
	}
	
	
	public String getNome() {
		return nome;
	}
	
	
	
	
	

}
