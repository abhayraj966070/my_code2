import java.util.Scanner;
public class OPERATOR {
       public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
           int  a , b ;
           a= sc.nextInt();
           b= sc.nextInt();
            
        
           int sum  =  a+b ;
           int diff = a-b;
           int mul  =  a*b;
           int div  =  a/b;
           System.out.println(sum);
           System.out.println(diff);
           System.out.println(mul);
           System.out.println(div);

           if(a>b){
            System.out.println(a);
           }else{
            System.out.println(b);
           }
           sum+=10;
           System.out.println(sum);
             sc.close();

       }
    
}
