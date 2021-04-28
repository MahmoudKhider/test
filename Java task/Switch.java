
package task;

import java.util.Scanner;

/**
 switch
 */
public class Switch {
     public static void main(String args[]){
         
         int x;
         Scanner in =new Scanner(System.in);
         System.out.print("Enter Number");
         x=in.nextInt();
         
      switch(x){
          case 1: 
              System.out.print("#Case1");
              break;
          case 2:
               System.out.print("#Case2");
               break;
          case 3:
               System.out.print("#Case3");
               break;
      }     
    
     }
}
