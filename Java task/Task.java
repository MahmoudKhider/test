
package task;
/*
major operations using switch
*/
import java.util.Scanner;


public class Task {

   
    public static void main(String[] args) {
       String op = null;
       int a, b, result;
        System.out.println("Please Enter Two Number");
        Scanner n1=new Scanner(System.in);
        a =n1.nextInt();
        b =n1.nextInt();
        
        System.out.println("Please Enter Operation(+ - / % *)");
        Scanner n2=new Scanner(System.in);
        op=n2.nextLine();
        
        switch(op){
            case "+":
                result=a+b;
                System.out.println(result);
                break;
                
            case "-":
                result=a-b;
                System.out.println(result);
                break;
                
            case "/":
                result=a/b;
                System.out.println(result);
                break;
                
            case "*":
                result=a*b;
                System.out.println(result);
                break;
                
            case "%":
                result=a%b;
                System.out.println(result);
                break;
                
                
        }
    }  
}
