package Week6;

import java.time.LocalDateTime;

public class SimpleDate {

    private int day;
    private int month;
    private int year;

    SimpleDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day >= 0 & day < 31) {
            this.day = day;
        }
        else {
            System.out.println("Invalid day sent to setDay method");
            this.day = 0;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >= 0 & month < 12){
            this.month = month;
        }
        else{
            System.out.println("Invalid month sent to setMonth method");
            this.month = 0;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        LocalDateTime dateToday = LocalDateTime.now();
        int currentYear = dateToday.getYear();
        if (year >= 2000 & year < currentYear){
            this.year = year;
        } else {
            System.out.println("Invalid year sent to setYear method");
            this.year = 2023;
        }
    }
}
