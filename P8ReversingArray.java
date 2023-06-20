/*Here our main idea is that an array is given we have to reverse it.
 * SO i am taking a new array of size same as that of the original array 
 * and keeping first ele of first array at the last place of second array,
 *  2nd ele of first ary at 2nd last position of the 2nd array and so on...
 */
import java.util.*;
public class P8ReversingArray {
    
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
             System.out.println("enter the size of the array");
            int[] a=new int[n];
            int[] b=new int[n];
            System.out.println("enter array elements");
            
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
    
            //Reversing the array:
           
            int j=n;
            for(int i=0;i<n;i++){
                b[j-1]=a[i];
                j=j-1;  //here we are swapping the last and the first
                     //again last second with second and so on
            }
            System.out.println("Reversed array is:");
            for(int k=0;k<n;k++){
                System.out.println(b[k]);
            }


    }
}
