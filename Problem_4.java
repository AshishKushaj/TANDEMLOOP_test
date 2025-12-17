import java.util.Scanner;

public class Problem_4 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);

        System.out.println("Enter entire list");
        String input = ob.nextLine()
                .replace("[", "")
                .replace("]", "")
                .replace(",", " ");


        String[] parts = input.trim().split(" ");
        int[] arr = new int[parts.length];

        for (int i = 0; i < parts.length; i++) 
            arr[i] = Integer.parseInt(parts[i]);
        

        int[]count=new int[9];
        for(int i=1;i<=9;i++)
            for(int j:arr)
                if(j%i==0) count[i-1]++;

        System.out.print("{ ");

        for(int i=1;i<9;i++)
            System.out.print(i+": "+count[i-1]+", ");
        System.out.print(9+": "+count[8]);

        System.out.print(" }");

        ob.close();
    }
}
