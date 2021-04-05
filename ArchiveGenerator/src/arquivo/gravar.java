package arquivo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class gravar {
	
	public void gravando() throws IOException {
	
		Scanner leia = new Scanner(System.in); // Instanciar Scanner para criar a fun��o de leitura na entrada.
		
		String msg;
		File verArq = new File("C:\\Users\\Public\\Documents\\infos.csv");
		
		if(verArq.exists()) { // Verifica se o arquivo existe.
			System.out.println("\nO arquivo j� existe\n");
			main.menu();
			
		}else {
			System.out.println("N�o existe arquivo");
			
			System.out.print("Digite sua mensagem: ");
			msg = leia.nextLine(); // Fun��o nextLine serve para pegar toda a linha de uma String.
			msg = msg + ";texto aleatorio";
			
			FileWriter arq = new FileWriter("C:\\Users\\Public\\Documents\\infos.csv"); // File writer cria o arquivo.
			PrintWriter escreva = new PrintWriter(arq); // Escreve os dados no arquivo indicado em -> PrintWriter(ArquivoCriadoAqui).
			
			escreva.printf("%s", msg); // Importante�!! Como no C � necessario indicar ..(%tipoVariavel", variavel) para esse caso e semelhantes.
			
			arq.close(); // Importante�!! SEMPRE � necessario fechar o arquivo para que ele grave e salve os dados.
			
			System.out.println("\nArquivo criado com sucesso!");
		}
		
		
	}
}
