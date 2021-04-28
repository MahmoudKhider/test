/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;


class nod
{
    public char value;
    public nod next;

    public nod(char value) {
        this.value = value;
    }

}
class LinkedSt
{
   public nod head=null;
    public void insertFirst(char value)
    {
       nod newN = new nod(value);
       
       newN.next=head;
       head=newN;
        
    }
    
    public nod deleteFirst()
    {
     nod temp = head;
     head=head.next;
     return temp;
        
    }
    
    public void display()
    {
        nod i = head;
        while(i!=null)
        {
            System.out.print(i.value+" ");
            i=i.next;
        }
        System.out.println("\n");
    }
    
}

public class LinkedStack {

    public static void main(String[] args) {
       LinkedSt l = new LinkedSt();
        l.insertFirst('g');
        l.insertFirst('h');
        l.insertFirst('m');
        l.insertFirst('d');
        l.insertFirst('n');
        
        l.display();
        
        l.deleteFirst();
        l.display();
    }

}

