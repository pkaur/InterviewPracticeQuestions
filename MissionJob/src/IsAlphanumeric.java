
import java.util.regex.Pattern;
public class IsAlphanumeric {

        private static Pattern p = Pattern.compile("^[a-zA-Z0-9]*$");

        public static boolean isAlphaNumeric(String s) {
            return p.matcher(s).find();
        }

        public static void main(String[] args)
        {
            String s = "ABc12";
            System.out.println("IsAlphaNumeric: " + isAlphaNumeric(s));
        }
    }

