package application;

import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import model.entities.Funcionario;
import model.entities.Gerente;
import model.enums.TipoContrato;
import model.excecoes.DataInvalidaException;
import model.excecoes.SalarioInvalidoException;

public class Program {

	public static void main(String[] args) {

		
		List<Funcionario> funcionariosList = new ArrayList<>();

		try (Scanner sc = new Scanner(System.in);) {

			int numFuncionarios;
			System.out.print("- Quantos funcionários voce deseja inserir? ");
			numFuncionarios = sc.nextInt();

			sc.nextLine();

			for (int i = 0; i < numFuncionarios; i++) {

				

				System.out.print("- Nome: ");
				String nome = sc.nextLine();

				System.out.print("- Idade: ");
				int idade = sc.nextInt();
				
				sc.nextLine();

				System.out.print("- Tipo do contrato (EFETIVO, TEMPORARIO, ESTAGIARIO): ");
				String tipoContrato = sc.nextLine();
				

				System.out.print("- Salário base: ");
				double salario = sc.nextDouble();
				

				sc.nextLine();

				System.out.print("- Data da contratação (DD/MM/YYYY): ");
				String data = sc.nextLine();
				

				System.out.print("- Qual o cargo do funcionario? ");
				String cargo = sc.nextLine();
				
				

				if (cargo.equals("Gerente") || cargo.equals("GERENTE") || cargo.equals("gerente")) {

					System.out.print("- Bônus: ");
					double bonus = sc.nextDouble();
					
					
					Gerente funcionarioGerente = new Gerente(nome, idade, salario, data, TipoContrato.valueOf(tipoContrato), cargo, bonus);
					
					funcionariosList.add(funcionarioGerente);
				} else {
					Funcionario funcionarios = new Funcionario(nome, idade, salario, data, TipoContrato.valueOf(tipoContrato), cargo);
					funcionariosList.add(funcionarios);
				}
				System.out.println();
			}

			for (Funcionario x : funcionariosList) {
				System.out.println(x);
			}

		} catch (SalarioInvalidoException e) {
			System.out.println(e.getMessage());
		} catch (DataInvalidaException e) {
			System.out.println("Data inválida, tente novamente!");
		} catch (InputMismatchException e) {
			System.out.println("Por favor, insira um número!");
		} catch (IllegalArgumentException e) {
			System.out.println("Por favor, insira seguindo as regras!");
		} catch (DateTimeParseException e) {
			System.out.println("Data inválida, entre com o formato de data esperado!");
		}
	}

}
