package basic;

import java.util.Scanner;

public class DayCheck {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
         int day=in.nextInt();
         switch (day){
             case 1 -> System.out.println("sunday");
             case 2 -> System.out.println("monday");
             case 3 -> System.out.println("tuesday");
             case 4 -> System.out.println("wednesday");
             case 5-> System.out.println("thursday");
             case 6-> System.out.println("friday");
             case 7-> System.out.println("sturday");
             default ->  {

             }


         }
    }
}
