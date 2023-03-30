package ex04;

import java.util.Scanner;

import ex03.Vendedor;

public class ex04 {

	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);

		int a = 0;
		int codigo;
		String nome;
		double percentualComissao, valorVenda, desconto;

		Vendedor v1 = new Vendedor();

		while (a != 3) {
			System.out.println("-- Menu --");
			System.out.println("Digite o numero para selecionar");
			System.out.println("1 - Cadastrar Vendedor");
			System.out.println("2 - Calcular Comissão");
			System.out.println("3 - Sair");
			a = l.nextInt();

			switch (a) {
			case 1:
				System.out.println("Digite o codigo do vendedor: ");
				codigo = l.nextInt();
				System.out.println("Digite o nome do vendedor: ");
				nome = l.next();
				System.out.println("Digite o percentual da comissâo do vendedor: ");
				percentualComissao = l.nextDouble();
				v1 = new Vendedor(codigo, nome, percentualComissao);
				break;
			case 2:
				System.out.println("Digite o valor da venda: ");
				valorVenda = l.nextDouble();
				System.out.println("Digite o valor do desconto: ");
				desconto = l.nextDouble();
				System.out.println(v1.imprimir(valorVenda, desconto));
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
