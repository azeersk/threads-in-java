import java.util.ArrayList;
import java.util.Scanner;

public class binaryTwo {
    public static int binarySearchAlgo(ArrayList<Integer>arrList,int Start, int Final,int find ){
        if(Final>=Start) {
            int mid = arrList.size()/2;
            if(arrList.get(mid)==find){
                return find;
            }
            if(arrList.get(mid)>find){
                return binarySearchAlgo(arrList, Start ,mid-1, find);

            }
            return binarySearchAlgo(arrList, mid+1 , Final, find);
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=1; i<10; i++) {
            arrayList.add(i*2);
        }
        int Start = 0;
        int find = 12;
        int Final = arrayList.size();
        int result = binarySearchAlgo(arrayList, Start, Final,find);
        System.out.println(result);
    }
}