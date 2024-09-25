import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    ArrayList<Book> books = new ArrayList<Book>();
    boolean running = true;
    Scanner scanner = new Scanner(System.in);

    public void startLibrary() {
        while (running) {
            System.out.println("Welcome to the library.");
            System.out.println("Please enter an option: ");
            System.out.println("1. Register");
            System.out.println("2. Loan book");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("1. Register");
                    break;

                case 2:
                    System.out.println("2. Loan book");
                    break;

                    case 3:
                        System.out.println("3. Exit");
                        running = false;

                default:
                    System.out.println("Invalid option");
            }
        }
        scanner.close();
        System.out.println("Thank you for using Library!");
    }

}
