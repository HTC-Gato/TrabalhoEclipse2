package exercicio2;

import java.util.Scanner;

import modelo.Aluno;
import modelo.Telefone;

public class Principal {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in) ;
		Aluno aluno = new Aluno() ;
		aluno.telefone = new Telefone();
		Aluno[] vetor = new Aluno[2];
		
		for(int i = 0; i < vetor.legth; i++) {
		// criando os objetos
			Aluno aluno = new Aluno() ;
			aluno.telefone = new Telefone();
		
		
		System.out.println("informe o cpf:");
		aluno.cpf = scan.next();
		
		System.out.println("informe o nome:");
		aluno.nome = scan.next();
		
		System.out.println("informe a matrícula:");
		aluno.matricula = scan.next();
		
		System.out.println("informe o DDD telefone:");
		aluno.telefone.codigoArea = scan.nextInt();
		
		System.out.println("informe o numero do telefone:");
		aluno.telefone.numero = scan.next();
		
		vetor[i] = aluno;
	}
		
	//impresssao
	for (Aluno aluno : vetor)
		System.out.println();
	System.out.println(aluno.cpf);
	System.out.println(aluno.nome);
	System.out.println(aluno.matricula);
	System.out.println(aluno.telefone.codigoArea);
	System.out.println(aluno.telefone.numero);
}
}
