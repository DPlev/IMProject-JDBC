import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== -MENU- =====");
            System.out.println("1. View Equipment");
            System.out.println("2. View Borrow Records");
            System.out.println("3. View Unreturned");
            System.out.println("4. View Users");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            //testestest
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    ViewEquipment.show();
                    break;
                case 2:
                    ViewBorrowRecords.show();
                    break;
                case 3:
                    ViewUnreturned.show();
                    break;
                case 4:
                    ViewUsers.show();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid!");
            }
        }
    }
}