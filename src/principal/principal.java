package principal;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class principal {

	public static void main(String[] args) {
		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };
		String path = "D:\\usuario\\rodolfo\\Desktop\\eclipse\\workspace\\manipulacaoArquivos\\out.txt";
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			
			bw.write("----------------------------------");
			bw.newLine();
			
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}
}
