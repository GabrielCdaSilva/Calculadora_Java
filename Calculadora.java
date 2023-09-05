package Aula10_FPOO;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("seja bem vindo =)");
		
		while (true) {
			System.out.print("digite o primeiro número: ");
			float num1 = scn.nextFloat();
			
			System.out.print("digite uma operação aritmética podendo serem elas (-, +, x, /): ");
			char operacao = scn.next().charAt(0);
			
			System.out.print("digite o segundo número: ");
			float num2 = scn.nextFloat();
			
			if (operacao == '-') {
				float resultado = num1 - num2;
				System.out.println("Resultado: " + resultado);
			}
			
			else if (operacao == '+') {
				float resultado = num1 + num2;
				System.out.println("Resultado: " + resultado);
			}
			
			else if (operacao == 'x') {
				float resultado = num1 * num2;
				System.out.println("Resultado: " + resultado);
			}
			
			else if (operacao == '/') {
				if (num2 != 0) {
					float resultado = num1 / num2;
					System.out.println("Resultado: " + resultado);
				}
				else {
					System.out.println("Erro: Divisão por zero!");
					continue;
				}
			}
			
			else {
				System.out.println("Erro: operador não identificado...");
			}
			
			System.out.print("deseja continuar fazendo calculos ?(s/n): ");
			char resposta = scn.next().charAt(0);
			if (resposta != 's' && resposta != 'S') {
				break;
			}
			
		}
		System.out.print("Finalisando calculadora...");
			
	}
}