package ss3.exercise;

import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[]array = { 2,3,4,5,1,6,7,9};
        int min=array[0];
        for (int i = 0; i < array.length; i++) {
            if(min>array[i]) {
                min = array[i];
            }
        }
        System.out.println("min array " +min);
    }
}
