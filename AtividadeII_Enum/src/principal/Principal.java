package principal;

import java.util.Scanner;

import entidades.Acervo_CadastroLivro;
import entidades.Livro;
import entidades.TiposLivros;

public class Principal {

	public static void main(String[] args) {
		Livro livro1 = new Livro("A Cabana",5, TiposLivros.Romance);
        Livro livro2 = new Livro("livro1" , 3,TiposLivros.AVENTURA);
        Livro livro3 = new Livro("Percy Jackson",10,TiposLivros.FICCAO_CIENTÍFICA);
        
        
        Scanner entrada = new Scanner(System.in);
        
        Acervo_CadastroLivro cadastro = new Acervo_CadastroLivro();
        
        cadastro.CadastrarLivro(livro1);
        cadastro.CadastrarLivro(livro2);
        cadastro.CadastrarLivro(livro3);
        
//        int n=1;
//       do {
//      System.out.println("Digite 0  para parar");
//       n = entrada.nextInt();
//       System.out.println("Digite o nome do Livro que deseja pegar");
//       String nomeLivro = entrada.next();
//       cadastro.emprestarLivro(nomeLivro);
//       }while(n != 0);
//       
//       livro2.emprestarLivro();
        
        
        
        System.out.println(livro2.toString());
        
        cadastro.verificarDisponivel(livro1);
        
        

	}

}
