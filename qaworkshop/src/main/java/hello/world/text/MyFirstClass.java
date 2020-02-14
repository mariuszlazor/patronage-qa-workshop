package hello.world.text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyFirstClass {
    //Deklaracja statycznej metody niezwracającej żadnego typu danych - metoda statyczna to taka, do wywołania której nie potrzebujemy tworzyć obiektu.
    // Metoda przyjmuje na wejściu jeden parametr typu tekstowego i wypisuje jego wartość w konsoli.
    public static void test(String text) {
        System.out.println(text);
    }

    /* Deklaracja metody main, która jest domyślnie uruchamianą metodą klasy. Zawsze przyjmuje ona na wejściu tablicę parametrów String - są to parametry,
   które moglibyśmy podać z poziomu konsoli.
    */
    public static void main(String[] args) {
        //Wypisanie tekstu w konsoli
        System.out.println("Hello World from main");

        //Wywołanie metody test() z przekazanym argumentem w postaci tekstu.
        test("first param");
        test("second param");

        //Utworzenie pustego obiektu klasy Human przy użyciu domyślnego konstruktora
        Human human = new Human();

        //Ustawienie wartości pól wewnątrz utworzonego obiektu
        human.firstName = "Jan";
        human.lastName = "Kowalski";
        human.age = 1;

        //Wypisanie w konsoli wartości pól obiektu klasy Human
        System.out.println(human.firstName);
        System.out.println(human.lastName);
        System.out.println(human.age);

        //Utworzenie obiektu klasy Human przy użyciu zadeklarowanego w tamtej klasie sparametryzowanego konstruktora,
        //dzięki czemu od razu tworzymy obiekt wypełniony danymi
        Human human1 = new Human("Marcin", "Nowak", 2);
        System.out.println("Imię: " + human1.firstName + ", Nazwisko: " + human1.lastName + ", Wiek: " + human1.age);

        //Utworzenie obiektu klasy Employee przy użyciu zadeklarowanego w tamtej klasie sparametryzowanego konstruktora
        Employee employee = new Employee("Jan", "Kowalski", 30, "QA Engineer", 3000);
        System.out.println("Imię: " + employee.firstName + ", Nazwisko: " + employee.lastName + ", Wiek: " + employee.age + ", Stanowisko: " + employee.position + ", Wynagrodzenie: " + employee.salary);

         /*Deklaracja zmiennej typu Integer będącej typem obiektówym przechowującym liczby całkowite - typ obiektowy różni się od prostego (int) m.in.
        tym, że dla tego typu mamy dostęp do szeregu operacji, możemy go np. skonwertować do typu String
         */
        Integer x =1 ;

        //-2 147 483 648 do 2 147 483 647
        int y = 1;

        //Deklaracja zmiennej typu String, do której przypisana jest od razu wartość zmiennej typu Integer skonwertowana do typu String//
        String firstName = x.toString();

        //Wypisanie tekstu w konsoli
        System.out.println(x);
        System.out.println(y);

        //od -128 do 127
        byte byteNumber = 127;

        //od -32 768 do 32 767
        short shortNumber = 32767;

        //od -2^63 do (2^63)-1
        long longNumber = 5000000;

        //max ok 6-7 liczb po przecinku
        float floatNumber = 23.1219868768111f;

        //max ok 15 cyfr po przecinku
        double doubleNumber = 23.1219868768111;

        //Deklaracja zmiennej przechowującej pojedynczy znak
        char singleChar = 's';

        //Deklaracja zmiennej typu logicznego - może przechowywać tylko wartości true/false
        boolean trueOrFalse = true;

        //Deklaracja tablicy jednowymiarowej przechowującej dane typu int - deklarując tablicę musimy podać jej rozmiar, elementów z tablicy nie da się usuwać
        //oraz nie da się dodawać nowych
        int[] array = new int[10];
        //Wypisanie zawartości tablicy
        System.out.println(Arrays.toString(array));
        //Przypisanie wartości do konretnych elementów tablicy - podajemy numer indeksu, który jest liczony od 0
        array[0] = 1;
        array[6] = 8;
        System.out.println(Arrays.toString(array));

        int[] bigArray = new int[1000];
        for (int i=0; i<1000; i++) {
            bigArray[i] = i+1;
        }
        System.out.println(Arrays.toString(bigArray));

        //Iterowanie po tablicy i przypisywanie wartości iteratora "i" konkretnym elementom tablicy
        for (int i=0; i<bigArray.length; i++ ) {
            System.out.println(bigArray[i]);
        }

        //Iterowanie po tablicy przy użyciu pętli "foreach" - pętla jest wykonywana dla każdego elementu tablicy, który jest przypisywany
        //do zmiennej "element", a następnie przy użyciu instrukcji warunkowej "if" sprawdzamy jego podzielność ez reszty przez 2 i 3
        for (int element: bigArray) {
            if (element%2 == 0) {
                System.out.println("Liczba " + element + " jest parzysta");
            } else if(element%2 != 0 && element%3 == 0){
                System.out.println("Liczba " + element + " jest podzielna bez reszty przez 3");
            } else {
                System.out.println("Liczba " + element + " nie jest parzysta i nie jest podzielna bez reszty przez 3");
            }
        }

        //Deklaracja obiektu listy, która przechowuje dane typu String, przykładowe operacje na liście
        List<String> lista = new ArrayList<>();
        lista.add("Jan");
        lista.remove(0);
        lista.remove("Jan");
        String imie = lista.get(0);
    }

}
