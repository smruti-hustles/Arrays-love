/*
 * In this question we have check whether 
 * sum of 2 array ele is equal to the given number or not 
 */
import java.util.*;

public class P7triplesumexits {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("enter the required sum:");
        int x=sc.nextInt();
        int flag=0;
    
         System.out.println("enter the array ele:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
       for(int i=0;i<n-2;i++){
         for(int j=i+1;j<n-1;j++){
            for(int k=i+2;k<n;k++){
       if(a[i]+a[j]+a[k]==x){
        flag=1;
        break;
       }
       }
       }
    }
      if(flag==1){
           System.out.println("Yes sum exists"); 
        }
        else{
            System.out.println("No sum does not exists");  
        }
    }
}


    

