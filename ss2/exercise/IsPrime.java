package ss2.exercise;


import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        boolean flag=true;

        System.out.println("Hiển thị 100 số nguyên tố");
        System.out.println("2");
        for (int number = 3; number < 100;  number++) {

            for (int j = 2; j <=Math.sqrt(number); j++) {
                if (number % j == 0) {
                    flag = false;
                    break;
                }
            }if (flag){
                System.out.println(number);

            }

            flag=true;


        }
    }
}
