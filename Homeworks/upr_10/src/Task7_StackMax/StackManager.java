package Task7_StackMax;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class StackManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> stack = new ArrayDeque<Integer>();
        String task = " ";

        mainLoop:
        while (true) {
            task = sc.next().toLowerCase();

            switch (task) {

                case "end":
                    printStack(stack);
                    break mainLoop;
                case "push":
                    stack.push(sc.nextInt());
                    break;
                case "pop":
                    System.out.println(stack.pop());
                    break;
                case "max":
                    System.out.println(findMax(stack));
                    break;
                default:
                    System.out.println("Invalid command! ");
                    break;
            }
        }
    }

    private static Integer findMax(Deque<Integer> stack){
        Deque<Integer> stackCopy = new ArrayDeque<Integer>(stack);
        int max = Integer.MIN_VALUE;
        while(!stackCopy.isEmpty()){
            max = Math.max(stackCopy.pop(), max);
        }
        return max;
    }

    private static void printStack(Deque<Integer> stack){

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

}
