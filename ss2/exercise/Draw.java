package ss2.exercise;

import java.util.Scanner;

public class Draw {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<3;i++){
            for(int j=0;j<7;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <=5-i-1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
