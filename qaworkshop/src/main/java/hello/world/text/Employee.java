package hello.world.text;

public class Employee extends Human {
    public String position;
    public int salary;

    /*Sparametryzowany konstruktor klasy Employee, który na podstawie wartości parametrów do niego przekazanych ustawia pola wartości pól obiektu klasy Employee.
    Zauważ, że ponieważ klasa Employee dziedziczy (extends) po klasie Human, to mamy również dostęp do pó klasy Human (tylko tych public lub protected).
    Dziedzicząc po klasie Human, obiekt klasy Employee posiada cechy zadeklarowane wewnątrz niej oraz cechy klasy, po której dziedziczy (którą rozszerza - Human)
    Słowo this służy do wskazania, że operujemy na polu bieżącej klasy, nie jest to zawsze konieczne, ale w tym przypadku nazwy pól są takie same, jak nazwy
    parametrów wejściowych konstruktora, co tutaj akurat wymusza na nas użycie słowa kluczowego "this".
     */
    public Employee(String firstName, String lastName, int age, String position, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }
}
