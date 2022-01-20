import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class SmallNLarge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<a; i++){
            int b = input.nextInt();
            arr.add(b);
        }
        Collections.sort(arr);
        System.out.print(arr.get(0));
        System.out.print(" ");
        System.out.print(arr.get(arr.size()-1));
    }
}