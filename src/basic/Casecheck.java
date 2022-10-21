package basic;

import  java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char ch=in.nextLine().trim().charAt(0);
        System.out.println(ch);

        if (ch>='a' && ch<='z'){
            System.out.println("Lower Case ");

        }else {
            System.out.println("Upper case ");
        }
    }
}
