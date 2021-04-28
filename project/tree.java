/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;


class Nodetree {

    int value;
    Nodetree leftchild;
    Nodetree rightchild;
  

    Nodetree(int value) {
        this.value = value;
    }
}

class TreeOp {

    Nodetree root = null;

    public void add(int value) {
        Nodetree n = new Nodetree(value);
        if (root == null) {
            root = n;
        } else {
            Nodetree i = root;
            Nodetree parent;
            while (true) {
                parent = i;
                if (value < i.value) {
                    i = i.leftchild;
                    if (i == null) {
                        parent.leftchild = n;
                        return;
                    }

                } else {

                    i = i.rightchild;
                    if (i == null) {
                        parent.rightchild = n;
                        return;
                    }
                }

            }

        }

    }

    public void delete( int value) {
        
        delete(root, value);
         
    }
    
    public Nodetree delete(Nodetree root , int key)
    {
        Nodetree i = root;
        Nodetree parent;
        while(true)
        {
            parent = i;
            if(root==null)
            {
                return  root;
            }
            if(key <i.value)
            {
                i=i.leftchild;
            }
            else
            {
                i=i.rightchild;
            }
            if(key==i.value)
            {
               
                if(i.leftchild==null)
                {
                    i.rightchild=parent.leftchild;
                }
                else if(i.rightchild==null)
                {
                    i.leftchild= parent.leftchild;
                }
                else
                {
                    
                
                }
                
            }
            
            
        }
    }


    public void Find(int value) {
        Nodetree i =root;
        
        while(value!=i.value)
        {
            if(value < i.value)
            {
                i=i.leftchild;
            }
            else
            {
                i=i.rightchild;
            }  
            
            if(i==null){
                System.out.println("NotFound");
               return;
               
            }  
              
        }
        System.out.println("Found");
    }
    
    
    public void inOrder()
    {
        printInOrer(root);
    }

    private void printInOrer(Nodetree root) {
        
        if(root!=null)
        {
            printInOrer(root.leftchild);
            
        }
    }

}

public class tree {

    public static void main(String[] args) {
        TreeOp t = new TreeOp();
        t.add(10);
        t.add(11);
        t.add(15);
        t.add(6);
        t.add(7);
        t.add(12);
        t.add(13);
        t.add(4);
        
        t.Find(12);
        t.Find(90);

    }

}
