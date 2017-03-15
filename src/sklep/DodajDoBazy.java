package sklep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.Statement;

public class DodajDoBazy {
	public static void main(Connection c) throws IOException {
		String id, nazwa, pomocniczy;
		double ilosc, cena;
		/*
		 * ID moglby byc przydzielane automatycznie, jednakze zakladam
		 * ze produkty beda uporzadkowane zgodnie z jakas systematyka
		 * powiedzmy na 0 zaczynaja sie ID zabawek, na 1 ID ceramiki itp
		 * niepotrzebna kontrola typow, poniewaz robi to sama baza danych
		 */
		System.out.println("podaj ID produktu");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		id = in.readLine();
		if (Oslona.tekstICyfry(id) == false) {
			System.out.println("niewlasciwa wartosc");
			WyswietlMenu.main(c);
		}
		System.out.println("podaj nazwe produktu");
		nazwa = in.readLine();
		if (Oslona.tekstICyfry(nazwa) == false) {
			System.out.println("niewlasciwa wartosc");
			WyswietlMenu.main(c);
		}
		System.out.println("podaj ilosc produktu");
		pomocniczy = in.readLine();
		if (Oslona.iloscICena(pomocniczy) == false) {
			System.out.println("niewlasciwa wartosc");
			WyswietlMenu.main(c);
		}
		ilosc = Double.parseDouble(pomocniczy);
		System.out.println("podaj cene produktu");
		pomocniczy = in.readLine();
		if (Oslona.iloscICena(pomocniczy) == false) {
			System.out.println("niewlasciwa wartosc");
			WyswietlMenu.main(c);
		}
		cena = Double.parseDouble(pomocniczy);;
		String sql = "INSERT INTO public.produkty (id,nazwa,ilosc,cena) "
				+ "VALUES ("+id+", '"+nazwa+"',"+ilosc+","+cena+")";
		// System.out.println(sql);
		//sql = "DELETE FROM public.produkty";
		try {
			Statement s = c.createStatement();
			s.executeUpdate(sql);
		} catch (Exception e ) {
			System.err.println(e.getMessage());
			WyswietlMenu.main(c);
		}
		
	}
}
