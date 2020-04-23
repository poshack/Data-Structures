import java.util.Scanner;

class Driver {
    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);
        OrderedList dataStructure = new OrderedList();
        int choice, userInput;
        Boolean Continue = true;
        System.out.println("MENU DRIVEN ORDEREDLIST");
        while (Continue) {
            System.out.print(
                    "\n1) Enter new Data Element\n2) Search for an Element\n3) Traverse the whole array\n4) Find element by position\n5) Check if array is empty\n6) Exit\n\n Your CHOICE: ");
            choice = in.nextInt();
            switch (choice) {
            case 1:
                System.out.print("Enter element to add: ");
                userInput = in.nextInt();
                dataStructure.add(userInput);
                break;
            case 2:
                System.out.print("Enter element to Search: ");
                userInput = in.nextInt();
                if (!dataStructure.search(userInput))
                    System.out.println("Element " + userInput + " not found!");
                break;
            case 3:
                dataStructure.traverse();
                break;
            case 4:
                System.out.print("Enter index to get Element: ");
                userInput = in.nextInt();
                System.out.println("Element at index " + userInput + " is " + dataStructure.getElementAt(userInput));
                break;
            case 5:
                if (dataStructure.isEmpty())
                    System.out.println("DataStructure is empty!");
                else
                    System.out.println("DataStructure is not empty!");
                break;
            case 6:
                Continue = false;
                break;
            default:
                System.out.println("Invalid Value! Enter 6 to exit!!");
            }
        }
        in.close();
    }
}