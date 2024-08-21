package java_test;

import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        char c = scnr.next().charAt(0);
        char[] aeiou = {'a', 'e', 'i', 'o', 'u'};
        scnr.close(); 
        //aeiou를 배열에 입력후 비교
        int i = 0;
        for(; i < 5; i++){
            if(c == aeiou[i]){
                //c가 aeiou 중에 있다면 O 출력후 빠져나온다. 
                System.out.print('O');
                break;
            }
        }   
        //for문을 끝까지 돌고 빠져나오면 X 출력
        if(i == 5){
            System.out.print('X');
        }
    }

}