package Loja_Vendas;

import java.util.Scanner;

public class Loja {
//Loja de vendas
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//System.out.println("Loja Vendas");
		
		boolean sair =  false;
		String continuarCompra;
		int qtdProdutos;
		double preco;
		double total;
		String output;
		double valorPago, troco;
		
		do {
			System.out.println("Deseja informar uma nova compra? S/N");
			continuarCompra = scan.next();
			
			if (continuarCompra.equalsIgnoreCase("s")) {
				
				output = "Loja vendas\n";
				System.out.println("Digite a quantidade de produtos da compra:");
				qtdProdutos = scan.nextInt();
				
				total = 0;
				
				for (int i=1; i<=qtdProdutos; i++) {
			    System.out.println("Informe preço do produto:" +i);
			    preco = scan.nextDouble();
			    total += preco;
			    
			    output += "Produto" + i+": RS"+preco+"\n";
				}
				 output += "Total: RS"+ total;
				 
		         System.out.println("Entre com o valor pago");
		         valorPago =scan.nextDouble();
		         
		         output += "Digite: RS"+ valorPago +"\n";
		         
		         troco = total - valorPago;
		         
		         output += "Troco: RS"+ troco;
		         
		         System.out.println(output);
			}else {
				sair =true;
			}
			
			
		}while(!sair);
		
		

	}

}

