package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entities.Funcionario;
import model.excecoes.SalarioInvalidoException;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Funcionario> funcionarios = new ArrayList<>();
		
		try {
			
			int numFuncionarios;
			System.out.print("- Quantos funcionários voce deseja inserir? ");
			numFuncionarios = sc.nextInt();
			
			for(int i = 0; i < numFuncionarios; i++) {
				
				System.out.print("- Nome: ");
				String nome = sc.nextLine();
				
				System.out.print("- Tipo do contrato (EFETIVO, TEMPORARIO, ESTAGIARIO): ");
				String tipoContrato = sc.nextLine();
				
				System.out.print("- Salário base: ");
				double salario = sc.nextDouble();
				
				sc.nextLine();
				
				System.out.print("Qual o cargo do funcionario? ");
				String cargo = sc.nextLine();
				
				if(cargo == "Gerente" || cargo == "GERENTE" || cargo == "gerente") {
					System.out.print("Bônus: ");
					double bonus = sc.nextDouble();
				} 
				//parei aqui, falta a data de contrato, com isso formatar a data no método.
				sc.nextLine();
				
				
				
			}
			
		} catch (SalarioInvalidoException e) {
			System.out.println(e.getMessage());
		}

	}

}
