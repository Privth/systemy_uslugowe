import java.time.LocalDate;


public class BirthdayDate {
    private int day;
    private int month;
    private int year;

    public BirthdayDate(int theDay, int theMonth, int theYear) {
        this.day = theDay;
        this.month = theMonth;
        this.year = theYear;
    }

    public void displayBrithdayDate() {
        System.out.print("Data urodzenia to: " + this.day + "-" + this.month + "-" + this.year);
    }


}

