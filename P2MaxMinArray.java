import java.util.*;
public class P2MaxMinArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
        int s=0;
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        int max=a[0];
        int min=a[4];
        for(int i=0;i<5;i++){
            if(a[i]>max)
            max=a[i];
            if(a[i]<min)
            min=a[i];
        }
        System.out.println("max="+max);
         System.out.println("min="+min);
    }
}

