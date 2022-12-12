package pset12;

public class Leap {
    public boolean isLeapYear(int year) {
        boolean answer = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);

        return answer;
    }
}
