
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        this.day++;
        if (this.day > 30) {
            this.month++;
            this.day = 0;
        }
        if (this.month > 12) {
            this.year++;
            this.month = 1;
        }
        if (this.day == 0) {
            this.day = 1;
        }
    }

    public void advance(int howManyDays) {
        for (int i = 1; i <= howManyDays; i++) {
            advance();
        }
    }

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        newDate.advance(days);


        return newDate;
    }
}
