import java.util.Scanner;

class Driver {
    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);
        LinearList dataStructure = new LinearList();
        int choice, userInput, position;
        Boolean Continue = true;
        System.out.println("MENU DRIVEN LINEARLIST");
        while (Continue) {
            System.out.print(
                    "\n1) Enter new Data Element\n2) Enter new Data Element at position\n3) Search for an Element\n4) Traverse the whole array\n5) Find element by position\n6) Remove elements from List\n7) Reverse the whole array\n8) Check if data structure is empty\n9) Get Size\n10) Exit\n\n Your CHOICE: ");
            choice = in.nextInt();
            switch (choice) {
            case 1:
                System.out.print("Enter element to add: ");
                userInput = in.nextInt();
                dataStructure.add(userInput);
                break;
            case 2:
                System.out.print("Enter element to add: ");
                userInput = in.nextInt();
                System.out.print("Enter position: ");
                position = in.nextInt();
                dataStructure.add(userInput, position);
                break;
            case 3:
                System.out.print("Enter element to Search: ");
                userInput = in.nextInt();
                dataStructure.search(userInput);
                break;
            case 4:
                dataStructure.traverse();
                break;
            case 5:
                System.out.print("Enter index to get Element: ");
                userInput = in.nextInt();
                System.out.println("Element at index " + userInput + " is " + dataStructure.getElementAt(userInput));
                break;
            case 6:
                System.out.print("Enter element to delete: ");
                userInput = in.nextInt();
                dataStructure.remove(userInput);
                break;
            case 7:
                dataStructure.reverse();
                break;
            case 8:
                if (dataStructure.isEmpty())
                    System.out.println("DataStructure is empty!");
                else
                    System.out.println("DataStructure is not empty!");
                break;
            case 9:
                System.out.println("Size of data structure is: " + dataStructure.size());
                break;
            case 10:
                Continue = false;
                break;
            default:
                System.out.println("Invalid Value! Enter 6 to exit!!");
            }
        }
        in.close();
    }
}