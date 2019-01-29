public class EqualOperator {

    public static boolean isEqual(int num1, int num2){

        if((num1^num2) != 0){
            return false;
        } else
        {
            return true;
        }
    }

    public static void main(String[] args){

        System.out.println(isEqual(123, 123));
    }
}
