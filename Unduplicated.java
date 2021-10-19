/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unduplicated;
import java.util.*;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author LOTHIN
 */
public class Unduplicated {
    public static void main(String[] args){
        Scanner cin =new Scanner(System.in);
        System.out.print("Enter Number=");
        int n=cin.nextInt();
        List<Integer> arr;
        arr=(List<Integer>) new ArrayList();
        for(int i=0;i<n;i++){
            System.out.print("Array["+i+"]=");
            int temp=cin.nextInt();
            if(arr.contains(temp)){
                i--;
                continue;
                
            }
            arr.add(temp);
        }
        System.out.println("All Array:");
        for(int i=0;i<arr.size();i++){
            System.out.println("Array["+i+"]="+arr.get(i));
        }
    }
}
