package model.entities;

import java.time.LocalDate;

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
	private String cargo;
	
	public Funcionario() {
		
	}

	public Funcionario(Gerente gerente){
		
	}
	
	public Funcionario(String nome, int idade, double salario, String dataContratacao, TipoContrato tipoContrato, String cargo) throws DataInvalidaException, SalarioInvalidoException{
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
		LocalDate dataContrat = FuncoesDatas.stringToDate(dataContratacao);
		this.dataContratacao = dataContrat;
		this.tipoContrato = tipoContrato;
		this.cargo = cargo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
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

	public void setSalario(double salario) {
			this.salario = salario; 
	}

	public LocalDate getDataContratacao() {
		return dataContratacao;
	}
	
	public TipoContrato getTipoContrato() {
		return tipoContrato;
	}

	public void setTipoContrato(TipoContrato tipoContrato) {
		this.tipoContrato = tipoContrato;
	}
	
	@Override
	public String toString() {
		String dataFormatada = FuncoesDatas.dateToString(this.getDataContratacao());
		return "Nome: " + this.getNome() +
				"\nIdade: " + this.getIdade() + 
				"\nSalario: " + this.getSalario() +
				"\nCargo: " + this.getCargo() +
				"\nData contratação: " + dataFormatada +
				"\nTipo do contrato: " + this.getTipoContrato() + "\n";
	}
	
	
	
}
