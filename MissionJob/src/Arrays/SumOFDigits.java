package Arrays;

public class SumOFDigits {

    static int n, sum=0;
    public static int calcSum(int a){

        while(a >0){

            sum = sum+a%10;
            System.out.println("sum === " + sum);
            a = a/10;
            System.out.println("a === " + a);
        }

        return sum;
    }

    public static int stringSum(int a){

        String st = Integer.toString(a);

        char[] ch = st.toCharArray();
        int sum=0;

        for(int i=0; i<ch.length;i++){
            sum = sum+ Character.getNumericValue(st.charAt(i));
        }

        return sum;

    }

    public static void main(String[] a){

        System.out.println(SumOFDigits.calcSum(456));
        System.out.println(SumOFDigits.stringSum(456));
    }
}
