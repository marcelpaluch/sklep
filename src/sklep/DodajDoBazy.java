package sklep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.Statement;

public class DodajDoBazy {
	public static void main(Connection c) throws IOException {
		String id, nazwa;
		/*
		 * ID moglby byc przydzielane automatycznie, jednakze zakladam
		 * ze produkty beda uporzadkowane zgodnie z jakas systematyka
		 * powiedzmy na 0 zaczynaja sie ID zabawek, na 1 ID ceramiki itp
		 * niepotrzebna kontrola typow, poniewaz robi to sama baza danych
		 */
		System.out.println("podaj ID produktu");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		id = in.readLine();
		if (Oslona.main(id) == false) {
			System.out.println("niewlasciwa wartosc");
			WyswietlMenu.main(c);
		}
		System.out.println("podaj nazwe produktu");
		in = new BufferedReader(new InputStreamReader(System.in));
		nazwa = in.readLine();
		if (Oslona.main(nazwa) == false) {
			System.out.println("niewlasciwa wartosc");
			WyswietlMenu.main(c);
		}
		String sql = "INSERT INTO public.produkty (id , nazwa) "
				+ "VALUES ("+id+", '"+nazwa+"')";
		//String sql = "DELETE FROM public.produkty";
		try {
			Statement s = c.createStatement();
			s.executeUpdate(sql);
		} catch (Exception e ) {
			System.err.println(e.getMessage());
			WyswietlMenu.main(c);
		}
		
	}
}
