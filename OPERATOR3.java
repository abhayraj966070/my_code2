import java.util.Scanner;
public class OPERATOR3 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();

       int max = (a>b)?((a>c)? a:c):((b>c)?b:c);
       System.out.println(max);
       if (max % 2 == 0 ){
             System.out.println("even");
        }else{
            System.out.println("odd");
        }
        if (max > 0 && max % 2 == 0){
            System.out.println("valid number");
        }
        sc.close();

       }
    }

