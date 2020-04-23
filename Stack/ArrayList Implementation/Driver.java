import java.util.Scanner;

class Driver {
    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);
        Stack dataStructure = new Stack();
        int choice, userInput;
        Boolean Continue = true;
        System.out.println("\nMENU DRIVEN STACK");
        while (Continue) {
            System.out.print(
                    "\n\n1) Push to Stack\n2) Pop from Stack\n3) Traverse the Stack\n4) Get Size of Stack\n5) Check Stack is empty\n6) Exit\n\nYOUR CHOICE: ");
            choice = in.nextInt();
            switch (choice) {
            case 1:
                System.out.print("Enter element to push: ");
                userInput = in.nextInt();
                dataStructure.push(userInput);
                break;
            case 2:
                System.out.println("Popped element " + dataStructure.pop());
                dataStructure.traverse();
                break;
            case 3:
                dataStructure.traverse();
                break;
            case 4:
                System.out.print("Size of Stack is: " + dataStructure.getSize());
                break;
            case 5:
                System.out.print("Is the Stack Empty : " + dataStructure.isEmpty());
                break;
            case 6:
                Continue = false;
                break;
            default:
                System.out.print("Invalid Inpit !!");
            }
        }
        in.close();
    }
}