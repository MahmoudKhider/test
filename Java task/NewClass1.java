
package task;
/*
*Add Avrage for Three Function items using Scanner
*/
import java.util.Scanner;


public class NewClass1 {
    static float avg(float n1, float n2, float n3){
        float Avareg,Sum=n1+n2+n3;
        Avareg=Sum/3;
        return Avareg;
    } 
    public static void main(String[]args){
        Scanner in= new Scanner(System.in);
        float x,d,e;
        System.out.println("Enter n1");
        x=in.nextFloat();
        System.out.println("Enter n2");
        d=in.nextFloat();
        System.out.println("Enter n3");
        e=in.nextFloat();
        System.out.println("Average Number ="+ avg(x,d,e));
    } 
    
}
