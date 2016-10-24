package sklep;

import java.io.*;
import java.sql.Connection;

public class WyswietlMenu {

	public static void main(Connection conn) throws IOException {
		int wybor;
		String pomocniczy;	
		do {
			System.out.println("1. Dodaj produkt do bazy");
			System.out.println("2. Wyswietl produkty");
			System.out.println("9. Wyjscie");			
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			pomocniczy = in.readLine();
			wybor = Integer.parseInt(pomocniczy);
			switch(wybor){
				case 1:
					DodajDoBazy.main(conn);
					WyswietlMenu.main(conn);
					break;
				case 2:
					WyswietlZBazy.main(conn);
					break;
				case 9:
					System.exit(0);
					break;
				default:
					System.out.println("Niepoprawny wybor, sproboj jeszcze raz");
					break;
					}
		}
			while(wybor < 1 || wybor > 2);

	}

}
