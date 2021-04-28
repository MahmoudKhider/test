
package task;
/*
Find the minmam element for three element in a finction using Scanner
*/
import java.util.Scanner;


public class NewClass {
    static int min(int n1, int n2,int n3){
       int Minmam=n1;
       if(Minmam >n2)
           Minmam= n2;
       if(Minmam >n3)
           Minmam= n3;
       return Minmam;
    }
    public static void main(String[]args){
        Scanner in =new Scanner(System.in);
           int x,f,g;
           System.out.println("Enter n1");
           x=in.nextInt();
           System.out.println("Enter n2");
           f=in.nextInt();
           System.out.println("Enter n3");
           g=in.nextInt();
        System.out.println("Minmam Number="+ min(x,f,g));
        
    }
}
