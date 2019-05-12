package listy;

public class App 
{
    public static void main( String[] args )
    {
        Lista lista = new Lista(10);
        lista.pisz();
        lista.dodajElement(1);
        lista.dodajElement(2);
        lista.dodajElement(1);
        lista.dodajElement(2);
        lista.dodajElement(1);
        lista.dodajElement(2);
        lista.dodajElement(1);
        lista.dodajElement(2);
        lista.dodajElement(1);
        lista.dodajElement(2);
        lista.dodajElement(1);
        lista.znajdz(3);
        lista.znajdz(4);
        lista.usunPierwszy(3);
        lista.usunPierwszy(10);
        lista.usunPowtorzenia();
        lista.pisz();

    }

}
