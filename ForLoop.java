import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Type in num: ");
        int number = Integer.parseInt(input.nextLine());

        System.out.println(numToCheck(number));
        input.close();
    }
    public static int numToCheck(int num)
    {
        int numResult = 0;
        for (int i = num; i > 0; i--){
            numResult = num[i];
        }
        return numResult;
    }
}
