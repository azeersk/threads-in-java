import java.util.Arrays;
import java.util.Scanner;

public class binaryClass {
    //binary search
    static int binarySearch(int []arr, int l, int r, int f){
        try{
            if(r>=l){
                int mid = l+(r-l)/2;
                if(arr[mid]==f){
                    return arr[mid];
                }
                if(arr[mid]>f){
                    return binarySearch(arr,l,mid-1,f);
                }
                return binarySearch(arr,mid+1,r,f);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        int f = input.nextInt();
        for(int i=1; i<10; i++){
            arr[i] = i*4;
        }
        int lower = 0;
        int upper = arr.length;
        int value = binarySearch(arr,lower,upper,f);

        if(value == f){
            System.out.println(f + " is found!!");
        }
        else{
            System.out.println(f + " is not found!!");
        }
    }
}
