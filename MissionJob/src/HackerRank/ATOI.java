package HackerRank;

public class ATOI {

    public static int atoi(String str) {

            boolean neg = false; // flag to mark if the converted integer positive or negative.

            // check if the string is null or empty
            if (str == null || str.isEmpty()) return 0;

            // trim the leading white spaces
            str = str.trim();

            // check if the string contains white spaces only
            if (str.isEmpty()) return 0;

            int i = 0;

            // check the sign position
            if (isNeg(str.charAt(0))) {
                neg = true;
                i++;
            } else if (isPos(str.charAt(0))) {
                neg = false;
                i++;
            }

            // calcuate the integer value of the digital string
            long result = 0;
            while (i < str.length() && i <= 11 && Character.isDigit(str.charAt(i))) {
                result *= 10;
                result += str.charAt(i) - '0';
                i++;
            }

            // check the sign flag
            if (neg) result = -result;

            // handle overflow
            if (result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (result < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            return (int) result;
        }

        // check if the sign is negative
        private static boolean isNeg ( char ch){
            return ch == '-';
        }

        // check if the sign is positive
        private static boolean isPos ( char ch){
            return ch == '+';
        }

        public static void main(String[] args){

        System.out.println(atoi("       -42"));
        System.out.println(atoi("       -42 words"));
        System.out.println(atoi("4193 with words"));
        System.out.println(atoi("with words 1234" ));
        System.out.println(atoi(".test me 1234" ));
        }
    }

