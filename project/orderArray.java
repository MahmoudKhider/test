/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;


class orderA
{
    int arr[] = new int [30];
    int nele=0;
    public void add(int value)
    {
            int i;
            int k;
            for( i=0;i<nele;i++)
            {
                if(value < arr[i])
                {
                    break;
                }
            }
            
            for( k=nele;k>i;k--)
            {
                arr[k]=arr[k-1];
            }
            arr[k]=value;
            nele++;     
    }
    
    public void delete(int value)
    {
        int f= find(value);
        if (f==nele)
        {}
        else
        {
           
            for(int i=f;i<nele ;i++)
              arr[i]=arr[i+1];
        }
        nele--;
        
    }
    public int find(int value)
    {
        int lower =0 ;
        int upper =nele-1;
        int mid;
        
        while(true)
        {
            mid =(lower+upper)/2;
            if (value == arr[mid])
            {
                System.out.println("Found");
                return mid;
            }
            else if(value >mid)
            {
                lower=mid+1;
            }
            else
            {
                upper=mid-1;
            }
            if(lower==upper)
            {
                System.out.println("NotFound");
                return nele;
            }
        }
    
    }
    public void display ()
    {
        for(int i=0 ; i<nele ; i++)
            System.out.print(arr[i]+" ");
        System.out.println("\n");
    }  
    
}

public class orderArray {

    public static void main(String[] args) {
        orderA o = new orderA();
        o.add(9);
        o.add(8);
        o.add(6);
        o.add(5);
        o.add(4);
        o.add(3);
        o.add(7);
        o.add(1);
        o.add(2);
        
        o.display();
        
        o.find(2);
        o.find(1220);
        
        o.delete(2);
        o.delete(2000);
        o.display();

    }

}

