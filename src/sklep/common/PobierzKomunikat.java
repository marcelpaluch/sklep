//komunikaty zaczynam indeksowac od 1, dlatego, ze wtedy parametr i wskazuje na linie
// w pliku tekstowym w ktorej dany komunikat sie znajduje

package sklep.common;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PobierzKomunikat {

	public static void main(int i) throws IOException {
		String filePath = "C:/Users/marcel/workspace/sklep/src/sklep/resources/komunikaty.txt";
		FileReader fileReader = new FileReader(filePath);
		 BufferedReader bufferedReader = new BufferedReader(fileReader); 
		  String textLine;
		  do {
		    textLine = bufferedReader.readLine();
		    i--;
		  } while(i > 0);
		  WyswietlKomunikat.main(textLine);
		  bufferedReader.close();

	}

}
