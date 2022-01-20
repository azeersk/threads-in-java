import java.util.Scanner;

public class trianglePattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int count = 0;
        for(int i=0; i<a*2; i++){

            if (i%2!=0){
                System.out.println(" ".repeat((a-1)-count) + "*".repeat(i)+" ");
                count = count + 1;
            }
        }
    }
}
