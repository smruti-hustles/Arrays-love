import java.util.Scanner;

public class P3LinearSearch {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
        int x=sc.nextInt();
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
           if(x==a[i])
           System.out.println("element is at index="+i);
          
        }
        
    }
}
