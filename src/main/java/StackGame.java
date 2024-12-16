import java.util.Scanner;
import java.util.Stack;

public class StackGame {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        Scanner scanner = new Scanner(System.in);

        while(!stack.isEmpty()) {
            System.out.println("1 : push a element");
            System.out.println("2 : pop a element");
            System.out.println("3 : display the stack");
            System.out.println("4 : exit game");

            System.out.println("\nChoose an option: ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter an integer: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    System.out.println("Current stack: " + stack);
                    break;
                case 2:
                    if(!stack.isEmpty()) {
                        int popped = stack.pop();
                        System.out.println("Element popped: " + popped);
                    }else {
                        System.out.println("Current stack is empty");
                    }
                    System.out.println("Current stack: " + stack);
                    break;
                case 3:
                    System.out.println("Current stack: " + stack);
                    break;
                case 4:
                    System.out.println("Exit the game");
                    scanner.close();
                    return;
            }
        }
        System.out.println("Game over");
        scanner.close();
    }
}
