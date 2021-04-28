
 
package project;
 

class arr
{
    int [] arr = new int [20];
    int nele=0;
    public void add(int value)
    {
       arr[nele++]=value; 
    }
    public void search(int value)
    {
        for(int i=0 ; i<nele ;i++)
        {
            if(value==arr[i])
            {
                System.out.println("found");
                return;
            }
        }
        System.out.println("NotFound");
        
    }
    public void delete (int value)
    {
        int i;
        for(i=0 ; i<nele; i++)
        {
            if(value==arr[i])
            {
                break;
            }
        }
        for(int k=i ; k<nele ;k++)
        {
            arr[k]=arr[k+1];
        }
        nele--;
    }
    
    public void display()
    {
        for(int i=0; i<nele-1 ; i++)
        System.out.print(arr[i]+"  ");
        System.out.println("\n");
    }
    
}

public class array 
{
    public static void main(String[] args) 
    {
        arr a = new arr();
        a.add(5);
        a.add(4);
        a.add(5);
        a.add(2);
        a.add(6);
        a.add(88);
        a.add(7);
        a.add(9);
        a.add(8);
        a.add(33);
        a.add(76);
        a.add(0);
        a.display();
        a.delete(4);
        a.display();

        

    }
    
}

