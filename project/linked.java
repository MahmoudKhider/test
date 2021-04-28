/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;


class node {

    public char value;
    public node next;

    node(char value) {
            this.value=value;
    }
}

class LinkedList {

    public node head = null;

    public void display() {

        node i = head;
        while (i != null) {
            System.out.print(i.value + " ");
            i = i.next;
        }
        System.out.println("\n");

    }
    
    
     public void search(char value) {

        node i = head;
        while (i != null) {
            if(value==i.value)
            {
                System.out.println("found");
                return;
            }
            i = i.next;
        }
         System.out.println("Not Found");

    }


    public void add(int index, char value) {

        node newNode = new node(value);

        if (index == 0) {
            newNode.next = head;
            head = newNode;

        } else {
            node i = head;
            for (int count = 0; count < index - 1; count++) {
                i = i.next;
            }

            newNode.next = i.next;
            i.next = newNode;
        }
    }

    public void delete(int index) {
        node i = head;
        for (int count = 0; count < index - 1; count++) {
            i = i.next;
        }
        node j = i.next;

        i.next = j.next;

    }

}

public class linked {

    public static void main(String[] args) {

        LinkedList l = new LinkedList();
        l.add(0, 'y');
        l.add(1, 'e');
        l.add(2, 'c');
        l.add(3, 'd');
        l.add(4, 'm');
        l.add(5, 'f');
        l.add(6, 'l');
        
        l.display();
        
        l.add(2, 'x');
        
        l.display();
        
        l.delete(5);
        
        l.display();
        
        l.search('f');
        l.search('z');
        
        
    }

}
