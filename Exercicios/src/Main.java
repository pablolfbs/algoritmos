import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// int[] n = new int[2];
		// System.out.println("Digite dois números: ");
		// n[0] = in.nextInt();
		// n[1] = in.nextInt();
		// int soma = n[0] + n[1];
		// System.out.println("O resultado da soma é " + soma);

		// int a, b, soma, sub, mult, div;
		// System.out.println("Digite dois números: ");
		// a = in.nextInt();
		// b = in.nextInt();
		// soma = a + b;
		// sub = a - b;
		// mult = a * b;
		// div = a / b;
		// System.out.println(soma + "\n" + sub + "\n" + mult + "\n" + div);

		// float dp, tcg, cm;
		// System.out.print("Diga a distância percorrida: ");
		// dp = in.nextInt();
		// System.out.println("Diga o total de combustível gasto: ");
		// tcg = in.nextInt();
		// cm = dp / tcg;
		// System.out.println("O consumo do veículo é de " + cm + " km/l.");
		//
		//
		// String nome;
		// System.out.print("Escreva o nome do vendedor: ");
		// nome = in.next();
		// System.out.print("Qual o salário de(o) " + nome + ": ");
		// int salario = in.nextInt();
		// System.out.print("Qual o total de vendas de " + nome + "? ");
		// int totalVendas = in.nextInt();
		// System.out.print("O nome do vendedor é: " + nome + ". Seu salário é "
		// + salario + " + comissão de 15% = " + (salario + (totalVendas * 15 /
		// 100)));

		// String nome;
		// float[] nota = new float[3];
		// float media;
		// System.out.print("Digite o nome do aluno: ");
		// nome = in.nextLine();
		// System.out.print("Digite a 1ª nota: ");
		// nota[0] = in.nextInt();
		// System.out.print("Digite a 2ª nota: ");
		// nota[1] = in.nextInt();
		// System.out.print("Digite a 3ª nota: ");
		// nota[2] = in.nextInt();
		// media = (nota[0] + nota[1] + nota[2]) / 3;
		// System.out.print("A média de " + nome + " é: " + media);

		// int a, b, c;
		// System.out.print("Digite o valor de a: ");
		// a = in.nextInt();
		// System.out.print("Digite o valor de b: ");
		// b = in.nextInt();
		// c = a;
		// a = b;
		// b = c;
		// System.out.println("O valor de a é: " + a);
		// System.out.print("O valor de b é: " + b);

		// float C, F;
		// System.out.print("Digite a temperatura em graus Celsius: ");
		// C = in.nextFloat();
		// F = (9 * C + 160) / 5;
		// System.out.println("A temperatura em Farenheit é(são) " + F + "
		// graus.");

		// double real, dolar, cotacao;
		// System.out.print("Qual a cotação do dolar? ");
		// cotacao = s.nextDouble();
		// System.out.print("Qual o valor disponível? ");
		// dolar = in.nextDouble();
		// real = dolar * cotacao;
		// System.out.print("O valor convertido são R$ " + real);

		// double deposito, rendimento;
		// System.out.print("Digite o valor do depósito: ");
		// deposito = in.nextFloat();
		// double juros = deposito * 0.7 / 100;
		// rendimento = deposito + juros;
		// System.out.print("O rendimento da poupança no mês foi: R$ " +
		// rendimento);

		// double valorCompra, prestacao;
		// System.out.print("Qual o valor da compra? ");
		// valorCompra = in.nextDouble();
		// prestacao = valorCompra / 5;
		// System.out.println("Cada prestação ficou no valor de: R$ " +
		// prestacao);

		// double precoCusto, precoVenda, acrescimo;
		// System.out.print("O preço de custo do produto é: ");
		// precoCusto = in.nextDouble();
		// System.out.print("O percentual de acréscimo é: ");
		// acrescimo = in.nextDouble();
		// precoVenda = precoCusto + precoCusto * acrescimo / 100;
		// System.out.print(precoVenda);

		// System.out.print("Digite um número: ");
		// int num = in.nextInt();
		// if (num >= 20) {
		// System.out.print(num);
		// } else {
		// System.out.println("O número " + num + " é menor do que 20.");
		// }

		// int a, b;
		// System.out.print("Digite um número: ");
		// a = in.nextInt();
		// System.out.print("Digite um número diferente do primeiro: ");
		// b = in.nextInt();
		// if (a > b) {
		// System.out.println("O número " + b + " é menor.");
		// } else {
		// System.out.println("O número " + a + " é menor.");
		// }

		// int x, y;
		// System.out.print("Digite um número: ");
		// x = in.nextInt();
		// System.out.print("Digite um número diferente do primeiro: ");
		// y = in.nextInt();
		// if (x > y) {
		// System.out.println(x + "\n" + y);
		// } else {
		// System.out.println(y + "\n" + x);
		// }

		// int[] array = new int[10];
		// int i;
		// for ( i = 0; i < 10; i++) {
		// System.out.print("Digite o " + (i + 1) + "º número: ");
		// array[i] = in.nextInt();
		// }
		// System.out.print("Os números pares digitados são: ");
		// for (i = 0; i < 10; i++) {
		// if (array[i] % 2 == 0) {
		// System.out.print(array[i] + " ");
		// }
		// }
		// System.out.print("\nOs números ímpares digitados são: ");
		// for (i = 0; i < 10; i++) {
		// if (array[i] % 2 == 1) {
		// System.out.print(array[i] + " ");
		// }
		// }

		// int salHr, numHrTrab;
		// double inss = 1.10;
		// System.out.print("Digite o ganho por hora trabalhada: ");
		// salHr = in.nextInt();
		// System.out.print("Digite a quantidade de horas trabalhadas no mês:
		// ");
		// numHrTrab = in.nextInt();
		// double salBruto = salHr * numHrTrab;
		// double salLiq = salBruto - inss;
		// System.out.println("O salário bruto é " + salBruto + "\nO salário
		// líquido é " + salLiq);
		//
		//
		// String nomeFuncionario;
		// double salBruto, salLiquido, horasTrab, valorHTrab;
		// double inss = 1.10;
		// Scanner entradaDados = new Scanner(System.in);
		// System.out.println("Programa:::");
		// System.out.println("Calcula Salário Bruto e Salário Líquido");
		// System.out.print("\nEntre com o nome do Funcionário: ");
		// nomeFuncionario = entradaDados.nextLine();
		// System.out.print("Informe a Quantidade de horas Trabalhadas: ");
		// horasTrab = entradaDados.nextDouble();
		// System.out.print("Informe o valor das horas Trabalhadas: R$ ");
		// valorHTrab = entradaDados.nextDouble();
		// salBruto = (horasTrab * valorHTrab);
		// salLiquido = (salBruto - inss);
		// System.out.println("\n\n:::: Exibição dos dados
		// informados::::::::::");
		// System.out.println("Nome: "+ nomeFuncionario);
		// System.out.printf("Salário Bruto: R$ %.2f", salBruto);
		// System.out.printf("\nSalário Liquido: R$ %.2f", salLiquido);
		// System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::");
		// System.out.println("\nAutor: Moisés Tedeschi");
		// System.out.println("Fim do Programa!!!");

		// int quant, valLoc;
		// System.out.print("Digite a quantidade de vídeos da locadora: ");
		// quant = in.nextInt();
		// System.out.print("Digite o valor da locação: ");
		// valLoc = in.nextInt();
		// double fatAnual = quant * valLoc / 3 * 12;
		// System.out.println("O faturamento anual é de " + fatAnual);
		// double multa = valLoc * 10 / 100; double devAtrasada = quant / 10;
		// System.out.print("O valor arrecadado com multas é de " + (devAtrasada
		// * multa));

		
