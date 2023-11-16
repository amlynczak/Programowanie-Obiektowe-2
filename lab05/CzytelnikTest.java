import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CzytelnikTest{
    @Test
    public void testWypiszInfo(){
        Czytelnik czyt = new Czytelnik("Adam", "Malysz", "Wielka Krokiew Zakopane");
        Ksiazka[] tmp = {
            new Ksiazka("Walter Hofer, Wiecej niz sport, wiecej niz milosc"), 
            new Ksiazka("Adam Mickiewicz, Pan Tadeusz")};
        czyt.wypozyczone = tmp;

        String expectedInfo = "Czytelnik:\nAdam Malysz\nAdres: \nWielka Krokiew Zakopane\nKsiazki wypozyczone: \nWalter Hofer, Wiecej niz sport, wiecej niz milosc\nAdam Mickiewicz, Pan Tadeusz\n";

        assertEquals(expectedInfo, czyt.wypiszInfo());
    }
}