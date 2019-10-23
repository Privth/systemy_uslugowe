public class BirthdayDate {
    private int day;
    private int month;
    private int year;

    public BirthdayDate(int theDay, int theMonth, int theYear) {
        this.day = theDay;
        this.month = theMonth;
        this.year = theYear;
    }


    public int timeOfLivin() {
        int result;
        int years = 2019 - this.year;
        int months = 12 - this.month;
        int days = 31 - this.day;
        result = years * 365 + months * 31 + days;
        return result;
    }

    public String displayBirthdayDay() {
        return this.day + "/" + this.month + "/" + this.year;
    }
}

