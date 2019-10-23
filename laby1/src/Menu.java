
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {


        ArrayList<Person> personArrayList = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        int enteredNumber;
        do {
            System.out.print(
                    "1) dodaj dane" +
                            "\n2) wyświetl" +
                            "\n3) oblicz" +
                            "\n4) koniec" +
                            "\nPodaj liczbe: "
            );
            enteredNumber = input.nextInt();
            input.nextLine();
            switch (enteredNumber) {
                case 1: {
                    System.out.print("wpisz imie: ");
                    String name = input.nextLine();

                    System.out.print("wpisz nazwisko: ");
                    String surname = input.nextLine();

                    System.out.print("wpisz wiek: ");
                    int age = input.nextInt();

                    System.out.print("wpisz wzrost: ");
                    int height = input.nextInt();

                    System.out.print("wpisz wage: ");
                    int weight = input.nextInt();
                    System.out.print("\n");

                    System.out.print("wpisz date: dzień miesiąc rok:");
                    int day = input.nextInt();
                    int month = input.nextInt();
                    int year = input.nextInt();
                    BirthdayDate date = new BirthdayDate(day, month, year);
                    System.out.print("\n");

                    personArrayList.add(new Person(name, surname, age, height, weight, date));
                    break;
                }
                case 2: {
                    int arrayLength = personArrayList.size();
                    System.out.print("Której osoby dane chcesz wyświetlić?\n Jest ich: " + arrayLength + "\n");
                    int number = input.nextInt();
                    System.out.print(personArrayList.get(number - 1).displayDataOfPerson());
                    break;
                }
                case 3: {
                    int arrayLength = personArrayList.size();
                    System.out.println("Dla której osoby chcesz poznać BMI i ilość przeżytych dni?\n Jest ich: " + arrayLength + "\n");
                    System.out.print("Podaj nr osoby: ");
                    int index = input.nextInt();
                    System.out.println("BMI: " + personArrayList.get(index - 1).obliczBMI());
                    System.out.println("Liczba przeżytych dni: " + personArrayList.get(index - 1).timeOfLivin() + "\n");

                    break;
                }

                default: {
                    System.out.println("--------");
                    break;
                }
            }

        } while (enteredNumber != 4);


    }

}