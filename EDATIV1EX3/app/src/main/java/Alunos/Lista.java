package Alunos;

import Alunos.Aluno;


public class Lista{

private Aluno head;
public static int tamanho;

	public Lista(){
		head = null;
		tamanho=0;
	}
	
public boolean Vazia(){
	return tamanho==0;
}

public void AdicionarInicio(int ra,
							String nome,
							String semestre){
	Aluno novo = new Aluno(ra,nome,semestre);
	novo.next=head;
	head = novo;
	tamanho++;
	System.out.println("Aluno adicionado ao início da lista");
}

public void AdicionarFinal(int ra,
							String nome,
							String semestre){
	if (Vazia()){
		AdicionarInicio(ra,nome,semestre);
	}
	else{
		Aluno aux=head;
		while(aux.next!=null){
			aux=aux.next;
		}
		Aluno novo=new Aluno(ra,nome,semestre);
		aux.next=novo;
		tamanho++;
		System.out.println("Aluno adicionado ao fim da lista");
	}
}

public void AdicionarMeio(int ra,
							String nome,
							String semestre){
	
	if (tamanho==0){
		AdicionarInicio(ra,
			nome,
			semestre);
	}
	else if (tamanho==1){
		AdicionarFinal(ra,
			nome,
			semestre);
	}
	else{
		int i=1;
		Aluno atual= head;
		int pos=tamanho/2;
		while(i<pos){
			atual= atual.next;
			i++;
		}
		Aluno novo = new Aluno(ra,nome,semestre);
		
		novo.next = atual.next;
		//novo.next recebe a referência ao índice seguinte
		atual.next = novo;
		//colocar novo na nova vaga
		
		tamanho++;
		System.out.println("Aluno adicionado ao índice: "+ i);
	}
}

public String RemoverInicio(){
	String removido= ("\nRA: "+head.GetRA()+
		"\n nome: "+ head.GetNome()+
		"\n semestre"+ head.GetSemestre());
		
	if (tamanho>1){
		head=head.next;
	}
	else{
		head=null;
	}
	
	tamanho--;
	System.out.println("Aluno removido do Inicio da lista.");
	return removido;
}


public String RemoverFinal(){
	String removido;
	if (head.next==null){
		removido=("RA: "+head.GetRA()+
		"\n nome: "+ head.GetNome()+
		"\n semestre"+ head.GetSemestre());
		head=null;
	}
	else{
		Aluno atual=head;
		Aluno aux=head;
		while(atual.next!=null){
			aux=atual;
			atual=atual.next;
		}
		removido =("\nRA: "+atual.GetRA()+
		"\n nome: "+ atual.GetNome()+
		"\n semestre: "+ atual.GetSemestre());
		aux.next=null;
	}
	tamanho--;
	System.out.println("Aluno removido do fim da lista");
	return removido;
}

public String RemoverMeio(){
	
	String removido=null;
	Aluno atual=head;
	int i=1;
	if (tamanho==1){
		removido= RemoverInicio();
	}
	else
	if(tamanho==2){
		removido = RemoverFinal();
	}
	else{
	int pos=tamanho/2; 
		while (i<pos){
			atual=atual.next;
			i++;
		}
		removido = ("\n RA: "+atual.next.GetRA()+
		"\n nome: "+ atual.next.GetNome()+ 
		"\n semestre"+ atual.next.GetSemestre());
		
		atual.next= atual.next.next;
		
		System.out.println("Aluno removido do meio da lista."+
	"\ntamanho novo: "+ --tamanho);
	}
	
	return removido;
}



public String Percorre(){
	Aluno atual=head;
	String concat=" ";
	while(atual!=null){
		concat=concat+"\n"+("RA: "+atual.GetRA()+
		"\n nome: "+ atual.GetNome()+
		"\n semestre"+ atual.GetSemestre());
		atual=atual.next;
	}
	return concat;
}

}
