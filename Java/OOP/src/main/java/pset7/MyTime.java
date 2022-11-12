package pset7;

public class MyTime {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second){
        // making validation
        try {
            if((hour >= 0 && hour < 24)
                    && (minute >= 0 && minute < 60)
                    && (second >= 0 && second < 60)){
                this.hour = hour;
                this.minute = minute;
                this.second = second;
            }
        } catch (Exception IllegalArgumentException){
            System.out.println("Invalid hour, minute, or second!");
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        try {
            if(hour >= 0 && hour < 24){
                this.hour = hour;
            }
        } catch (Exception IllegalArgumentException){
            System.out.println("Invalid hour!");
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        try {
            if(minute >= 0 && minute < 24){
                this.minute = minute;
            }
        } catch (Exception IllegalArgumentException){
            System.out.println("Invalid minute!");
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        try {
            if(second >= 0 && second < 24){
                this.second = second;
            }
        } catch (Exception IllegalArgumentException){
            System.out.println("Invalid second!");
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public MyTime nextSecond(){
        MyTime time = new MyTime(hour, minute, second);
        if(time.hour == 23 && time.minute == 59 && time.second == 59){
            time.hour = 0;
            time.minute = 0;
            time.second = 0;
        }else if(time.second == 59 && time.minute == 59){
            time.minute = 0;
            time.second = 0;
            time.hour++;
        } else if(time.second == 59){
            time.minute++;
            time.second = 0;
        } else {
            time.second++;
        }
        return time;
    }

    public MyTime nextMinute(){
        MyTime time = new MyTime(hour, minute, second);
        if(time.hour == 23 && time.minute == 59){
            time.hour = 0;
            time.minute = 0;
        } else if(time.minute == 59){
            time.hour++;
            time.minute = 0;
        } else {
            time.minute++;
        }
        return time;
    }

    public MyTime nextHour(){
        MyTime time = new MyTime(hour, minute, second);
        if(time.hour == 23){
            time.hour = 0;
        } else {
            time.hour++;
        }
        return time;
    }

    public MyTime previousSecond(){
        MyTime time = new MyTime(hour, minute, second);
        if(time.hour == 0 && time.minute == 0 && time.second == 0){
            time.hour = 23;
            time.minute = 59;
            time.second = 59;
        } else if(time.minute == 0 && time.second == 0){
            time.minute = 59;
            time.second = 59;
            time.hour--;
        } else if(time.second == 0){
            time.minute--;
            time.second = 59;
        } else {
            time.second--;
        }
        return time;
    }

    public MyTime previousMinute(){
        MyTime time = new MyTime(hour, minute, second);
        if(time.hour == 0 && time.minute == 0){
            time.hour = 23;
            time.minute = 59;
        } else if(time.minute == 0){
            time.hour--;
            time.minute = 59;
        } else {
            time.minute--;
        }
        return time;
    }

    public MyTime previousHour(){
        MyTime time = new MyTime(hour, minute, second);
        if(time.hour == 0){
            time.hour = 23;
        } else {
            time.hour--;
        }
        return time;
    }
}
