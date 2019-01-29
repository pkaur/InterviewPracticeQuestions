package HackerRank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BalancedParan {

        // Complete the isBalanced function below.
        static String isBalanced(String s) {

            Stack st = new Stack();
            String result= "YES";
            char[] chArr = s.toCharArray();
            for (int i=0; i<chArr.length; i++){
                if(chArr[i]=='{' || chArr[i]=='(' || chArr[i] == '['){
                    st.push(chArr[i]);
                }else if(chArr[i]=='}' || chArr[i]==')' || chArr[i] == ']'){

                    if(st.isEmpty()){
                        result ="NO";
                        return result;
                    }
                    if(!hasMatchingParenthese(chArr[i], (Character)st.pop())){
                        result = "NO";
                        return result;
                    }
                }
            }

            if(st.isEmpty()){
                result="YES";
                return result;
            } else{
                result = "NO";
                return result;
            }
        }

        static boolean hasMatchingParenthese(char c1, char c2){

            if(c1 == '{' && c2 =='}'){
                return true;
            } else if(c1 == '[' && c2 ==']'){
                return true;
            } else if (c1 == '(' && c2 == ')') {
                return true;
            } else {
                return false;
            }
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            int t = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int tItr = 0; tItr < t; tItr++) {
                String s = scanner.nextLine();

                System.out.println(isBalanced(s));
            }


            scanner.close();
        }
    }

