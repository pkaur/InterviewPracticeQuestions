package StringManipulation;

public class ReplaceSpaces {


    public static String replaceSpaces(String str){


        String[] arr = str.split(" ");
        StringBuffer sb = new StringBuffer(arr[0]);

        for (int i =1 ; i<arr.length; i++) {

            sb.append("%20").append(arr[i]);

        }

        return sb.toString();
    }

    public static void main(String[] args){

        System.out.println(ReplaceSpaces.replaceSpaces("I am  p uneet kaur"));
    }
}
