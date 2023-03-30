package ex02;

public class Apolice {

	private int numero, idade;
	private String nome;
	private char sexo;
	private double valorAutomovel;

	public Apolice() {
		
	}

	public Apolice(int numero, String nome, int idade, char sexo, double valorAutomovel) {
		this.numero = numero;
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.valorAutomovel = valorAutomovel;
	}

	public double calcularValor() {
		double result = 0;
		if (sexo == 'm' && idade <= 25) {
			result = valorAutomovel * (10 / 100);
		} else if (sexo == 'm' && idade > 25) {
			result = valorAutomovel * (5 / 100);
		} else {
			result = valorAutomovel * (2 / 100);
		}
		return result;
	}

	public String imprimir() {
		return "Número: " + numero +
				"\nNome: " + nome + 
				"\nIdade: " + idade + 
				"\nSexo: " + sexo + 
				"\nValor automóvel: "+ valorAutomovel + 
				"\nValor Apólice: " + calcularValor();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getValorAutomovel() {
		return valorAutomovel;
	}

	public void setValorAutomovel(double valorAutomovel) {
		this.valorAutomovel = valorAutomovel;
	}

}
