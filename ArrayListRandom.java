/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomValue;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author LOTHIN
 */
public class ArrayListRandom{
    public static void main(String[] args){
        Scanner cin =new Scanner(System.in);
        int n;
        System.out.print("Enter Number:");
        n=cin.nextInt();
        Random r = new Random();
        List<Integer> arr=new ArrayList<>();
        int []a=new int[n];
        for(int i=1;i<=n;i++){
            arr.add(i);
        }
        for(int i=0;i<n;i++){
            int index;
            index = r.nextInt(arr.size());
            a[i]=arr.get(index);
            arr.remove(index);
        }
        System.out.println("Random Result:");
        for(int i=0;i<a.length;i++){
            System.out.println("Array["+i+"]="+a[i]);
        }

    }
}