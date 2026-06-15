
public class secondlargest {
    public static void main(String args[]){
        int[] arr={2,2,2,2,3,3,3,3,4,4,4,5,5};
        int max1=0;
        int max2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[0]>arr[1]){
                max1=arr[0];
                max2=arr[1];
            }
            else{
                max1=arr[1];
                max2=arr[0];
            }
        }
        for(int i=2;i<arr.length;i++){
            if(arr[i]>max1){
                max2=max1;
            max1=arr[i];
        }
            else if(arr[i]>max2&&arr[i]!=max1){
                max2=arr[i];
    }
        }
        System.out.println(max2);

    }
    

    }
    

