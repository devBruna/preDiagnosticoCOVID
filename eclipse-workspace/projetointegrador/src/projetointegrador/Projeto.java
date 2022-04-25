package projetointegrador;

import java.util.Scanner;

public class Projeto {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		try {

			System.out.println("Ol�, para iniciarmos, gostar�amos que se identificasse. ");
			System.out.print("Por gentileza, informe o seu nome: ");
			String nome = scan.next();

			System.out.println();

			System.out.println("Certo, " + nome
					+ "! \nSeja bem-vinds! \nAgora precisamos que informe 3 sintomas que est� sentindo, dentre os sintomas previstos abaixo. ");
			System.out.println();
			System.out.println(" 1 - Perda de Paladar ");// covid
			System.out.println(" 2 - Perda de Olfato"); // covid
			System.out.println(" 3 - Confus�o Mental"); // covid

			System.out.println(" 4 - Febre"); // covid, gripe
			System.out.println(" 5 - Cansa�o"); // covid, gripe
			System.out.println(" 6 - Dores de Cabe�a"); // covid, gripe
			System.out.println(" 7 - Dores no Corpo"); // covid, gripe

			System.out.println(" 8 - Tosse"); // covid, asma, gripe
			System.out.println(" 9 - Falta de Ar ou Dificuldade para Respirar"); // covid, gripe, asma

			System.out.println(" 10 - Chiado no Peito"); // asma
			System.out.println(" 11 - Sensa��o de Aperto no Peito ou Peito Pesado"); // asma
			System.out.println(" 12 - Respira��o R�pida e Curta"); // asma

			System.out.println(" 13 - Dor de Garganta"); // gripe
			System.out.println(" 14 - Catarro"); // gripe
			System.out.println();

			System.out.print("Digite o n�mero correspondente ao primeiro sintoma: ");
			int s1 = scan.nextInt();
			while (s1 > 14 || s1 < 1) {
				System.out.print("N�mero inv�lido! Digite novamente: ");
				s1 = scan.nextInt();
			}

			System.out.print("Digite o n�mero correspondente ao segundo sintoma: ");
			int s2 = scan.nextInt();
			while (s2 > 14 || s2 < 1 || s2 == s1) {
				System.out.print("N�mero inv�lido! Digite novamente: ");
				s2 = scan.nextInt();
			}

			System.out.print("Digite o n�mero de um terceiro sintoma: ");
			int s3 = scan.nextInt();
			while (s3 > 14 || s3 < 1 || s3 == s2) {
				System.out.print("N�mero inv�lido! Digite novamente: ");
				s3 = scan.nextInt();
			}

			int menu = 0;

