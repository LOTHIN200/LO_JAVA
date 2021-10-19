/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array2Doption;
import java.util.Scanner;

/**
 *
 * @author LOTHIN
 */
public class A2Doption {
    public static void main(String[] args){
        Scanner cin =new Scanner(System.in);
        int r,c,max=0,total=0;
        
        System.out.print("Enter Row:");
        r=cin.nextInt();
        int [][]a =new int[r][];
        for(int i=0;i<r;i++){
            System.out.print("Enter Row For Column"+(i+1)+":");
            c=cin.nextInt();
            a[i]=new int[c];
            if(max<c)
                max=c;
        }
        for(int i=0;i<r;i++){
            
            System.out.println("Row"+(i+1)+"");
            for(int j=0;j<a[i].length;j++){
                System.out.print("Enter a["+i+"]["+j+"]:");
                
                a[i][j]=cin.nextInt();
                // total +=a[i][j];
            }
        }
        for(int i=0;i<r;i++){
            int totalR=0;
            for(int j=0;j<max;j++){
                if(j<a[i].length){
                    totalR+=a[i][j];
                   System.out.print(a[i][j]+"\t"); 
                }
                else
                    System.out.print("\t");
                
            } 
            System.out.println(totalR);
            // total+=totalR;
        }
        for(int j=0;j<max;j++){
            int totalC=0;
            for(int i=0;i<r;i++){
                if(j<a[i].length)
                    totalC+=a[i][j];
            }  
            System.out.print(totalC+"\t");
            total+=totalC;
        }
        System.out.print(total);
    }  
}
