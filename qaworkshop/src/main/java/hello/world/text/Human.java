package hello.world.text;

public class Human {
    /*Utworzenie publicznego pola typu String:
    - public - pole jest dostępne wewnątrz danej klasy oraz dla wszystkich innych klas
    - protected - pole lub metoda jest dostępne obiektów danej klasy oraz obiektów klas po niej dziedziczących (rozszerzających ją)
    - private - pole/metoda jest dostępne tylko wewnątrz danej klasy
    - String - informujemy, że przechowujemy w tym obiekcie dane tekstowe (ciąg znaków);
     */
    protected String firstName;
    protected String lastName;
    protected int age;

    /* Deklaracja niesparametryzowanego konstruktora klasy, który tworzy pusty obiekt klasy (w środku nie mamy żadnych instrukcji). Tak wygląda domyślny
   konstruktor klasy, do którego mamy dostęp, jeżeli w klasie nie zdefiniujemy żadnego konstruktora
    */
    public Human() {
    }

    /*Daklaracja metody będącej konstruktorem danej klasy (zwraca obiekt danej klasy) - w poniższym przykładzie mamy deklarację
    konstruktora przyjmującego parametry wejściowe, na podstawie których ustawiane są wartości pól tworzonego obiektu - tworzony obiekt
    nie jest pusty, jak przy użyciu domyślnego konstruktora, tylko wypełniony danymi
     */
    public Human(String fN, String lN, int a) {
        this.firstName = fN;
        this.lastName = lN;
        this.age = a;
    }
}
