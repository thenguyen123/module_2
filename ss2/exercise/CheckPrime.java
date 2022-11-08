package ss2.exercise;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number;
        int status=1;
        int number1=3;
        System.out.println("enter your  total number you want print");
        number=Integer.parseInt(scanner.nextLine());
        System.out.println("2");
        for( int count=0;count<number;){
            for (int j=2;j<=Math.sqrt(number1);j++) {
                if (number1 % j == 0) {
                    status=0;
                    break;
                }

            }
            if (status!=0){
                    System.out.println(number1);
                    count ++;

                }
status=1;
            number1++;

            }

        }
    }

