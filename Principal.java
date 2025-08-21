package exercicio2;

import java.util.Scanner;

import modelo.Aluno;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in) ;
		Aluno aluno = new Aluno() ;
		
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
		
		System.out.println(aluno);
		
	}
	
}
