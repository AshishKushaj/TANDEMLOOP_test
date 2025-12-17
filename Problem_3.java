import java.util.Scanner;

public class Problem_3 {
    
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);

        System.out.println("Enter the value of x");
        int x=ob.nextInt();
        x = x%2==0?x-1:x;

        for(int i=1;i<x;i++)
            System.out.print(i*2-1 +",");

        System.out.println(x*2-1);

        ob.close();
    }
}
