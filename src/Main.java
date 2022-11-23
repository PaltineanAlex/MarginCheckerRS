import java.util.Scanner;

public class Main {
    private static Utils util = new Utils();
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int option, i = 0;
        boolean isRunning = true;
        ItemList items = new ItemList();
        util.welcomeMessage();

        while (isRunning) {
            util.printOptions();
            option = input.nextInt();
            switch (option) {
                case 0 -> {
                    System.out.println("Exiting program...");
                    isRunning = false;
                }
                case 1 -> items.printList();
                case 2 -> {
                    System.out.println("Enter the item price: ");
                    double price = input.nextDouble();
                    input.nextLine();
                    System.out.println("Enter the item name: ");
                    String name = input.nextLine();
                    items.addItem(new RunescapeItem(++i, name, price));
                }
                case 3 -> {
                    System.out.println("Which item do you want to remove? ");
                    int itemId = input.nextInt();
                    items.removeItem(itemId);
                }
            }
        }
    }
}
