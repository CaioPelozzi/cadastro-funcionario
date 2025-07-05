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
import model.utils.FuncoesDatas;

public class Program {

	public static void main(String[] args) {

		
		List<Funcionario> funcionariosList = new ArrayList<>();

		/*
		 * System.out.println("Teste ->"); String teste1 = sc.nextLine();
		 */
		FuncoesDatas FunctionsDate = new FuncoesDatas();
		/*
		 * LocalDate testeFmt = testeDate.dateToString(teste1);
		 * System.out.println(testeFmt);
		 */

		try (Scanner sc = new Scanner(System.in);) {

			int numFuncionarios;
			System.out.print("- Quantos funcionários voce deseja inserir? ");
			numFuncionarios = sc.nextInt();

			sc.nextLine();

			for (int i = 0; i < numFuncionarios; i++) {

				Funcionario funcionarios = new Funcionario();

				System.out.print("- Nome: ");
				funcionarios.setNome(sc.nextLine());

				System.out.print("- Idade: ");
				funcionarios.setIdade(sc.nextInt());
				sc.nextLine();

				System.out.print("- Tipo do contrato (EFETIVO, TEMPORARIO, ESTAGIARIO): ");
				String tipoContrato = sc.nextLine();
				funcionarios.setTipoContrato(TipoContrato.valueOf(tipoContrato));

				System.out.print("- Salário base: ");
				funcionarios.setSalario(sc.nextDouble());

				sc.nextLine();

				System.out.print("- Data da contratação (DD/MM/YYYY): ");
				String data = sc.nextLine();
				funcionarios.setDataContratacao(data);

				System.out.print("- Qual o cargo do funcionario? ");
				String cargo = sc.nextLine();

				if (cargo.equals("Gerente") || cargo.equals("GERENTE") || cargo.equals("gerente")) {

					System.out.print("Bônus: ");
					double bonus = sc.nextDouble();

					Gerente funcionarioGerente = new Gerente(funcionarios.getNome(), funcionarios.getIdade(),
							funcionarios.getSalario(), funcionarios.getDataContratacao() ,
							funcionarios.getTipoContrato(), bonus);
					
					funcionariosList.add(funcionarioGerente);
				} else {
					funcionariosList.add(funcionarios);
				}

			}

			for (Funcionario x : funcionariosList) {
				System.out.println(x);
			}

		} catch (SalarioInvalidoException e) {
			System.out.println(e.getMessage());
		} catch (DataInvalidaException e) {
			System.out.println("Data inválida, tente novamente!");
		} catch (InputMismatchException e) {
			System.out.println("Entrada não esperada, tente novamente!");
		} catch (IllegalArgumentException e) {
			System.out.println("Argumento não esperado, tente novamente!");
		} catch (DateTimeParseException e) {
			System.out.println("Data inválida, entre com o formato de data esperado!");
		}
		
		
		/*Parei por aqui, proximo passo é:
			- Metodo de formatada date para string [X]
			- Melhorar a saída com string biulder []	
			- Tratar todas as exceções [X]
		*/

	}

}
