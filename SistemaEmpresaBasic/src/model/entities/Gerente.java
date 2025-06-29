package model.entities;

import java.time.LocalDate;

import model.enums.TipoContrato;

public class Gerente extends Funcionario{

	private double bonus;

	public Gerente(String nome, int idade, double salario, LocalDate dataContratacao, TipoContrato tipoContrato, double bonus) {
		super(nome, idade, salario, dataContratacao, tipoContrato);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public double calcularSalario() {
		return this.getSalario() + this.getBonus();	
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.getNome() +
				"\nIdade: " + this.getIdade() + 
				"\nSalario: " + this.getSalario() +
				"\nData contratação: " + this.getDataContratacao() +
				"\nTipo do contrato: " + this.getTipoContrato() +
				"\nBonus: " + this.getBonus() +
				"\nSalario calculado: " + this.calcularSalario();
	}
	
}
