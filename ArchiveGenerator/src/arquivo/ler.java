package arquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ler {
	
	public void leitor() throws IOException{
	BufferedReader buffRead = new BufferedReader(new FileReader("C:\\Users\\Public\\Documents\\Texto.txt"));
	String linha = "";
	while (true) {
		if (linha != null) {
			System.out.println(linha);

		} else
			
			break;
		linha = buffRead.readLine();
	}
	buffRead.close();
	}
}
