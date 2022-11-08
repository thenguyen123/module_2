package ss3.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxArrray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int column,row;
        int[][]arrays ;
        System.out.println("enter column");
        column=Integer.parseInt(scanner.nextLine());
        System.out.println("enter row");
        row=Integer.parseInt(scanner.nextLine());
        arrays= new int[column][row];
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.println("enter number array " +i);
                arrays[i][j]=Integer.parseInt(scanner.nextLine());

            }

        } System.out.println(Arrays.deepToString(arrays));
        int max=arrays[0][0];
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                if (max<arrays[i][j]){
                    max = arrays[i][j];
                }

            }

        }
        System.out.println("max array " +max);
    }
}
