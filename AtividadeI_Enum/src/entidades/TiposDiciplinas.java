package entidades;

public enum TiposDiciplinas {
	FPOO("Fundamentos de Programação Orientada a Objetos"),
	REDES("Redes de Computadores"),
	SO("Sistemas Operacionais"),
	LM("Linguagem de Marcação");

	private String descriçao;


	TiposDiciplinas(String descriçao){
		this.descriçao=descriçao;
	}
	
	public String getDescriçao() {
		return descriçao;
	}

	
}
