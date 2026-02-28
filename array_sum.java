import java.util.*;
class array_sum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("Sum of the elements in array: "+sum);
       
        
    }
}