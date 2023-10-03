import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);


        System.out.println("Type in num: ");
        int number = Integer.parseInt(input.nextLine());
        input.close();

        for(int i = number; i>= 0; i--)
        {
             System.out.println(i);
        }
    }
}
