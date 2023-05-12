package entidades;

public class Livro {
	
	String nomeLivro;
	String nomeAutor;
	int anoPublicacao;
	String editora;
	int qtdDisponivel;
	
	
	public Livro(String nomeLivro,String nomeAutor,int anoPublicacao,String editora,int qtdDisponivel) {
		this.anoPublicacao=anoPublicacao;
		this.qtdDisponivel=qtdDisponivel;
		this.nomeAutor=nomeAutor;
		this.nomeLivro=nomeLivro;
		this.editora=editora;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Livro [nomeLivro=" + nomeLivro + ", nomeAutor=" + nomeAutor + ", anoPublicacao=" + anoPublicacao
				+ ", editora=" + editora + ", qtdDisponivel=" + qtdDisponivel + "]";
	}




	public int emprestar() {
	    return qtdDisponivel-1;
	}
	

	public String getNomeLivro() {
		return nomeLivro;
	}
	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}
	public String getNomeAutor() {
		return nomeAutor;
	}
	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public int getQtdDisponivel() {
		return qtdDisponivel;
	}
	public void setQtdDisponivel(int qtdDisponivel) {
		this.qtdDisponivel = qtdDisponivel;
	}
	
	
	
	

}
