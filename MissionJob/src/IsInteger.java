public class IsInteger {

    public static boolean isInteger( String input )
    {
        try
        {
            Integer.parseInt( input );
            return true;
        }
        catch( Exception e)
        {
            return false;
        }
    }

    public static void main(String[] args){

        System.out.println(isInteger("abcd"));
        System.out.println(isInteger("1234"));
        System.out.println(isInteger("12ghj"));
        System.out.println(isInteger("gfhhf%%%"));
        System.out.println(isInteger("124^&%&"));
    }
}
