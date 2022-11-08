package ss3.exercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Value {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[]myArray;
        int size,input;
        System.out.println("enter size");
        size=Integer.parseInt(scanner.nextLine());

        myArray=new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("enter your number "+(i+1) +" ");
            myArray[i]=Integer.parseInt(scanner.nextLine());
        }
        System.out.println("my array input " + Arrays.toString(myArray));
        System.out.println("enter your choice number ");
        input=Integer.parseInt(scanner.nextLine());
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (input==myArray[i]){
                 index=i;

            }

        }if(index==-1){
            System.out.println(input +"is not include");
        }else{
            for (int i= index;i <size-1; i++) {
                myArray[i]=myArray[i+1];

            } myArray[size-1]=0;
            System.out.println(input + " is  include");
            for (int i = 0; i <size ; i++) {
                System.out.println(myArray[i]);
            }
            }

        }
    }

