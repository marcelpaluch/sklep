package sklep.common;

import java.io.*;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JFrame;

import sklep.views.GlowneMenuGUI;
import sklep.views.LogowanieGUI;

public class WyswietlMenu {

	public static void main(Connection conn) throws IOException, SQLException {
		//int wybor;
		//String pomocniczy;
		GlowneMenuGUI frame = new GlowneMenuGUI();
		frame.setVisible(true);
		/*do {
			PobierzKomunikat.main(4);
			PobierzKomunikat.main(5);
			PobierzKomunikat.main(6);
			PobierzKomunikat.main(7);
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			pomocniczy = in.readLine();
			wybor = Integer.parseInt(pomocniczy);
			switch(wybor){
				case 1:
					DodajDoBazy.main(conn);
					WyswietlMenu.main(conn);
				case 2:
					WyswietlZBazy.main(conn);
					WyswietlMenu.main(conn);
				case 3:
					WyszukajProdukt.main(conn);
					WyswietlMenu.main(conn);
				case 4:

					WyswietlMenu.main(conn);
				case 9:
					System.exit(0);
				default:
					PobierzKomunikat.main(8);
					}
		}
			while(wybor < 1 || wybor > 3);*/

	}

}
