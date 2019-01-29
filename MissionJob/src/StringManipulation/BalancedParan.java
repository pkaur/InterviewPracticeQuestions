package StringManipulation;

public class BalancedParan {

    static class Stack {

        int top = -1;
        char items[] = new char[100];

        void push(char x) {

            if (top == 99) {
                System.out.println("Stack full");
            } else {
                items[++top] = x;
            }
        }

        char pop() {
            if (top == -1) {
                System.out.println("Stack underflow");
                return '\0';
            } else {
                return items[top--];
            }
        }

        boolean isEmpty() {

            return top == -1 ? true : false;
        }
    }

    static boolean isMatchingPair(char character1, char character2) {

        if (character1 == '(' && character2 == ')') {
            return true;
        } else if (character1 == '{' && character2 == '}') {
            return true;
        } else if (character1 == '[' && character2 == ']') {
            return true;
        } else
            return false;
    }

    static boolean isBalanced(char exp[]) {

        Stack st = new Stack();
        for (int i = 0; i < exp.length; i++) {

            if (exp[i] == '(' || exp[i] == '{' || exp[i] == '[') {
                st.push(exp[i]);
            }

            if (exp[i] == ')' || exp[i] == '}' || exp[i] == ']') {

                if (st.isEmpty()) {
                    return false;
                }
                if (!isMatchingPair(st.pop(), exp[i])) {
                    return false;
                }
            }
        }

        if (st.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
public static void main(String args[]){

        String str = "{{}{)))))))";
        String str1 ="{{(())}}]";
        String str2 ="{{(())}}";
        String str3 ="{({[()]})}";
        String str4 ="{{([()]})}";

        System.out.println(isBalanced(str.toCharArray()));
        System.out.println(isBalanced(str1.toCharArray()));
        System.out.println(isBalanced(str2.toCharArray()));
        System.out.println(isBalanced(str3.toCharArray()));
        System.out.println(isBalanced(str4.toCharArray()));
}

}
