package sklep;

public class Oslona {

	public static boolean main(String sprawdz) {
        for (int i=0; i<sprawdz.length(); i++) {
            char c = sprawdz.charAt(i);
            if (c < 0x30 || (c >= 0x3a && c <= 0x40) || (c > 0x5a && c <= 0x60) || c > 0x7a)
                return false;
        }
        return true;
	}

}
