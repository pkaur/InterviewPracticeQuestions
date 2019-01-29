package HackerRank;

public class SubtractionWithoutSubtractOperator {

    public static int subtract(int x, int y){

        while(y!=0){

            int borrow = (~x)&y;
            x=x^y;

            y=borrow<<1;
        }

        return x;
    }

    public static void main(String args[]){

        System.out.println(subtract(29, 13));
        System.out.println(subtract(29, 39));
    }
}
