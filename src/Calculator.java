import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        double ans=0 ;
        Scanner in=new Scanner(System.in);
        while (true){
            System.out.print("enter the operator:");
            char ch=in.next().trim().charAt(0);
            System.out.println(ch);
            if(ch =='+'|| ch == '-' || ch=='/' || ch=='%' || ch=='*' ){
                System.out.println("enter the two number");
                int num1=in.nextInt();
                int num2= in.nextInt();
                if (ch=='+'){
                 ans=num1+num2;
                }
                if (ch=='-'){
                    ans =num1-num2;
                }
                if (ch=='/'){
                    if (num2!=0){
                        ans=num1/num2;
                    }


                }
                if (ch=='%'){
                    ans=num1%num2;
                }
                if (ch=='*'){
                    ans=num1*num2;
                }

            }else if (ch == 'x'||ch=='X' ){
                break;
            }else {
                System.out.print("invalid input ");
            }
            System.out.println(ans);

        }
    }
}
