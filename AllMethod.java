/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mothods;

import java.util.Scanner;
public class AllMethod{

   
    static Scanner cin=new Scanner(System.in);
    static int k=0;
    static int a[]=new int[100];
    public static void add(){
        System.out.print("A["+k+"]=");
        a[k]=cin.nextInt();
        k++;
        System.out.println("Data Added");
    }
    
    
    public static void insert(int index,int a[]){
        
        
        System.out.print("Input Index to Insert:");
        index=cin.nextInt();
        for(int j=k;j>=index;j--){
          a[j+1]=a[j];
          System.out.print("Insert New Number:");
          a[index]=cin.nextInt();
          k++; 
        }
        System.out.println("Data Inserted");
    } 
    public static void delete(int a[]){  
          
    
         int index =0;
         System.out.print("Input Index To Delete:");
         index=cin.nextInt();
         for(int j=index;j<k;j++){
           a[j]=a[j+1];
           k--;
         }
         System.out.println("Data Deleted");
    }
     public static void update(){  
          
         int index =0;
         System.out.print("Input Index To Update:");
         index=cin.nextInt();
         System.out.print("Input New Number:");
         a[index]=cin.nextInt();
         System.out.println("Data Updated");
        
    }
    
    
    public static void display(){
        System.out.println("Display Data:");
        for(int j=0;j<k;j++){
            System.out.println("a["+j+"]="+a[j]);
        }
    }
    
    public static void sort(int i,int a[]){
        for(int j=0;j<i-1;j++) {
            for(int c=j+1;c<i;c++){
                if(a[j]>a[c]){
                int temp=a[j];
                a[j]=a[c];
                a[c]=temp;
                }
            }   
       }
      System.out.println("Data Sorted");
    }
    
    public static void search(){
        boolean t=false;
                    System.out.print("Search:");
                    int search=cin.nextInt();
                    for(int j=0;j<=k;j++)
                    {
                        if(a[j]==search)
                        {
                            t=true;
                            break;
                        }
                    }
                    if(t==true)
                        System.out.println("Found");
                    else
                        System.out.println("Not Found");
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        OUTER:
        do {
            System.out.println("Aarray Operator:1-8");
            System.out.print("Please Choose=");
            n=cin.nextInt();
            switch (n){
                case 1:
                    add();
                    break;
                case 2:
                {
                    int index;
                    insert(index=0,a);
                }
                    break;

                case 3:
                    delete(a);
                    break;   
                case 4:
                   update();
                    break; 
                case 5:
                    display();
                    break;
                case 6:
                    sort(k,a);
                    break;
                case 7:
                    search();
                    break;
                default:
                    break OUTER;
            }
        } while (n<=7);
      
    }
    
}