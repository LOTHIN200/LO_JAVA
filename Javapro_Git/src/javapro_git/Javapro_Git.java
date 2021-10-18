/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapro_git;
import java.util.*;
/**
 *
 * @author LOTHIN
 */
public class Javapro_Git {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n;
        int a[] =new int[100];
        int i=-1;
        do
        {
            System.out.println("\nArray Operator:\n");
            System.out.println("\t1.Add\n\t2.Insert\n\t3.Delete\n\t4.Update\n\t5.Display\n\t6.Sort\n\t7.Search\n\t8.Exit");
            System.out.print("Please Choose:");
            n=input.nextInt();
            int index;
            switch(n)
            {
                case 1: System.out.print("Array["+(++i)+"]=");
                    a[i]=input.nextInt();
                    System.out.println("Array Operator:\n");
                    break;
                case 2: System.out.print("Input Index to Insert:");
                    index=input.nextInt();
                    for(int j=i;j>=index;j--)
                        a[j+1]=a[j];
                    System.out.print("Insert New Number:");
                    a[index]=input.nextInt();
                    i++;
                    System.out.print("Data Inserted");
                    break;
                case 3: System.out.print("Input Index To Delete:");
                    index=input.nextInt();
                        for(int j=index;j<=i;j++)
                            a[j]=a[j+1];
                        i--;
                        System.out.print("Data Deleted");
                        break;
                case 4: System.out.print("Input Index To Update");
                    index=input.nextInt();
                    System.out.print("Input New Number:");
                    a[index]=input.nextInt();
                    System.out.print("Data Updated");
                    break;
                case 5: for(int j=0;j<=i;j++)
                    System.out.print(a[j]+"\t");
                    break;
                case 6: 
                    for(int j=0;j<i;j++)
                    {
                        for(int k=j+1;k<=i;k++)
                        {
                            if(a[j]>a[k])
                            {
                                int temp;
                                temp=a[j];
                                a[j]=a[k];
                                a[k]=temp;
                            }
                        }   
                    }
                    System.out.print("Data Sorted");
                    break;
                case 7:
                    boolean t=false;
                    System.out.print("Search:");
                    int search=input.nextInt();
                    for(int j=0;j<=i;j++)
                    {
                        if(a[j]==search)
                        {
                            t=true;
                            break;
                        }
                    }
                    if(t==true)
                        System.out.print("Found");
                    else
                        System.out.print("Not Found");
            }   
        }while(n<8);
    }
    
}
