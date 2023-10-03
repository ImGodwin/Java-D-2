import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter new word: :q");
        String userInput = input.nextLine();

        do {

            String[] comma = userInput.split("");
            System.out.println(String.join(",", comma));

        }while(!userInput.contains(":q"));

        input.close();
        System.out.println("Exit");
    }

}
