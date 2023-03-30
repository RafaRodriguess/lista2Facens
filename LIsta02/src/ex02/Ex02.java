package ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		int a = 0;
		int numero, idade;
		String nome;
		char sexo;
		double valorAutomovel;
		Apolice apolice = new Apolice();

		while (a != 3) {
			System.out.println("-- Menu --");
			System.out.println("Digite o numero para selecionar");
			System.out.println("1 - Criar Apólice");
			System.out.println("2 - Ver dados Apólice");
			System.out.println("3 - Sair");
			a = l.nextInt();

			switch (a) {
			case 1:
				System.out.println("Digite seu numero: ");
				numero = l.nextInt();
				System.out.println("Digite seu Nome: ");
				nome = l.next();
				System.out.println("Digite a sua idade: ");
				idade = l.nextInt();
				System.out.println("Digite o seu sexo: ");
				sexo = l.next().charAt(0);
				System.out.println("Digite o valor do seu automóvel: ");
				valorAutomovel = l.nextDouble();
				apolice = new Apolice(numero, nome, idade, sexo, valorAutomovel);
				break;
			case 2:
				System.out.println(apolice.imprimir());
				break;
			case 3:
				System.out.println("Saindo...");
				break;
			default: 
				System.out.println("Numero invalido, digite novamente: ");
			}
		}
	}
}
