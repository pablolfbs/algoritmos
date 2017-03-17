import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String matricula, nome;
		int hrsTrabMes, hrDiurna, hrNoturna, qtHrsExtras, qtHrsExtrasDiurnas,
		qtHrsExtrasNoturnas;
		double sal, gratif, totCred, faltas, inss, impRenda,
		impSind, totDeb, salFam, liq;
		int medico = 120, dentista = 120, jornalista = 150, operCinematografico = 150,
		telefonista = 180, operComputador = 180, escriturario = 220, servente = 220,
		vigilante = 220; 
		
		System.out.print("Digite o nome do funcionário: ");
		nome = in.nextLine();
		System.out.print("Qual o salário de " + nome + ": ");
		sal = in.nextDouble();
		System.out.print("Qual a gratificação de " + nome + ": ");
		gratif = in.nextDouble();
		gratif = sal * gratif / 100;
		System.out.println(gratif);
		
		System.out.println("Quantas horas trabalhou " + nome + ": ");
		hrsTrabMes = in.nextInt();
		System.out.println("O salário de " + nome + " é: ");
		sal = in.nextDouble();
		int hrExtra = sal / hrsTrabMes;
		System.out.println(hrExtra);
		if (hrDiurna = qtHrsExtrasDiurnas) {
			hrDiurna = hrDiurna * 2;
		} else if ( hrNoturna = qtHrsExtrasNoturnas) {
			hrNoturna = qtHrsExtrasNoturnas + (hrNoturna * 120 / 100);
			
		}
		hrExtra = hrDiurna + hrNoturna;
		
	}

}
