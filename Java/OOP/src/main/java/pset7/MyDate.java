package pset7;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class MyDate {
    private int year;
    private int month;
    private int day;

    String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    int[] DAYS_IN_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public boolean isLeapYear(int year){
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    public boolean isValidDate(int year, int month, int day){
        if(year > 0 && year < 10000){
            if(month > 0 && month <= 12){
                return day > 0 && day <= DAYS_IN_MONTH[month - 1];
            }
        }
        return false;
    }

    public int getDayOfWeek(int year, int month, int day){
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        return (dayOfWeek.getValue()) % 7;
    }

    public MyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setDate(int year, int month, int day){
        if(isValidDate(year,month,day)){
            this.year = year;
            this.month = month;
            this.day = day;
        }
        else{
            throw new IllegalArgumentException("Invalid year, month, or day!");
        }
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        if(year > 0 && year < 10000){
            this.year = year;
        } else {
            throw new IllegalArgumentException("Invalid year!");
        }
    }

    public void setMonth(int month) {
        if(month > 0 && month <= 12){
            this.month = month;
        } else {
            throw new IllegalArgumentException("Invalid month!");
        }
    }

    public void setDay(int day) {
        int dayMax;

        if(isLeapYear(year) && month == 2){
            dayMax = 29;
        } else {
            dayMax = DAYS_IN_MONTH[month-1];
        }

        if(day > 1 && day <= dayMax){
            this.day = day;
        } else {
            throw new IllegalArgumentException("Invalid day!");
        }

    }

    @Override
    public String toString() {
        return String.format("%s %02d %s %04d",
                DAYS[getDayOfWeek(year, month, day)],
                day,
                MONTHS[month-1],
                year
        );
    }

    public MyDate nextDay(){
    //  MyDate date = new MyDate(year, month, day);
    //  By using date.time we are not changing the date of the whole new object.
    //  Instead, use this.year, so it will change the date
        int dayMax;

        if(isLeapYear(year) && month == 2){
            dayMax = 29;
        } else {
            dayMax = DAYS_IN_MONTH[month-1];
        }

        if(day == dayMax && month == 12 && year == 9999){
            throw new IllegalArgumentException("Invalid year!");
        } else if (day == dayMax && month == 12){
            this.day = 1;
            this.month = 1;
            this.year++;
        } else if (day == dayMax){
            this.day = 1;
            this.month++;
        } else {
            this.day++;
        }

        return this;
    }

    public MyDate nextMonth(){

        if(month == 12 && year == 9999){
            throw new IllegalArgumentException("Invalid year!");
        } else if (month == 12){
            this.month = 1;
            this.year++;
        } else {
            this.month++;
        }

        // checking if days of next month is less than this
        if((DAYS_IN_MONTH[(month-1)])<=day){
            this.day=(DAYS_IN_MONTH[(month-1)]);
        }

        return this;
    }

    public MyDate nextYear(){

        if(year == 9999){
            throw new IllegalArgumentException("Invalid year!");
        } else {
            this.year++;
        }

        if(isLeapYear(year)){
            if(29 < day)
                this.day = 29;
        } else {
            if(DAYS_IN_MONTH[month - 1] <= day){
                this.day = DAYS_IN_MONTH[month - 1];
            }
        }

        return this;
    }

    public MyDate previousDay(){

        if(day <= 1 && month <= 1 && year <= 1){
            throw new IllegalArgumentException("Invalid year!");
        } else {
            if(day > 1)
                day--;
            else {
                if(month > 1) {
                    month--;
                    int dayMax = 0;
                    if(isLeapYear(year)){
                        if(month == 2){
                            dayMax = 29;
                        }
                        else{
                            dayMax= DAYS_IN_MONTH[month-1];
                        }
                    }
                    else{
                        dayMax= DAYS_IN_MONTH[month-1];
                    }

                    this.day=dayMax;

                } else {
                    this.year--;
                    this.month = 12;
                    this.day = 31;
                }
            }
        }

        return this;
    }

    public MyDate previousMonth(){

        if(month <= 1 && year <= 1){
            throw new IllegalArgumentException("Invalid year!");
        }

        if(month <= 1){
            this.month = 12;
            this.year--;
        }
        else{
            this.month--;
        }
        if(DAYS_IN_MONTH[month - 1] < day)
            day = DAYS_IN_MONTH[month - 1];

        return this;
    }

    public MyDate previousYear(){

        if(year == 1){
            throw new IllegalArgumentException("Invalid year!");
        }

        this.year--;

        if(isLeapYear(year)){
            if(29 < day)
                day = 29;
        } else {
            if(DAYS_IN_MONTH[month - 1] <= day)
                day = DAYS_IN_MONTH[month - 1];
        }

        return this;
    }
}
