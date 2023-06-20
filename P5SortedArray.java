import java.util.*;

public class P5SortedArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
        System.out.println("enter the required sum:");

        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("array in soreted order");
       Arrays.sort(a);
       for(int i=0;i<5;i++){
             System.out.println(a[i]);
        }
}
}

