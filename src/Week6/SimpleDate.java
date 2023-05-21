package Week6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SimpleDate {

    private int day;
    private int month;
    private int year;

    SimpleDate(int day, int month, int year){
        setDate(day,month,year);
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

    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        System.out.println("Please set current day ");
        int day = input.nextInt();
        System.out.println("Please set current month ");
        int month = input.nextInt();
        System.out.println("Please set current day ");
        int year = input.nextInt();

        SimpleDate d1 = new SimpleDate(day, month, year);
        System.out.println(d1);

    }



    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDate.of(year,month,day).atStartOfDay();

        return dtf.format(now);
    }

    private void setDate(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }
}
