package model.entities;

import model.enums.TipoContrato;
import model.excecoes.DataInvalidaException;
import model.excecoes.SalarioInvalidoException;
import model.utils.FuncoesDatas;

public class Gerente extends Funcionario{

	private double bonus;

	public Gerente(String nome, int idade, double salario, String dataContratacao, TipoContrato tipoContrato, String cargo, double bonus) throws DataInvalidaException, SalarioInvalidoException{
		super(nome, idade, salario, dataContratacao, tipoContrato, cargo);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double calcularSalario() {
		return this.getSalario() + this.getBonus();	
	}
	
	@Override
	public String toString() {
		String dataFormatada = FuncoesDatas.dateToString(this.getDataContratacao());
		return "Nome: " + this.getNome() +
				"\nIdade: " + this.getIdade() + 
				"\nSalario: " + this.getSalario() +
				"\nCargo: " + this.getCargo() +
				"\nData contratação: " + dataFormatada +
				"\nTipo do contrato: " + this.getTipoContrato() +
				"\nBonus: " + this.getBonus() +
				"\nSalario calculado: " + calcularSalario();
	}
	
}
