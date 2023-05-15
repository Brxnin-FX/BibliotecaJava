package entidades;

public class Diciplinas {
	
	int periodo;
	TiposDiciplinas tipo;
	
	public Diciplinas(int periodo,TiposDiciplinas tipo) {
		this.periodo=periodo;
		this.tipo=tipo;
	}

	
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	public TiposDiciplinas getTipo() {
		return tipo;
	}
	public void setTipo(TiposDiciplinas tipo) {
		this.tipo = tipo;
	}
	

}
