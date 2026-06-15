import java.util.Collections;
import java.util.HashSet;
class removeduplicates{
    public static void duplicates(int[] arr,int n){
        HashSet<Integer> hash=new HashSet<>();
        for(int i=0;i<n;i++){
            hash.add(arr[i]);
        }
        System.out.println(hash);
    }


    public static void main(String[] args){
        int[] arr={1,2,3,4,5,4,5,6,7,6,7};
        int n=arr.length;
        duplicates(arr, n);

    }

}