//		float[] nota = new float[3];
//		System.out.print("Digite o nome do aluno(a): ");
//		String aluno = in.next();
//		System.out.print("Digite a primeira nota: ");
//		nota[0] = in.nextFloat();
//		System.out.print("Digite a segunda nota: ");
//		nota[1] = in.nextFloat();
//		System.out.print("Digite a terceira nota: ");
//		nota[2] = in.nextFloat();
//		float media = (nota[0] + nota[1] + nota[2]) / 3;
//		System.out.print("A média do(a) " + aluno + " é: " + media +"\n");
//		if (media >= 6) {
//			System.out.print(aluno +" está aprovado. ");
//		} else if (media < 4) {
//			System.out.print(aluno +" está reprovado. ");
//		} else {
//			System.out.print(aluno +" está de recuperação. ");
//		}
		
		
//		int valor[] = new int[4];
//		int maior = 0, menor = 0;
//		for(int i = 0; i < valor.length; i++){
//			System.out.print("Digite o " + (i+1) + "º valor: ");
//			valor[i] = in.nextInt();
//			if(valor[i] > maior){
//				maior = valor[i];
//			}
//		}
//		for (int j = 0; j < valor.length; j++) {
//			if(valor[j] < menor){
//				menor = valor[j];
//			}
//		}
//		System.out.println("Maior valor = " + maior);
//		System.out.println("Menor valor = " + menor);
		
		// int a = 0, maior = 0, menor = 0;
		// for(int i = 0; i < 4; i++) {
		// System.out.println("Insira um valor: ");
		// a = in.nextInt();
		// if(i == 0) {
		// maior = a;
		// menor = a;
		// }
		// if(a > maior) {
		// maior = a;
		// }
		// if(a < menor) {
		// menor = a;
		// }
		// }
		// System.out.print("Maior: "+ maior + ". Menor: " + menor);
		//
		//
		// int a = 0, menor = 0, maior = 0;
		// for (int i = 0; i < 5; i++) {
		// System.out.print("Insira o " + (i + 1) + "º valor: ");
		// a = in.nextInt();
		// if (i == 0) {
		// maior = a;
		// menor = a;
		// } else if (a > maior) {
		// maior = a;
		// } else if (a < menor) {
		// menor = a;
		// }
		// }
		// System.out.print("Maior: " + maior + "\nMenor: " + menor);


