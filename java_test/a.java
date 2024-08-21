package java_test;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int abc = scnr.nextInt();

        //abc라는 세자리 수를 a, b, c로 쪼갠다. 
        int a = abc / 100;
        int c = abc % 10;
        int b = (abc % 100 - c) / 10;
        //cba 순으로 합친다. 
        int cba = c*100 + b*10 + a;

        System.out.print(cba);
        scnr.close();
    }

}