package ss1.exercise;

import java.util.Scanner;

public class convert {
    static void MyNumber(String a,int b,int c) {
      int d=b-c;
        switch (d) {

            case 0:
                System.out.println(a + " ");
                break;
            case 1:
                System.out.println(a + " -one");
                break;
            case 2:
                System.out.println(a + " -two");
                break;
            case 3:
                System.out.println(a + " -three");
                break;
            case 4:
                System.out.println(a + " -four");
                break;
            case 5:
                System.out.println(a + " -five");
                break;
            case 6:
                System.out.println(a + " -six");
                break;
            case 7:
                System.out.println(a + "-seven");
                break;
            case 8:
                System.out.println(a + " -eight");
                break;
            case 9:
                System.out.println(a + " -nine");
                break;

        }


    }

        public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number;
        System.out.println("enter number");
        number=Integer.parseInt(scanner.nextLine());
if (number<=10) {
    switch (number) {
        case 1:
            System.out.println(  "one");
            break;
        case 2:
            System.out.println("two");
            break;
        case 3:
            System.out.println("three");
            break;
        case 4:
            System.out.println("four");
            break;
        case 5:
            System.out.println("five");
            break;
        case 6:
            System.out.println("six");
            break;
        case 7:
            System.out.println("seven");
            break;
        case 8:
            System.out.println("eight");
            break;
        case 9:
            System.out.println("nine");
            break;
        case 10:
            System.out.println("ten");
            break;
    }
}else if (number>10 &&number<20) {
    int number1 = number - 10;

    switch (number1) {

        case 1:
            System.out.println("eleven");
            break;
        case 2:
            System.out.println("twelve ");
            break;
        case 3:
            System.out.println("thirteen");
            break;
        case 4:
            System.out.println("fourteen");
            break;
        case 5:
            System.out.println("fifteen");
            break;
        case 6:
            System.out.println("sixteen");
            break;
        case 7:
            System.out.println("seventeen");
            break;
        case 8:
            System.out.println("eighteen");
            break;
        case 9:
            System.out.println("nineteen");
            break;

    }
} else if(number>=20&&number<30){
        MyNumber("twenty",number,20);
}else if(number>=30&&number<40){
    MyNumber("thirty",number,30);
}else if(number>=40&&number<50) {
    MyNumber("forty", number, 40);
}else if(number>=50&&number<60) {
    MyNumber("fifty", number, 50);
}else if(number>=60&&number<70) {
    MyNumber("sixty", number, 60);
}else if(number>=70&&number<80) {
    MyNumber("seventy", number, 70);
}else if(number>=80&&number<90) {
    MyNumber("eighty", number, 80);
}else if(number>=90&&number<100) {
    MyNumber("ninety", number, 90);
}else if (number>100&&number<110){
    MyNumber("one hundred and",number,100);
} else if (number==100) {
    System.out.println("one hundred ");
} else if(number>=110&&number<120){
    int numberHundred = number - 110;

    switch (numberHundred) {
        case 0:
            System.out.println("one hundred and ten");
break;
        case 1:
            System.out.println("one hundred and eleven");
            break;
        case 2:
            System.out.println("one hundred and twelve ");
            break;
        case 3:
            System.out.println("one hundred and thirteen");
            break;
        case 4:
            System.out.println("one hundred and fourteen");
            break;
        case 5:
            System.out.println("one hundred and fifteen");
            break;
        case 6:
            System.out.println("one hundred and sixteen");
            break;
        case 7:
            System.out.println("one hundred and seventeen");
            break;
        case 8:
            System.out.println("one hundred and eighteen");
            break;
        case 9:
            System.out.println("one hundred and nineteen");
            break;

    }
}else if (number>=120&&number<130){
    MyNumber("one hundred and twenty",number,120);
}
    }
}

