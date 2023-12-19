import java.io.*;
import java.util.*;

public class Dictionary {
	public static void main(String... args) throws FileNotFoundException {

		File f = new File("dictionary.txt");
		try (Scanner sc = new Scanner(f)) {
			String line;

			if (f.exists()) {
				int i = 1;

				while (sc.hasNextLine()) {
					line = sc.nextLine();

					String[] splitLine = line.split("-");
					String[] meaning = splitLine[1].split(",");
					System.out.println("Word" + i + ": " + splitLine[0].trim());
					i++;

					for (int j = 0; j < meaning.length; j++) {
						System.out.println("Meaning" + (j + 1) + ": " + meaning[j].trim());
					}

					System.out.println();
				}
			} else

				System.out.println("Does not Exists");
		}

	}
}