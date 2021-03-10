package entities;

public class Student {
	
	private String nomeAluno;
	private Integer numeroMatricula;
	private Double valorDaMensalidade;
	
	public Student() {
		
	}
	
	public Student(String nomeAluno, Integer numeroMatricula, Double valorDaMensalidade) {
		this.nomeAluno = nomeAluno;
		this.numeroMatricula = numeroMatricula;
		this.valorDaMensalidade = valorDaMensalidade;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public Integer getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(Integer numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	public Double getValorDaMensalidade() {
		return valorDaMensalidade;
	}

	public void setValorDaMatricula(Double valorDaMensalidade) {
		this.valorDaMensalidade = valorDaMensalidade;
	}
	
	public void descontoMensalidade(double desconto) {
		valorDaMensalidade = valorDaMensalidade - desconto;
	}
	
	public void aumentoMensalidade(double aumento) {
		valorDaMensalidade = valorDaMensalidade + aumento;
	}
	
	public String toString() {
		return "Número da Matrícula: " + numeroMatricula + " | " + "Nome do aluno(a): " + nomeAluno + " | " + "Valor da mensalidade: R$ " + String.format("%.2f",valorDaMensalidade)  + " | ";
	}
}
