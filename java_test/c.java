package java_test;

import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int age = scnr.nextInt();
        int height = scnr.nextInt();

        if(age < 14 && height < 160){
            System.out.print('O');
        }
        else{
            System.out.print('X');
        }

        scnr.close();
    }
}