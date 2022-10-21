package come.jatin;
import  java.util.Scanner;
public  class Main{
    public  static  void  main(String[] args){
//       int a,b,sum;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the first number ");
//        a=sc.nextInt();
//        System.out.println("enter the second integer ");
//        b=sc.nextInt();
//        sum=a+b;
//        System.out.println("sum="+ sum);
//        System.out.println("नमस्कार");
//        byte b=42;
//        char c='A';
//        short s=1042;
//        int i =5000000 ;
//        float f=200;
//        double d=0.1374;
//        double result=(f*b)+(i/c)-(d-s);
//        System.out.println(result);
//
//       int n=1;
//       while (n!=5){
//           System.out.println(n);
//           n++;
//       }

        System.out.println("enter the temprature in celcus");
        Scanner sc=new Scanner(System.in);
        float tempratureC=sc.nextFloat();
        float tempF=(tempratureC*9/5)+32;
        System.out.println(tempF);
        int  n=1;
      do {
          System.out.println("hello world ");
          n++;
      }while (n!=5);
    }
}