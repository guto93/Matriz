package matriVetor;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
	
		
				
				Scanner sd = new Scanner(System.in);
			
				System.out.print("Entre com quantidade de linhas: ");
				int linha = sd.nextInt();
				
				System.out.print("Entre com quantidade de colunas: ");
				int coluna = sd.nextInt();
				
				int [][] vetores = new int [linha][coluna];
				
			
				System.out.println("Adicione valores a essa coluna");
				for(int i=0; i<vetores.length; i++) {
					for(int j=0; j <vetores[i].length; j++) {
						System.out.print("Valor da Linha : " + i + " " + j + " " );
						vetores[i][j] = sd.nextInt();	
					}	
					System.out.println();
				}
				System.out.println("Veja sua Matriz ");
			   
				for(int f=0; f<vetores.length; f++) {
					for(int e=0; e<vetores[f].length; e++) {
						System.out.print(vetores[f][e] + "-");
					}
					
					System.out.println();
				}
				

				sd.close();
			}
		}





