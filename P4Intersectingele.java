import java.util.Scanner;

public class P4Intersectingele{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
        int[] b=new int[5];
        System.out.println("first");
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("sec");
        for(int j=0;j<5;j++){
            b[j]=sc.nextInt();
        }
        System.out.println("intersection:");
       for(int i = 0; i<a.length; i++ ) {
         for(int j = 0; j<b.length; j++) {
            if(a[i]==b[j]) {
               System.out.println(b[j]);
             }
        }
          
        }
        
    }
}