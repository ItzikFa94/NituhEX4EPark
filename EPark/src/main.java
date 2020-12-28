import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean run = true;
        int option;
        while(run)
        {
            printMenu();
            option = in.nextInt();
            switch (option){
            case 1:
                System.out.println('1');
                break;
            case 2:
                System.out.println('2');
                break;
            case 3:
                System.out.println('3');
                break;
            case 4:
                System.out.println("Exiting system...");
                run = false;
                break;
            default:
                System.out.println("Invalid option");
                break;
            }

        }
    }

    public static void printMenu() {
        System.out.println("Welcome to E-Park!,\nPlease choose one of the following options by entering it's number:");
        System.out.println("\t1. Register Child");
        System.out.println("\t2. Manage Ticket");
        System.out.println("\t3. Exit Park");
        System.out.println("\t4. Exit");
    }

    public static void registerChild(){
        Scanner in = new Scanner(System.in);
        int option;
        System.out.println("Step 1: Guardian identification - Have you already signed up as guardian before? [Yes - 1 / No - 0]");
        option = in.nextInt();
        switch (option){
            case 1:

            default:
                System.out.println("Invalid option, back to main menu");
                return;
        }
    }
}
