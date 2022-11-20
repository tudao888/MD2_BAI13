package LuyenTapStack;

import java.util.Scanner;
import java.util.Stack;

public class MyStack {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        System.out.println("Nhập vào biểu thức: ");
        String test = scanner.nextLine();
        for (int i = 0; i < test.length(); i++) {
            if (test.charAt(i) == ')') {
                stack.push('(');
            } else if (test.charAt(i) == ')') {
                if (stack.size() > 0 && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(')');
                }
            }
        }
        if (stack.size() == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}
