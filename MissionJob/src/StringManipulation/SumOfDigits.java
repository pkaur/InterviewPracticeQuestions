package StringManipulation;

public class SumOfDigits {

    public static int sum (int x){

        int sum=0;

        while (x>0){

            sum += x%10;
            x /= 10;
        }
        return sum;
    }

    public static int DigitSum(int num)
    {
        int sum = 0;
        while (num > 0)
        {
            sum += num % 10;
            num /= 10;
        }
        if (sum > 9)
        {
            sum = DigitSum(sum);
        }
        return sum;
    }

    public static void main(String[] args){

        System.out.println("Sum of digits is " + sum(65666));
        System.out.println("Sum of digits is " + DigitSum(65666));
    }
}
