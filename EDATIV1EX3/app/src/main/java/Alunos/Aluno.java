
package Alunos;

public class Aluno {
private int ra;
private String nome;
private String semestre;
public Aluno next;


public Aluno (int ra, 
			String nome, 
			String semestre){
	this.ra = ra;
	this.nome= nome;
	this.semestre = semestre;
	this.next=null;
}

public int GetRA(){
	return this.ra;
}
public String GetNome(){
	return this.nome;
}
public String GetSemestre(){
	return this.semestre;
}

public void SetRA(int input){
	this.ra = input;
}
public void SetNome(String input){
	this.nome = input;
}
public void SetSemestre(String input){
	this.semestre = input;
}
}
