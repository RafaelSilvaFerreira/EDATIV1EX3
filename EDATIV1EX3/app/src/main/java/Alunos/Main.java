package Alunos;
import java.util.Scanner;

public class Main {

	static int reg;
	static String nome;
	static String semestre;
	static int pos;
	static boolean ainda = true;

public static void main(String[] args) {

	Lista ex =new Lista();
	Scanner input = new Scanner(System.in);
	
	System.out.println("Lista de Alunos"+
		"\n\t1-Checar se a lista está Vazia"+
		"\n\t2-Adicionar item ao início da lista"+
		"\n\t3-Adicionar item ao final da lista"+
		"\n\t4-Adicionar item ao meio da lista"+
		"\n\t5-Remover item do início da lista"+
		"\n\t6-Remover item do final da lista"+
		"\n\t7-Remover item do meio da lista"+
		"\n\t8-Exibir lista"+
		"\n\t9-Finalizar programa");
		
	int opt=0;
	
	
	
	while (ainda){
	System.out.println("O que deseja fazer?");
	opt = input.nextInt();
	reg =0;
	nome = null;
	semestre = null;
	pos=0;
	
	
	switch (opt){
		case 1: 
	if(ex.Vazia()){
		System.out.println("sim");
	}
	else {
		System.out.println("não");
	}
		break;
		
		case 2:
	PedeDados(input);
	ex.AdicionarInicio(reg, nome, semestre);
		break;
		
		case 3:
	PedeDados(input);
	ex.AdicionarFinal(reg,nome, semestre);
		break;
		
		case 4: 
	PedeDados(input);
	ex.AdicionarMeio(reg,nome,semestre);
		break;
		
		case 5:
	if(ex.Vazia()){
		System.out.println("Lista vazia!");
	}
	else {
		System.out.println(ex.RemoverInicio());
	}
		break;

		case 6:
	if(ex.Vazia()){
		System.out.println("Lista vazia!");
	}
	else {
		System.out.println(ex.RemoverFinal());
	}
		break;
		
		case 7:
	if(ex.Vazia()){
		System.out.println("Lista vazia!");
	}
	else {
		System.out.println("removido:"+
		ex.RemoverMeio()
		);
	}
		break;
		
		case 8:
	System.out.println(ex.Percorre());
		break;
		
		case 9:
	ainda = false;
	System.out.println("Programa finalizado.")
		break;
		
		default:
	System.out.println("Seleção inválida!");
		break;
		
		}
	}
	input.close();
}
public static void PedeDados(Scanner input){
	System.out.print("Insira o RA:");
	do{
		if (!input.hasNextInt()){
			input.next();
			System.out.print("Entrada inválida!"+
			"\nInsira o RA:");
		}
		else{
			reg= input.nextInt();
		}
	}while (reg==0);
	
	System.out.print("Insira o nome do aluno:");
		nome = input.next();
	System.out.print("Insira o semestre:");
		semestre = input.next();
}


}

/*

Lista de Alunos
	1-Checar se a lista está Vazia
	2-Adicionar item ao início da lista
	3-Adicionar item ao final da lista
	4-Adicionar item a um índice
	5-Remover item do início da lista
	6-Remover item do final da lista
	7-Remover item em um índice
	8-Exibir lista
O que deseja fazer?
1
sim
O que deseja fazer?
2
Insira o RA:1
Insira o nome do aluno:a
Insira o semestre:primeiro
Aluno adicionado ao início da lista
O que deseja fazer?
1
não
O que deseja fazer?
3
Insira o RA:2
Insira o nome do aluno:b
Insira o semestre:segundo
Aluno adicionado ao fim da lista
O que deseja fazer?
4
Insira o RA:3
Insira o nome do aluno:c
Insira o semestre:terceiro
Aluno adicionado ao índice: 1
O que deseja fazer?
5
Aluno removido do Inicio da lista.

RA: 1
 nome: a
 semestreprimeiro
O que deseja fazer?
6
Aluno removido do fim da lista

RA: 2
 nome: b
 semestre: segundo
O que deseja fazer?
7
Aluno removido do Inicio da lista.
removido:
RA: 3
 nome: c
 semestreterceiro
O que deseja fazer?
*/