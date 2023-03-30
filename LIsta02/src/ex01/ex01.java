package ex01;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		double num1, num2;
		int a = 0;
		Calculadora c = new Calculadora();

		System.out.println("Digite um numero");
		num1 = l.nextDouble();
		System.out.println("Digite outro numero");
		num2 = l.nextDouble();

		while (a != 5) {
			System.out.println("-- Menu --");
			System.out.println("Digite o numero para selecionar");
			System.out.println("1 - Soma");
			System.out.println("2 - Subtrair");
			System.out.println("3 - Multiplicar");
			System.out.println("4 - Dividir");
			System.out.println("5 - Sair");
			a = l.nextInt();

			switch (a) {
			case 1:
				System.out.println(c.soma(num1, num2));
				break;
			case 2:
				System.out.println(c.subtracao(num1, num2));
				break;
			case 3:
				System.out.println(c.multiplicacao(num1, num2));
				break;
			case 4:
				System.out.println(c.divisao(num1, num2));
				break;
			case 5:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Numero invalido, digite novamente");
			}
		}
	}
}
