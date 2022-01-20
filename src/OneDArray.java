import java.util.Scanner;

public class OneDArray {
    public static int linearSearch(int[] arr, int f){
        int count = 0;
        for(int e: arr){
            if(e==f){
                return count;
            }
            count++;
        }
        return -1;
    }

    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int[] arr= new int[a];
        for(int i = 0; i<a; i++){
            arr[i] = input.nextInt();
        }
        int f = input.nextInt();
        System.out.println(linearSearch(arr,f));
    }
}
