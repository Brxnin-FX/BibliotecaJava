package entidades;
import java.util.ArrayList;
import java.util.Iterator;

public class Livro {
	
	
	String titulo;
	int qtdDisponivel;
	TiposLivros tipo;
	
	public Livro(String titulo,int qtdDisponivel,TiposLivros tipo) {
		this.qtdDisponivel=qtdDisponivel;
		this.titulo=titulo;
		this.tipo=tipo;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", qtdDisponivel=" + qtdDisponivel + ", tipo=" + tipo + "]";
	}

	
	public int emprestarLivro() {
		return qtdDisponivel-1;
		
	}

	public int devolverLivro() {
		return qtdDisponivel+1;
	}



	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getQtdDisponivel() {
		
		return qtdDisponivel;
	}


	public void setQtdDisponivel(int qtdDisponivel) {
		this.qtdDisponivel = qtdDisponivel;
	}


	
	
	
	
	

}
