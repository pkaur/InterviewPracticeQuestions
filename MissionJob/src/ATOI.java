public class ATOI {

    public static int myAtoi(String str) {

        str=str.trim();
        double result=0;

        if(str.length()==0 || ((str.charAt(0) != '-' && str.charAt(0) != '+') &&!Character.isDigit(str.charAt(0)))) return 0;

        boolean flag = true;
        int i=0;
        if(str.charAt(i) == '-'){
            flag= false;
            i++;
        } else if (str.charAt(i) == '+'){
            i++;
        }


        for(int j=i; j<str.length(); j++){

            if(str.charAt(j) >='0' && str.charAt(j)<='9'){
                result = result*10 + (str.charAt(j)-'0'); // "2" - > 2 ("2"-"0") === 4*10 + 9
            }
        }

        if(!flag){
            result = -result;
        }

        if(result < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        } else if(result >Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }

        return (int)result;
    }

    public static void main(String[] args){

        System.out.println(myAtoi("-9128347233299999999999999999"));
        System.out.println(myAtoi(" 5"));
        System.out.println(myAtoi("90"));
        System.out.println(myAtoi(" abc"));
    }
}
