package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import model.enums.TipoContrato;
import model.excecoes.DataInvalidaException;
import model.excecoes.SalarioInvalidoException;
import model.utils.FuncoesDatas;

public class Funcionario extends FuncoesDatas{

	private String nome;
	private int idade;
	private double salario;
	private LocalDate dataContratacao;
	private TipoContrato tipoContrato;
	
	public Funcionario() {
		
	}

	public Funcionario(Gerente gerente) {
		
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

	public void setDataContratacao(String dataContratacao) throws DataInvalidaException{
		LocalDate dateFormated = stringToDate(dataContratacao);
		
		LocalDate now = LocalDate.now();
		if (!dateFormated.equals(now)) {
			throw new DataInvalidaException("Data Inválida!"); 
		} else {
			this.dataContratacao = dateFormated;
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
		return "Nome: " + this.getNome() +
				"\nIdade: " + this.getIdade() + 
				"\nSalario: " + this.getSalario() +
				"\nData contratação: " + this.getDataContratacao() +
				"\nTipo do contrato: " + this.getTipoContrato();
	}
	
	
	
}
