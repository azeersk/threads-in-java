import javax.sound.sampled.Line;
import java.util.Scanner;

public class Linear_Search {
    //linear search algorithm
    public static int linearSearch(int[] a, int s){
        int count = 0;
        for(int e: a){
            if (e==s){
                System.out.println(s+" possession is "+ count);
                return e;
            }
            count++;
        }
        return -1;
    }
}
class LinearImp{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] a = new int[10];
        for(int i=0; i<10; i++){
            a[i] = i*5;
        }
        Linear_Search obj = new Linear_Search();
        int s = input.nextInt();
        int result = obj.linearSearch(a,s);

        if (result == s){
            System.out.println(s + " is found!!");
        }
        else if(result == -1){
            System.out.println(s + "is not found!!");
        }
    }
}
