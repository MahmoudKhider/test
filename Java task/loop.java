
package task;

import java.util.Scanner;

/**
 loop using Scanner By the letter
 */
public class loop {
    public static void main(String[] arges){
      char l='a';
      int c=0;
      Scanner in=new Scanner(System.in);
        while(l!='g'){
        l=in.next().charAt(0);
        c++;
    }
    }
}
