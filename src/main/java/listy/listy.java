package listy;


class Lista {
    private int[] liczby;
    private int pojemnosc;
    private int rozmiar;

    public Lista(int i) {
        this.pojemnosc = i;
        this.rozmiar = 0;
        this.liczby = new int[i];

    }

    public void dodajElement(int a) {
        System.out.println("chcesz dodać liczbę " + a);
        if (rozmiar < liczby.length) {
            liczby[rozmiar] = a;
            rozmiar++;

        } else {
            System.out.println("tablica pełna, nie dodano ostatniego elementu");
        }
        pisz();
    }

    public void pisz() {
        System.out.println("pojemność listy = " + pojemnosc);
        System.out.println("rozmiar listy = " + rozmiar);
        System.out.println("Tablica wygląda:");
        for (int i = 0; i < rozmiar; i++) {
            System.out.print(liczby[i]);
            System.out.print(" ");
        }
        System.out.println(" ");
        System.out.println(" ");
    }

    public void znajdz(int szukanaLiczba) {
        System.out.println("Liczba " + szukanaLiczba + " jest na miejscu " + znajdźLiczbęWTablicy(szukanaLiczba));
        System.out.println(" ");
        pisz();
    }

    public int znajdźLiczbęWTablicy(int a) {
        for (int i = 0; i < rozmiar; i++) {
            if (liczby[i] == a) {
                return i;
            }
        }
        return -1;
    }

    public boolean usunPierwszy(int usuwanaLiczba) {
        System.out.println("chcesz usunąć "+usuwanaLiczba);
        int temp=0;
        for(int i = 0;i<rozmiar;i++)
        {
            if (liczby[i]==usuwanaLiczba) {
                for (int a = i; a < rozmiar - 1; a++) {
                    liczby[a] = 0;
                    temp = liczby[a + 1];
                    liczby[a + 1] = liczby[a];
                    liczby[a] = temp;

                }
                rozmiar--;
                pisz();
                return true;
            }
        }
        pisz();
        return true;
    }

    public void usunPowtorzenia(){
        System.out.println("usuwasz powtózenia");


    }

}

