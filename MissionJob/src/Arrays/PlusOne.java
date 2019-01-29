package Arrays;

/*
Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.

 */
public class PlusOne {

    public static int[] plusOne(int[] digits) {
        int carry = 1;
        int length = digits.length;
        for(int i = (length - 1); i >=0; i--) {
            int curDigit = digits[i] + carry;
            if(curDigit >= 10) {
                digits[i] = curDigit % 10;
                carry = 1;
            } else {
                digits[i] = curDigit % 10;
                carry = 0;
            }
        }
        if(carry != 0) {
            int[] retArr = new int[length + 1];
            retArr[0] = 1;
            for(int j = 1; j < retArr.length; j++) {
                retArr[j] = digits[j-1];
            }
            return retArr;
        }
        return digits;
    }

    public static void main(String [] args){
        int[] a = {8,8,9,9};

        int[] newArray = plusOne(a);

        for(int i=0; i<newArray.length; i++){

            System.out.printf("%d ", newArray[i]);
        }
    }

}
