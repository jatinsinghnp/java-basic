package basic;

import  java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String fruits=in.next();
        switch (fruits) {
            case "mango" -> System.out.println("mango is the king of the fruits ");
            case "banana" -> System.out.println("banana have good carbs");
            case "orange" -> System.out.println("orange are  rich in vitimine c ");
            default -> {
            }
        }
    }
}
