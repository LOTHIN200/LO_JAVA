/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mothod;

import java.util.Scanner;

public class mothod_add_dis{

   
    static Scanner cin=new Scanner(System.in);
    static int k=0;
    static int a[]=new int[100];
    public static void add(){
       
       
        System.out.print("A["+k+"]=");
        a[k]=cin.nextInt();
        System.out.println("Data Add");
        k++;
    }
    public static void display(){
        for(int j=0;j<k;j++){
            System.out.println("a["+j+"]="+a[j]);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        OUTER:
        do {
            System.out.println("Aarray Operator:1-8");
            System.out.print("Please Choose=");
            n=cin.nextInt();
            switch (n) {
                case 1:
                    add();
                    break;
                case 5:
                    display();
                    break;
                case 8:
                    System.exit(0);
                default:
                    break OUTER;
            }
        } while (n<=7);
      
    }
    
}
