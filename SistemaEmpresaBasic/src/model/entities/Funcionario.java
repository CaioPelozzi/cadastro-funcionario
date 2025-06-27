package model.entities;

import java.time.LocalDate;

import model.enums.TipoContrato;
import model.excecoes.DataInvalidaException;
import model.excecoes.SalarioInvalidoException;

public class Funcionario {

	private String nome;
	private int idade;
	private double salario;
	private LocalDate dataContratacao;
	private TipoContrato tipoContrato;
	
	public Funcionario() {
		
	}

	public Funcionario(String nome, int idade, double salario, LocalDate dataContratacao, TipoContrato tipoContrato) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
		this.dataContratacao = dataContratacao;
		this.tipoContrato = tipoContrato;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) throws SalarioInvalidoException{
		if (salario > 20000.0){
			throw new SalarioInvalidoException("Salário Inválido!");
		} else if (salario < 1000) {
			throw new SalarioInvalidoException("Salário Inválido!");
		} else {
			this.salario = salario; 
		} 
	}

	public LocalDate getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(LocalDate dataContratacao) throws DataInvalidaException{
		//tratar a data pelo método depois
		
		LocalDate agora = LocalDate.now();
		if (dataContratacao != agora) {
			throw new DataInvalidaException("Data Inválida!"); 
		} else {
			this.dataContratacao = dataContratacao;
		}
	}

	public TipoContrato getTipoContrato() {
		return tipoContrato;
	}

	public void setTipoContrato(TipoContrato tipoContrato) {
		this.tipoContrato = tipoContrato;
	}
	
	public double calcularSalario() {
		return this.getSalario();
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", idade=" + idade + ", salario=" + salario + ", dataContratacao="
				+ dataContratacao + ", tipoContrato=" + tipoContrato + "]";
	}
	
	
	
}
