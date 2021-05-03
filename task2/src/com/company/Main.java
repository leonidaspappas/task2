package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int num1 = 10;
        int num2 = 38;
        int num3 = 785;
        int num4 = 99892;

        Main main = new Main();
        System.out.println(main.digitSum(num1));
        System.out.println(main.digitSum(num2));
        System.out.println(main.digitSum(num3));
        System.out.println(main.digitSum(num4));

    }
    private int digitSum(int num){
        if(num<10){
            return num;
        }else{
            int module = 0;
            int sum = 0;
            int division = 0;
            while(num > 0)
                {
                    module= num % 10;
                    sum = sum + module;
                    num = num / 10;
                }
            return digitSum(sum);
        }
    }
}
