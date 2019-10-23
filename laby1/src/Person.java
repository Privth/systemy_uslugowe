public class Person {
    //////////////// pola/////////////////////
    private String name;
    private String surname;
    private int age;
    private int height;
    private int weight;
    private BirthdayDate date;

    /////////////// konstruktor/////////////////
    public Person(String theName, String theSurname, int theAge, int theHeight, int theWeight, BirthdayDate theDate) {
        this.name = theName;
        this.surname = theSurname;
        this.age = theAge;
        this.height = theHeight;
        this.weight = theWeight;
        this.date = theDate;
    }
    ///////////////// metody//////////////////////

    public String displayDataOfPerson() {
        return "\nImie: " + this.name + "\nNazwisko: " + this.surname + "\nWiek: " + this.age + "\nWzrost: " + this.height + "\nWaga: " + this.weight +
                "\nData:" + this.date.displayBirthdayDay() + "\n\n\n";
    }

    public float obliczBMI() {
        return (float) (this.weight / ((this.height / 100) ^ 2));
    }

    public int timeOfLivin() {
        return this.date.timeOfLivin();
    }
}