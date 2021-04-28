
package task;
/*
 to Add/ total number of items in mEthod
 */
public class NewClass2 {
    static int sum(int...n){
        int s=0;
        for(int i:n){
            s=s+i;
        }
        return s;
    }
    public static void main(String[]args){
        System.out.println("Sum =" +sum(5,6,8,10));
    } 
    
}
