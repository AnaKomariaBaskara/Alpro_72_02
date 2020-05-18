package ch06;
import java.util.Arrays;
import java.util.Scanner;
public class insertionsort {
    public static void insertionsort (int array[]){
        int n = array.length;
        for (int j = 1;j<n;j++) {
            int key = array [j];
            int i=j-1;
            while ((i>-1)&&(array[i]>key)){
                array[i+1] = array[i];
                i--;
            }
            array[i+1]=key;
        }
    }
    public static void main (String a[]){
        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
                System.out.println("before insertion sort");
                for (int i:array){
                    System.out.println(i+"");
                }
                System.out.println();
                insertionsort(array);
                //sortir array using insertion sort
                
                System.out.println("after insertion sort");
                for(int i:array){
                    System.out.print(i+" ");
                }
    }
}