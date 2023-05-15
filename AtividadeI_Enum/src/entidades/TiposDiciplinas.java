package entidades;

public enum TiposDiciplinas {
	FPOO("Fundamentos de Programa��o Orientada a Objetos"),
	REDES("Redes de Computadores"),
	SO("Sistemas Operacionais"),
	LM("Linguagem de Marca��o");

	private String descri�ao;


	TiposDiciplinas(String descri�ao){
		this.descri�ao=descri�ao;
	}
	
	public String getDescri�ao() {
		return descri�ao;
	}

	
}
