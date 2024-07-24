package function;

import java.util.Scanner;

public class LeapYearChecker {
    public boolean isLeapYear(int year){
        boolean isLeapYear = false;
        if (year % 4 ==0){
            return  !isLeapYear;
        }return isLeapYear;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Year that your want to check :");
        int year = sc.nextInt();

        LeapYearChecker lyc = new LeapYearChecker();
        boolean result = lyc.isLeapYear(year);
        System.out.println(result);
        String ans = lyc.leapYear(year,result);
        System.out.println(ans);
    }
    public String leapYear(int year,boolean result){
        return "Entered year is " + year  + " which is " + result;
    }
}
