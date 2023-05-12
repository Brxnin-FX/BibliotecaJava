package entidades;

import java.util.ArrayList;

public class Usuario {
	
	String nomeUsuario;
	int idade;
	ArrayList<Livro> historico;

	
	public Usuario(String nomeUsuario,int idade) {
		historico = new ArrayList<Livro>();
		this.nomeUsuario=nomeUsuario;
		this.idade=idade;
	}
	
	public void emprestarLivro(Livro livro) {
		historico.add(livro);
	}
	
	public void listaHistorico(Usuario usuario) {
		for(Livro h: historico) {
			System.out.println(h);
		}
	}
	
	
	


	@Override
	public String toString() {
		return "Usuario [nomeUsuario=" + nomeUsuario + ", idade=" + idade + ", historico=" + historico + "]";
	}
	
	

	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	

}
