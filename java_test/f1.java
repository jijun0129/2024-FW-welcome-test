package java_test;

import java.util.Scanner;

public class f1 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        //fan 객체 배열 생성 후 초기화
        Fan[] fan = new Fan[3];
        for(int i = 0; i < 3; i++){
            fan[i] = new Fan();
        }
        //입력받아 값 설정
        for(int i = 0; i < 3; i++){
            String model = scnr.next();
            int price = scnr.nextInt();
            fan[i].setModel(model);
            fan[i].setPrice(price);
        }
        //값을 비교하며 최소값을 찾는다. 
        int min = Integer.MAX_VALUE;
        String ans = "null";
        for(int i = 0; i < 3; i++){
            int price = fan[i].getPrice();
            if (min > price){
                min = price;
                ans = fan[i].getModel();
            }
        }
        System.out.println(ans);
        scnr.close();
    }
    private static class Fan {
        // 인스턴스 변수
        private String model;
        private int price;
        // 생성자
        public Fan(){
        }
        // getter, setter 메서드
        public String getModel(){
            return model;
        }
        public void setModel(String model){
            this.model = model;
        }
        public int getPrice(){
            return price;
        }
        public void setPrice(int price){
            this.price = price;
        }
    }
}