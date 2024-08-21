package java_test;

import java.util.Scanner;

public class d {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        while(true){
            String strN = scnr.next();
            //trt-catch문을 이용하여 입력이 int형인지 확인
            try{
                int n = Integer.parseInt(strN);
                //int형이라면 양수인지 확인
                if(n > 0){
                    //양수라면 합을 출력하고 반복문을 빠져나온다. 
                    int sum = (n*(n+1))/2;
                    System.out.println(sum);
                    break;
                }
                else{
                    System.out.println('X');
                }
            }
            catch(NumberFormatException ex){
                System.out.println('X');
            }
        }
        scnr.close();
    }

}