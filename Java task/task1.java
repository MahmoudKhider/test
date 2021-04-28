/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task;

import java.util.Scanner;


public class task1 {
    public static void main(String[]args){
     char l;
     int c=0;
     Scanner in =new Scanner(System.in);
    
     do{
         l=in.next().charAt(0);
         c++;}
        while(l!='g');
                  
     System.out.println("Count="+c);
             
    }
}
