package StringManipulation;

public class reverseWordsInString {

    public static String reverseWords(String str) {

        StringBuffer sb = new StringBuffer();

        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {

            sb.append(Reverse.revStr(words[i])).append(" ");

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Reversed string is : " + reverseWordsInString.reverseWords("My name is puneet"));

    }
}
