package chapter13;

import java.util.*;

public class DisplayCalendars 
{
    public static void main(String[] args) 
    {
        
        //creates calendar object
        GregorianCalendar calendar = new GregorianCalendar();
        
        Scanner input = new Scanner(System.in);
        
        //promts the user for input
        System.out.println("Please enter the month as a number:");
        int month = input.nextInt();
        System.out.println("Please enter the year:");
        int year = input.nextInt();
        
        //calls upon the displayCalendar method taking in ints year and month
        displayCalendar(year, month);
        
    }
    //method that uses displayTitle method and printMonthBody method taking in both int year,month
    public static void displayCalendar(int year, int month)
    {
        displayTitle(year, month);
        printMonthBody(year, month);
    }
    //prints the calendar title, taking in int year,month
    public static void displayTitle(int year, int month)
    {
        //calls upon the getMonthName method to display which month it is and displays year
        System.out.println("\t  " + getMonthName(month) + " " + year );
        System.out.println("-------------------------------");
        System.out.println(" Sun Mon Tues Wed Thur Fri Sat");
    }
    //prints the body of the calendar
    public static void printMonthBody(int year, int month)
    {
        int startDay = getStartDay(year, month);
        int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

        int i;
        
        for (i = 0; i < startDay; i++)
            System.out.print("    ");

        for (i = 1; i <= numberOfDaysInMonth; i++) 
        {
            System.out.printf("%4d", i);
        

        if ((i + startDay) % 7 == 0)
        
            System.out.println();
        }

        System.out.println();
    }
    //uses switch to take in an int and return the month name as a string
    public static String getMonthName(int month)
    {
        String monthName = "";
        
        switch(month)
        {
            case 1: monthName = "January"; break;
            case 2: monthName = "February"; break;
            case 3: monthName = "March"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "June"; break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December"; 
            
        } 
        return monthName;
    }
    //gets start day of the year and month
    public static int getStartDay(int year, int month)
    {
        final int START_DAY_FOR_JAN_1_1800 = 3;
        
        int totalDays = getTotalNumberOfDays(year, month);
        
        return (totalDays + START_DAY_FOR_JAN_1_1800) % 7;
    }
    
    
   //calculates totall days since 1/1/1800
    public static int getTotalNumberOfDays(int year, int month)
    {
        int total = 0;
        for(int i = 1800; i < year; i++)
            if (isLeapYear(i))
                total = total + 366;
            else 
                total = total + 365;
        for (int i = 1; i < month; i++)
        {
            total = total + getNumberOfDaysInMonth(year, i);
        }
        return total;
    }
    
    public static int getNumberOfDaysInMonth(int year, int month) 
    {
        if (month == 1 || month == 3 || month == 5 || month == 7 ||
            month == 8 || month == 10 || month == 12)
                return 31;

        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;

        if (month == 2) return isLeapYear(year) ? 29 : 28;

        return 0; 
    }
    public static boolean isLeapYear(int year) 
    {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);  
    }
}
