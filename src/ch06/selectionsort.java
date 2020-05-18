package ch06;
import java.util.Arrays;
import java.util.Scanner;
public class selectionsort {
    public static void selectionsort (int array[]){
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
        
        System.out.println("before selection sort");
        for (int i:array){
        System.out.print(i+" ");
        }
        System.out.println();
        selectionsort(array);
        //sortir array using selection sort

        System.out.println("sortir selection sort");
        for(int i:array){
        System.out.print(i+" ");
        }
    }
}
