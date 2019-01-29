package Arrays;

public class AddWithoutPlus {

    public static int add(int a, int b)
    {
        if(a > b){
            int temp = a;
            a = b;
            b = temp;
        }
        while(a > 0) { --a; ++b; };
        while(a < 0) { ++a; --b; };
        return b;
    }

    public static void main(String[] args)
    {
        System.out.printf("5 + 6 = %d\n",add(5,6));
        System.out.printf("5 - 6 = %d\n",add(5,-6));
        System.out.printf("-5 + 6 = %d\n",add(-5,6));
        System.out.printf("-5 + -6 = %d\n",add(-5,-6));

    }
}
