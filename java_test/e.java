package java_test;

import java.util.Scanner;

public class e {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int year = scnr.nextInt();
        int month = scnr.nextInt();

        if(month == 2){
            //년도가 4의 배수이지만 100의 배수는 아니거나 400의 배수인 경우
            if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
                System.out.print(29);
            }
            else{
                System.out.print(28);
            }
        }
        else if(month == 4 || month == 6 || month == 9 || month == 11){
            System.out.print(30);
        }
        else{
            System.out.print(31);
        }

        scnr.close();
    }

}