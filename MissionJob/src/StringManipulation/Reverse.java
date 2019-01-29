package StringManipulation;

public class Reverse {

    public static String revStr(String s){

        StringBuffer sb = new StringBuffer();

        if(s.length() ==0 ){
            return "";
        }
        if (s==null){
            return "String passed is null";
        }
        for(int i=s.length()-1; i>=0; i--){

            sb.append(s.charAt(i));
        }

        return sb.toString();
    }

    public static void main(String[] args){

        System.out.println("Reversed string is : " + revStr("abc"));
        System.out.println("Reversed string is : " + revStr("puneet"));
        System.out.println("Reversed string is : " + revStr(""));
        System.out.println("Reversed string is : " + revStr(""));
    }
}
