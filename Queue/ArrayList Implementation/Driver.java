import java.util.Scanner;

class Driver {
    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);
        QueueAL dataStructure = new QueueAL();
        int choice, userInput;
        Boolean Continue = true;
        System.out.println("MENU DRIVEN QUEUE");
        while (Continue) {
            System.out.print(
                    "\n1) Enqueue\n2) Dequeue\n3) Traverse\n4) Get Size\n5) Check if empty\n6) Exit\n\n Your CHOICE: ");
            choice = in.nextInt();
            switch (choice) {
            case 1:
                System.out.print("Enter element to add: ");
                userInput = in.nextInt();
                dataStructure.enqueue(userInput);
                break;
            case 2:
                System.out.println("Removed element: " + dataStructure.dequeue());
                dataStructure.traverse();
                break;
            case 3:
                dataStructure.traverse();
                break;
            case 4:
                System.out.println("Size of data structure: " + dataStructure.getSize());
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