import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        System.out.println("Type in num: ");
        int takeUserInput = Integer.parseInt(input.nextLine());

        switch (takeUserInput)
        {
            case 0: {
                System.out.println("abc");
                break;
            }
            case 1: {
                System.out.println("def");
                break;
            }
            case 2: {
                System.out.println("ghi");
                break;
            }
            case 3: {
                System.out.println("jkl");
                break;
            }
            default:
                System.out.println("Error. Please confirm input");

        }
        input.close();
    }


}
