package arquivo;

import java.io.IOException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws IOException {
		System.out.println("Seja bem-vindo ao sistema!");
		menu();
		
	}
	
	public static void menu() throws IOException {
		System.out.println("Selecione sua opção\n(1)Gravar no arquivo\t(2)Ler o arquivo\n(0)Sair");
		System.out.print(">");
		int res;
		
		Scanner leia = new Scanner(System.in);
		res = leia.nextInt();
		
		gravar grav = new gravar();
		
		switch (res) {
		case 1: {
			
			grav.gravando();
			break;
		}
		case 2: {
			break;
		}
		case 0: {
			System.out.println("Saindo...");
			System.exit(0);
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + res);
		}
			
		
		
	}
}
