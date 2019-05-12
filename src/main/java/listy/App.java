package listy;

import java.io.FileNotFoundException;

public class App
{
    public static void main( String[] args ) throws FileNotFoundException {
        Lista lista = new Lista(10);
        lista.pisz();
        lista.dodajElement(1);
        lista.dodajElement(2);
        lista.dodajElement(3);
        lista.dodajElement(4);
        lista.dodajElement(5);
        lista.dodajElement(5);
        lista.dodajElement(4);
        lista.dodajElement(3);
        lista.dodajElement(2);
        lista.dodajElement(1);
        lista.dodajElement(11);
        lista.znajdz(3);
        lista.znajdz(4);
        lista.usunPierwszy(13);
        lista.usunPierwszy(12);
        lista.usunPowtorzenia();
        lista.Zapis("moja tablica.txt");

    }

}
