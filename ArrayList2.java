/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllArrayList;
import java.util.*;
/**
 *
 * @author LOTHIN
 */
public class ArrayList2 {

    static Scanner cin=new Scanner(System.in);
    static int k=0;
    public static ArrayList<Integer> arr=new ArrayList();
    public static void add(){
        System.out.print("Enter Number =");
        int n=cin.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter Array["+k+"]=");
            arr.add(cin.nextInt());
            k++;
        }
        System.out.println("Data Added");
    }

    public static void insert()
    {
        System.out.print("Enter Number to Insert =");
        int n=cin.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter Array["+k+"]=");
            arr.add(cin.nextInt());
            k++;
        }
        System.out.println("Data Added");
    }
    public static void delete(){  
        int index;
        do{
            System.out.print("Enter Index To Remove:");
            index =cin.nextInt();
        }while(!(index>0&&index<arr.size()));
        arr.remove(index);
        System.out.println("Data Deleted");
    }
    public static void update(){  
        System.out.print("Input Index To Update:");
        arr.remove(cin.nextInt());
        System.out.print("Input New Number:");
        arr.add(cin.nextInt());
        System.out.println("Data Updated");
        
    }
    
    
    public static void display(){
        System.out.println("Display Data:");
        for(int i=0;i<arr.size();i++){
            System.out.println("a["+i+"]="+arr.get(i));
        }
    }
    
    public static void sort(){
        Collections.sort(arr);
        System.out.println("Data Sorted");
        System.out.println("Display Data:");
        for(int i=0;i<arr.size();i++){
            System.out.println("a["+i+"]="+arr.get(i));
        }
    }
    
    public static void search(){
        boolean t=false;
            System.out.print("Search:");
            int search=cin.nextInt();
            for(int j=0;j<=arr.size();j++)
            {
                if(search==arr.get(j))
                {
                    t=true;
                    break;
                }
            }
            if(t!=true)
                System.out.println("Not Found");
                        
            
            else
                System.out.println("Found");
   
    }
    public static void main(String[] args) {
               int n;
        OUTER:
        do {
            System.out.print("LOTHIN");
            System.out.println("\nArray Operator:\n");
            System.out.println("\t1.Add\n\t2.Insert\n\t3.Delete\n\t4.Update\n\t5.Display\n\t6.Sort\n\t7.Search\n\t8.Exit");
            System.out.print("Please Choose=");
            n=cin.nextInt();
            switch (n){
                case 1:
                    add();
                    break;
                case 2:
                    insert();
                    break;
                case 3:
                    delete();
                    break;   
                case 4:
                    update();
                    break; 
                case 5:
                    display();
                    break;
                case 6:
                    sort();
                    break;
                case 7:
                    search();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    break OUTER;
            }
        } while (n<=7);
    }
    
}
