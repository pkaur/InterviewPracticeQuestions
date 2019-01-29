package HackerRank;

public class AddBinartStrings {

    public static String addBinary(String a, String b) {

        int x= Integer.valueOf(a);
        int y= Integer.valueOf(b);

        while(y!=0){

            int carry = x&y;

            x=x^y;
            y=carry<<1;
        }

        return Integer.toString(x);
    }

    public static void main(String[] args){

        System.out.println(addBinary("11","1"));
    }
}
