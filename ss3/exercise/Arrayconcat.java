package ss3.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayconcat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray, sizeArray1;
        int[] arrayOne;
        int[] arrayTwo;
        int[] concatArray;
        System.out.println("enter length array one");
        sizeArray = Integer.parseInt(scanner.nextLine());
        arrayOne = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            System.out.println("enter number " + (i + 1));
            arrayOne[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arrayOne));
        System.out.println("enter length array two");
        sizeArray1 = Integer.parseInt(scanner.nextLine());
        arrayTwo = new int[sizeArray1];
        for (int i = 0; i < sizeArray1; i++) {
            System.out.println("enter number " + (i + 1));
            arrayTwo[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arrayTwo));
        concatArray = new int[sizeArray + sizeArray1];
        for (int i = 0; i < arrayOne.length; i++) {
            concatArray[i] = arrayOne[i];
        }
        for (int i = 0; i < arrayTwo.length; i++) {
            concatArray[sizeArray+i] = arrayTwo[i];
        }
        System.out.println(Arrays.toString(concatArray));
    }
}
