package ss3.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("add value");
        int[]myArray={1,2,8,9,7,0,0,0};
        int input;

        System.out.println("enter number");
        input=Integer.parseInt(scanner.nextLine());
        System.out.println("enter index");
        int index=Integer.parseInt(scanner.nextLine());
        if (index<=-1||index>= myArray.length){
            System.out.println("index is not find");

        }else {
            for (int i = 5; i > index; i--) {
                myArray[i] = myArray[i - 1];
            }
            myArray[index] = input;
            System.out.println("my array input " + Arrays.toString(myArray));
        }

    }
}