			do {
				System.out.println();
				System.out.println();
				System.out.print("Digite a op��o desejada e clique 'Enter': ");
				System.out.println();
				System.out.print(" 1 - Para ver os sintomas mais comuns da Covid, Gripe e Asma. ");
				System.out.println();
				System.out.print(" 2 - Para ir direto ao resultado do pr�-diagn�stico. ");
				System.out.println();
				System.out.println(" 3 - Para encerrar o programa.");
				System.out.println();
				menu = scan.nextInt();

				if (menu == 1) {
					System.out.println("Os sintomas mais comuns para COVID s�o: ");

					System.out.println();

					System.out.println(" Perda de Paladar ");// covid
					System.out.println(" Perda de Olfato"); // covid
					System.out.println(" Confus�o Mental"); // covid

					System.out.println();
					System.out.println("A COVID pode causar tamb�m: ");
					System.out.println();

					System.out.println(" Febre"); // covid, gripe
					System.out.println(" Cansa�o"); // covid, gripe
					System.out.println(" Dores de Cabe�a"); // covid, gripe
					System.out.println(" Dores no Corpo"); // covid, gripe
					System.out.println(" Tosse"); // covid, asma, gripe
					System.out.println(" Falta de Ar ou Dificuldade para Respirar"); // covid, gripe, asma

					System.out.println();
					System.out.println("Os sintomas mais comuns para ASMA s�o: ");
					System.out.println();

					System.out.println(" Chiado no Peito"); // asma
					System.out.println(" Sensa��o de Aperto no Peito ou Peito Pesado"); // asma
					System.out.println(" Respira��o R�pida e Curta"); // asma

					System.out.println();
					System.out.println("A ASMA pode causar tamb�m: ");
					System.out.println();

					System.out.println(" Falta de Ar ou Dificuldade para Respirar"); // covid, gripe, asma
					System.out.println(" Tosse"); // covid, asma, gripe

					System.out.println();
					System.out.println("Os sintomas mais comuns para GRIPE s�o: ");
					System.out.println();

					System.out.println(" Dor de Garganta"); // gripe
					System.out.println(" Catarro"); // gripe

					System.out.println();
					System.out.println("A GRIPE pode causar tamb�m: ");
					System.out.println();

					System.out.println(" Falta de Ar ou Dificuldade para Respirar"); // covid, gripe, asma
					System.out.println(" Tosse"); // covid, asma, gripe
					System.out.println(" Falta de Ar ou Dificuldade para Respirar"); // covid, gripe, asma
					System.out.println(" Febre"); // covid, gripe
					System.out.println(" Cansa�o"); // covid, gripe
					System.out.println(" Dores de Cabe�a"); // covid, gripe
					System.out.println(" Dores no Corpo"); // covid, gripe
					System.out.println(" Tosse"); // covid, asma, gripe
					System.out.println();

				} else if (menu == 2) {

					System.out.println();
					System.out.println(
							"De acordo com a an�lise realizada pelo sistema, o resultado do seu pr�-diagn�stico �: ");
					System.out.println();

					if (s1 == 1 && s2 == 2 && s3 == 3) {
						System.out.println(
								"Alt�ssima probabilidade de ser COVID. Procure um m�dico o mais breve poss�vel!\n");
					} else if (s1 == 1 && s2 == 2 && s3 != 3) {
						System.out.println(
								"Alta probabilidade de ser COVID. Procure um m�dico para diagn�stico preciso.\n");
					} else if (s1 == 1 && s2 == 3) {
						System.out.println(
								"Alta probabilidade de ser COVID. Procure um m�dico para diagn�stico preciso.\n");
					} else if (s1 == 2 && s2 == 3) {
						System.out.println(
								"Alta probabilidade de ser COVID. Procure um m�dico para diagn�stico preciso.\n");
					} else if (s1 == 1 | s1 == 2 && s2 == 4) {
						System.out.println(
								"H� probabilidade razo�vel de ser COVID ou Gripe. Procure um m�dico para diagn�stico preciso.\n");
					} else if (s1 == 1 | s1 == 2 && s2 == 5) {
						System.out.println(
								"H� probabilidade razo�vel de ser COVID ou Gripe. Procure um m�dico para diagn�stico preciso.\n");
					} else if (s1 == 1 | s1 == 2 && s2 == 6) {
						System.out.println(
								"H� probabilidade razo�vel de ser COVID ou Gripe. Procure um m�dico para diagn�stico preciso.\n");
					} else if (s1 == 1 | s1 == 2 && s2 == 7) {
						System.out.println(
								"H� probabilidade razo�vel de ser COVID ou Gripe. Procure um m�dico para diagn�stico preciso.\n");
					} else if (s1 == 1 | s1 == 2 && s2 == 8) {
						System.out.println(
								"H� probabilidade razo�vel de ser COVID, Gripe ou Asma. Procure um m�dico para diagn�stico preciso.\n");
					} else if (s1 == 1 | s1 == 2 && s2 == 9) {
						System.out.println(
								"H� probabilidade razo�vel de ser COVID, Gripe ou Asma. Procure um m�dico para diagn�stico preciso.\n");
					} else if (s1 == 10 | s1 == 11 | s1 == 12 && s2 == 10 | s2 == 11 | s2 == 12
							&& s3 == 10 | s3 == 11 | s3 == 12) {
						System.out.println(
								"Baixa probabilidade de ser COVID. Alt�ssima probabilidade de ser ASMA. Procure um m�dico o mais breve poss�vel!\n");
					} else if (s1 == 10 | s1 == 11 | s1 == 12 && s2 == 10 | s2 == 11 | s2 == 12
							&& s3 != 10 | s3 != 11 | s3 != 12) {
						System.out.println(
								"Baixa probabilidade de ser COVID. Alta probabilidade de ser ASMA. Procure um m�dico para diagn�stico preciso.\n");
					} else if (s1 == 13 | s1 == 14 && s2 == 13 | s2 == 14) {
						System.out.println(
								"Baixa probabilidade de ser COVID. Alta probabilidade de ser GRIPE. Procure um m�dico para diagn�stico preciso.\n");
					} else if (s1 == 13 | s1 == 14 && s3 == 13 | s3 == 14) {
						System.out.println(
								"Baixa probabilidade de ser COVID. Alta probabilidade de ser GRIPE. Procure um m�dico para diagn�stico preciso.\n");
					} else if (s2 == 13 | s3 == 14 && s3 == 13 | s3 == 14) {
						System.out.println(
								"Baixa probabilidade de ser COVID. Alta probabilidade de ser GRIPE. Procure um m�dico para diagn�stico preciso.\n");
					} else {
						System.out.println("Por favor, tente novamente selecionando os sintomas em ordem diferente.\n");
					}

				} else if (menu == 3) {
					System.out.println();
					System.out.println("Fim do programa!");
					System.out.println();

				} else {
					System.out.println();
					System.out.println("Op��o inexistente. Por favor, tente novamente.");
					System.out.println();
				}

			} while (menu != 3);

		} catch (Exception e) {
			// tratar os erros
		} finally {
			if (scan != null)
				scan.close();
		}

	}
}
