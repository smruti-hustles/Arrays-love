import java.util.*;
class P1sumofelements{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
        int s=0;
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            s+=a[i];
        }
        System.out.println(s);
    }
}