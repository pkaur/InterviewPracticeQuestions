public class ImplementPlusOperator {

    public static boolean isInteger(String input){

        try{

            Integer.parseInt(input);
            return true;

        } catch (Exception e){

            return false;
        }
    }

    public static String calculateSum(String a, String b){

        StringBuilder sb = new StringBuilder();
        if(a == null && b == null){
            return null;
        }

        if(isInteger(a) && isInteger(b)){

            int num1 = Integer.valueOf(a);
            int num2 = Integer.valueOf(b);

            while(num2 != 0){

                int carry = num1&num2;
                num1=num1^num2;
                num2=carry << 1;
            }

            return String.valueOf(num1);

        } else {

            for(int i=0; i<a.length(); i++){
                sb.append(a.charAt(i));
            }

            for(int i=0; i<b.length(); i++){
                sb.append(b.charAt(i));
            }
        }

        return  sb.toString();
    }

    public static void main(String[] args){

        System.out.println("sum ===== " + calculateSum("abc","edf"));
        System.out.println("sum ===== " + calculateSum("abc","123"));
        System.out.println("sum ===== " + calculateSum("4","67"));
        System.out.println("sum ===== " + calculateSum("12","1"));
        System.out.println("sum ===== " + calculateSum("$^%","edf"));
        System.out.println("sum ===== " + calculateSum("","edf"));
        System.out.println("sum ===== " + calculateSum("",""));
        System.out.println("sum ===== " + calculateSum(null,null));
    }
}