//		int a[] = new int[4];
//		for (int i = 0; i < a.length; i++) {
//			System.out.print("Digite o " + (i + 1) + "º valor: ");
//			a[i] = in.nextInt();
//			}
//			int maior = a[0];
//			for (int i = 1; i < a.length; i++) {
//				if (a[i] > maior) {
//					maior = a[i];
//				}
//			}
//			int menor = a[0];
//			for (int i = 1; i < a.length; i++) {
//				if (a[i] < menor) {
//					menor = a[i];
//				}
//			}
//			System.out.println("Maior valor = " + maior);
//			System.out.println("Menor valor = " + menor);


//		int a, menor = 0, maior = 0;
//		for(int i = 0; i < 4; i++) {
//			System.out.print("Insira o " + (i + 1) + "º valor: ");
//			a = in.nextInt();
//			if(i == 0) {
//				menor = a;
//				maior = a;
//			} else if (a > maior) {
//				maior = a;
//			} else if (a < menor) {
//				menor = a;
//			}
//		}
//		System.out.print("Maior: " + maior + "\nMenor: " + menor);

//		int[] a = new int[3];
//		int i;
//		double soma = 0, media;
//		for (i = 0; i < a.length; i++) {
//			System.out.print("Insira o " + (i + 1) + "º valor: ");
//			a[i] = in.nextInt();
//			soma = soma + a[i];
//		}
//		media = soma / a.length;
//		System.out.println(media);


//		double[] notas = new double[3];
//		int i;
//		for (i = 0; i < notas.length; i++) {
//			System.out.print("Digite a " + (i + 1) + "ª nota: ");
//			notas[i] = in.nextDouble();
//		}
//		double maior = notas[0];
//		for (i = 1; i < notas.length; i++) {
//			if (notas[i] > maior) {
//				maior = notas[i];
//			}
//		}
//		double menor = notas[0];
//		for (i = 1; i < notas.length; i++) {
//			if (notas[i] < menor) {
//				menor = notas[i];
//			}
//		}
//		System.out.println("Maior nota: " + maior + "\nMenor nota: " + menor);
		
		
//		String s;
//		
//		do {
//			System.out.print("##### Menu #####\n\n1. Solteiro(a)\n2. Desquitado(a)\n3. Casado(a)\n"
//					+ "4. Divorciado(a)\n5. Viúvo(a)\n\n");
//			System.out.print("Digite o número de uma das opções: ");			
//			int estadoCivil = in.nextInt();
//			switch (estadoCivil) {
//				case 1:
//					s = "Solteiro(a)"; 
//					break;
//				case 2:
//					s = "Desquitado(a)";
//					break;
//				case 3:
//					s = "Casado(a)";
//					break;
//				case 4:
//					s = "Divorciado(a)";
//					break;
//				case 5:
//					s = "Viúvo(a)";
//					break;
//				default:
//					s = "Opção Inválida";
//			}
//			if (s != "Opção Inválida") {
//				System.out.print("\nVocê é " + s + ".");
//			} else {
//				System.out.print("\nVocê digitou uma " + s + ". Tente Novamente.\n\n");
//			}
//		} while (s == "Opção Inválida");
		
		
//		int dia, mes, ano;
//		System.out.print("Informe o dia: ");
//		dia = in.nextInt();
//		if (dia > 0 && dia <= 31) {
//			System.out.println(dia + "/__/____");
//		}
//		System.out.print("Informe o mês: ");
//		mes = in.nextInt();
//		if (mes > 0 && mes <= 12) {
//			System.out.println(dia + "/" + mes + "/____");
//		}
//		System.out.print("Informe o ano: ");
//		ano = in.nextInt();
//		if (ano > -10000 && ano < 10000) {
//			System.out.println(dia + "/" + mes + "/" + ano);
//		}
		
//		int result = 0;
//		for (int i = 0; i < 5; i++) {
//			if (i == 3) {
//				result = 10;
//			} else {
//				result +=i;
//			}
//		}
//		System.out.println(result);
		
//		Random rand = new Random();
//		for (int i = 0; i < 50; i++) {
//			int x = rand.nextInt(99);
//			System.out.println(x + 1);
//		}
		
		int a = 0;
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d", a);
			a++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		in.close();	
	}
	

}
